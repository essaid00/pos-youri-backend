package com.ruoyi.pos.domain;

import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class PosCart extends BaseEntity {
	//购物车属性
	//购物项集合：Map的key就是商品pid，value：购物项
	private Map<Integer, PosCartItem> map = new LinkedHashMap<Integer, PosCartItem>();
	
	//Cart对象中有一个cartItems属性
	public Collection<PosCartItem> getCartItems(){
		return map.values();
	}

	//购物总计
	private float total;

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	//购物车的功能：
	//1.将购物项添加到购物车
	public void addCart(PosCartItem cartItem) {

		Integer pid = cartItem.getProduct().getPid();
		//判断购物车中是否已经存在该购物项
		if(map.containsKey(pid)){
			//存在，获得购物车中原来的购物项
			PosCartItem _carCartItem = map.get(pid);
			//原来的购物项的数量加上现在的购物项数量
			_carCartItem.setCount(_carCartItem.getCount()+cartItem.getCount());
		}else {
			map.put(pid, cartItem);
		}
		// 设置总计的值
		total += cartItem.getSubtotal();
	}
	
	// 2.从购物车移除购物项
	public void removeCart(Integer pid) {
		//将购物项移除购物车
		PosCartItem cartItem = map.remove(pid);
		total -= cartItem.getSubtotal();
	}
	
	//3.清空购物车
	public void clearCart() {
		//将所有购物项清空
		map.clear();
		//将总计设置为0
		total = 0;
	}
}
