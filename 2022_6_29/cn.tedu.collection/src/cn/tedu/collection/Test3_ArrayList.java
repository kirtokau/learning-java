package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Test3_ArrayList {

	public static void main(String[] args) {
		//创建对象，使用了无参构造，底层会自动为你创建数组存放对象，并且数据的初始容量是10
		ArrayList<Integer>list=new ArrayList<>();
		//常用方法
		list.add(100);//添加元素
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(300);
		list.add(1,99);//在指定下标处添加元素
		System.out.println(list);
//		list.clear();//清空集合
		System.out.println(list.contains(500));//判断是否包含
		System.out.println(list.get(0));//根据下标获取元素
		System.out.println(list.indexOf(300));//获取指定元素第一次出现的下标
		System.out.println(list.lastIndexOf(300));//获取指定元素最后一次出现的下标
		System.out.println(list.isEmpty());//判断集合是否为空
		System.out.println(list.remove(1));//按照下标删除元素
		System.out.println(list);
		System.out.println(list.remove(Integer.valueOf(300)));//直接删除指定元素
		System.out.println(list.set(2,88));//置换元素
		System.out.println(list.size());//获取集合长度
		
		Object[]os=list.toArray();//集合转数组
		System.out.println(Arrays.toString(os));//查看数组中的元素
		
        //4种方式迭代ArrayList
		for(int i=0;i<list.size();i++) {
			//下标最大值是长度-1
			Integer in=list.get(i);//根据下标获取值
			System.out.println(in+"for");//打印值
		}
		for(Integer in:list) {
			System.out.println(in+"foreach");//打印遍历得到的数据
		}
		Iterator <Integer> it=list.iterator();
		while(it.hasNext()) {
			//判断有没有后一个元素
			Integer in=it.next();//获取最后一个元素
			System.out.println(in+"iterator");
		}
		ListIterator<Integer>it2=list.listIterator();
		while(it2.hasNext()) {
			//判断有没有最后一个元素
			Integer integer=it2.next();//获取后一个元素
			System.out.println(integer+"listIterator");
		}
	}
	
	

}
