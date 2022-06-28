package cn.tedu.encoding;

import java.util.ArrayList;
import java.util.List;

//这个类用来测试泛型的好处
public class Test3_Generic {

	public static void main(String[] args) {
		// 泛型是怎么来的--想要模拟数据的数据检查类型
		String[]a=new String[5];
		a[2]="jack";
		a[4]="rose";
		//数组的好处:在编译时期检查数据的类型，如果不是要求的类型会在编译器就报错
		//a[0]=90;
		//a[1]='a';
		//a[3]=9.9;
		//泛型通常会结合着集合一起使用
		List list=new ArrayList();
		//没有泛型，数据类型根本没有约束--太自由！
		list.add(10);//可以夹整型
		list.add(8.8);//可以加浮点类型
		list.add('a');//可以加字符串
		System.out.println(list);
		//泛型来了--主要象约束集合中的元素类型<?>
		List<String>list2=new ArrayList();
		//泛型好处：在向集合中添加元素时，会先检查元素的数据类型，而不是在运行后抛出异常
		//泛型好处：在向集合中添加元素时，会先检查元素的数据类型，不是要求的类型就编译失败
		list2.add("tony");//可以加字符串
		//list.add(10);
		//list.add(8.8);
		//list.add('a');
		//5、<type>--type的值到底怎么写？要看的要存放的数据类型是啥，type必须是引用类型而不能是基本类型
		//List<int>list3=new ArrayList();//不许出现Int这种基本类型
		List<Integer>list3=new ArrayList();
		list3.add(100);
		list3.add(200);
		//list3.add("300");
	}

}
