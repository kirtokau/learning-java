package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test2_List {
//这个类用来测试List接口
	public static void main(String[] args) {
		//创建LIst接口对象
		List <String> list=new ArrayList();
		//继承自Collection接口的方法
		list.add("jack");
		list.add("tony");
		list.add("hanmeimei");
		list.add("tony");
		list.add("tony");
		list.add("tony");
//		list.clear();//清空集合
		System.out.println(list.contains("jack"));
		System.out.println(list.equals("jack"));
		System.out.println(list.hashCode());
		System.out.println(list.isEmpty());;
		System.out.println(list.remove("hanmeimei"));
		System.out.println(list.size());
		System.out.println(list.toArray());//变成数组
		
		//List接口的特有方法 --都是可以按照索引来操作的方式
		list.add(1,"蔡徐坤");//在指定索引处添加指定的元素
		System.out.println(list+"===");
		System.out.println(list.get(2));//获取下标对应的元素
		System.out.println(list.indexOf("tony"));//获取指定元素第一次出现的下标
		System.out.println(list.remove(3));//按照下标删除指定元素
		System.out.println(list.set(0, "xiongda"));//置换元素
		List <String> subList=list.subList(2, 4);//截取子List(含头不含尾)
		System.out.println(subList);
		
		//TODO集合间的操作
		List<String>list2=new ArrayList();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		System.out.println(list.addAll(list2));//把list2加到list里
		System.out.println(list.addAll(1,list2));//在指定席标出添加元素
		System.out.println(list.contains(list2));//判断是否包含
		System.out.println(list.remove(list2));//删除list2
//		System.out.println(list.retainAll(list2));//删除list
		
		//TODO集合的迭代 --List集合的迭代方式有多种
		//iterator() listIterator() for() foreach
		//方式1:由于List集合有下标，所以可根据下标遍历数据
		//i<list.size()下标最大值是集合长度-1
		for(int i=0;i<list.size();i++) {
			String s=list.get(i);//list.get(i)根据下标获取元素
			System.out.println(s);
		}
		//方式2:普通for循环遍历的效率低，可以用foreach提高，好处：语法简洁效率高 坏处：不能按照下标获取
		//for（1 2：3）{} --3是要遍历的数据 1是遍历得到的数据类型 2是变量名
		for(String str:list) {
			System.out.println(str);//str代表的是当前遍历得到的数据
		}
		//方式3：iterator()是继承自父接口Collection的
		Iterator <String> it=list.iterator();
		while(it.hasNext()) {
			//hasNext()判读是否有下一个元素
			String str=it.next();//next()获取元素
			System.out.println(str);//打印获取到的值
		}
		//方式4：listIterator()是List接口的特有方法
		//Iterator<E>iterator()--父接口 --hasNext() --next() --remove()
		//ListIterator<E> listIterator() --子接口，拥有父接口的方法，也有自己的特有方法(逆向迭代）
	    ListIterator <String> it2=list.listIterator();
	    while(it2.hasNext()) {
	    	//hasNext()判断后面有没有数据
	    	String s=it2.next();//next()获取后一个数据
	    	System.out.println(s);//打印获取到的数据
	        //子接口拥有父接口的所有方法也有自己的特有犯法付，子接口的特有方法就是向前/逆向遍历
}
	}
}
