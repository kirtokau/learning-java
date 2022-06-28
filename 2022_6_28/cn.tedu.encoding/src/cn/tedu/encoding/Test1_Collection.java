package cn.tedu.encoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Test1_Collection {

	public static void main(String[] args) {
		// 创建collection接口对象
       //Collection c=new Collection();//报错,因为Collection是接口不能new 
       //<Integer>是泛型，用约束集合中的元素类型，只能写引用类型而不能是基本类型
		Collection <Integer> c=new ArrayList();
	  //常用方法
		c.add(100);//添加元素
		c.add(200);
		c.add(300);
		
		System.out.println(c);
		//c.clear();
		System.out.println(c.contains(300));//判断集合是否存在指定元素
		System.out.println(c.equals(100));//判断和100是否相等
		System.out.println(c.hashCode());//返回集合的哈希码值
		System.out.println(c.isEmpty());//判断集合是否为空
		System.out.println(c.remove(200));//判断是否成功删除集合中的元素
		System.out.println(c.size());//获取集合的长度/个数
		Object[] os=c.toArray();//把集合中的元素放入数组
		System.out.println(Arrays.toString(os));
		
		//集合间的操作
		Collection <Integer> c2=new ArrayList();
		c2.add(9);
		c2.add(8);
		c2.add(7);
		
		c.addAll(c2);//把c2加到c里
		System.out.println(c.containsAll(c2));//判断c中是否包含c2
		System.out.println(c.removeAll(c2));//删除c2
//		System.out.println(c.retainAll(c2));//删除c
		System.out.println(c2);
		
		//用来遍历/迭代集合中的元素Iteator<E> iteator()
		Iterator <Integer> it=c2.iterator();
		//通过Iterator迭代器，循环着获取集合中的元素
		while(it.hasNext()) {
			//hasNext()用来判断集合中是否有下个元素，有就返回true
			Integer inte=it.next();//next()获取迭代到的元素
			System.out.println(inte);
		}	
	}
}
