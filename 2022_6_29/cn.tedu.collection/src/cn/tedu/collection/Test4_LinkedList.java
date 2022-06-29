package cn.tedu.collection;

import java.util.LinkedList;

//这个类用来测试LinkedList
public class Test4_LinkedList {

	public static void main(String[] args) {
		// 创建对象
		LinkedList<String>list=new LinkedList();
		//常用方法
		list.add("杰克");
		list.add("罗斯");
		list.add("奥特曼");
		list.add("蜘蛛侠");
		
		System.out.println(list);
		//TODO测试从COllection接口和List接口继承过来的共性方法
		//LinkedList特有方法
		list.addFirst("美队");//添加首元素
		list.addLast("钢铁侠");//添加尾元素
		System.out.println(list);
		
		System.out.println(list.getFirst());//获取首元素
		System.out.println(list.getLast());//获取尾元素
		System.out.println(list.removeFirst());//删除首元素
		System.out.println(list.removeLast());//删除尾元素
		

	}

}
