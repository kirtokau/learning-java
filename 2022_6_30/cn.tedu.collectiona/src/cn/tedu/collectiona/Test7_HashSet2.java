package cn.tedu.collectiona;

import java.util.HashSet;
import java.util.Set;

//这个类用来给自定义对象去重
//如果想用set集合给自定义对象去重，要求你在自己的类中，同时提供重写的Hashcode()和equals()
//重写的hashcode()我们不适应默认的自动计算出来的哈希值，而是要根据对象的属性值计算，如果对象的属性值都相同，那么请产生相同的哈希值
//重写的equals()我们要比较的不是对象的地址值，而是比较两个对象间如果属性值一样就返回true
public class Test7_HashSet2 {

	public static void main(String[] args) {
		// 创建set集合对象
		Set <Student> set=new HashSet<Student>();
		//向Set集合中添加自定义对象
		Student s1=new Student("tony",20,"BJ");
		Student s2=new Student("jack",10,"SH");
		Student s3=new Student("rose",30,"SH");
		
		Student s4=new Student("jack",10,"SH");
		Student s5=new Student("rose",30,"SH");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		//重复的添加了属性相同的对象，为什么没有去重？--翻完源码，显示
		//1、保证对象拥有相同的哈希值？？默认使用的是OBject提供的hashCode()计算的哈希值
		//如果你想要根据两个对象的属性值计算哈希值，那就需要重写hashcode()
		//是要保证两个对象间的equals()返回true,那就需要重写equals()
		set.add(s4);
		set.add(s5);
		
		//目前set集合根本就没有给自定义对象去重，因为s4 s5和s2 s3属性完全一样，但是set还是存了
		//需求：set集合添加数据时，去判断有效，如果两个对象的所有属性值都一样，就直接去重就行！！
		System.out.println(set);
	}

}
