package cn.tedu.collectiona;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//这个类用来测试set接口方法
public class Test_5 {

	public static void main(String[] args) {
		// 创建set对象
		//Set set=new Set();//Set是接口，不能new 
		Set <String> set=new HashSet();
		//常用方法
		set.add("jack");
		set.add("rose");
		set.add("tony");
		set.add("hanmeimei");
		set.add("tony");
		set.add("tony");
		set.add("null");
		//特点1：set集合中的元素都是无序的
		//特点2：set集合中的元素时不能重复的
		//特点3：set集合中允许存放null元素
		System.out.println(set);
		//set.clear();//清空集合
		System.out.println(set.contains("tony"));//判断set中是否包含元素
		System.out.println(set.equals("tony"));//判断set是否和tony相等
		System.out.println(set.hashCode());//获取set集合的哈希码值
		System.out.println(set.isEmpty());//获取set集合是否为空
		System.out.println(set.remove("null"));//删除集合的指定元素
		System.out.println(set.size());//获取集合的长度
		Object[] obs=set.toArray();//把集合中的元素放入数组中
		System.out.println(Arrays.toString(obs));//查看数组里的元素值
		
		//集合间的操作
		Set <String> set2=new HashSet();
		set2.add("1");
		set2.add("2");
		set2.add("3");
	    System.out.println(set.addAll(set2));//把set2加入到set中
	    System.out.println(set.containsAll(set2));//判断set中是否包含set2
	    System.out.println(set.removeAll(set2));//删除set2
	    
	    //集合的迭代Iterator<E> iterator()
	    Iterator <String> it=set.iterator();
	    while(it.hasNext()) {
	    	//判断有没有下一个元素
	    	String s=it.next();//获取元素
	    	System.out.println(s);//打印获取到的元素
	    }

	}

}
