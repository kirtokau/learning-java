package cn.tedu.collectiona;

import java.util.HashSet;
import java.util.Iterator;

public class Test6_HashSet {

	public static void main(String[] args) {
		// 创建HashSet对象
		HashSet<Integer>set=new HashSet();
		//常用方法
		set.add(100);
		set.add(200);
		set.add(300);
		
		set.add(200);
		set.add(300);
		System.out.println(set);
//		set.clear();
		System.out.println(set.contains(200));//判断是否包含
		System.out.println(set.isEmpty());//判断是否为空
		System.out.println(set.remove(100));//删除元素
		System.out.println(set.size());//获取长度
		
		//迭代set集合，Iterat<E> iterator()
		Iterator <Integer> it=set.iterator();
		while(it.hasNext()) {
			//判断有没有下一个元素
			Integer in=it.next();//获取遍历到的元素
			System.out.println(in);//打印
		}
	}
}
