package Basic;

import java.util.Arrays;
import java.util.Random;

public class Test5_Array2 {

	public static void main(String[] args) {
	         method();
	         method2();
	         method3();
	}
	public static void method(){
		//1、创建数组
		int a[]= {31,29,31,30,31,30,31,31,30,31,30,31};
		//2、输出每月天数，1月有31天
		//按照数组中元素的下标遍历
		//int i=0 指从下标为0的元素开始向后遍历，i表示的是下标
		//i<=a.length-1指下标的最大值是数组长度-1
		//i++指下标自增
		for(int i=0;i<=a.length-1;i++) {
			//a[i]指根据下标获取a数组中元素的值 i+1 是指下标+1
			System.out.println((i+1)+"月有"+a[i]+"天");
		}
	}
	public static void method2(){
		//1、创建数组--动态
		int a[]=new int[10];
		//2、遍历数组，给元素赋值
		//int i=0 是指从下标为0的位置开始
		//i<a.length是指下标最大值是数组的长度-1
		//i++是指下标自增
		for(int i=0;i<a.length;i++){
			//a[i]是指根据下标获取元素 i+1给每个元素赋值，i取值是0-9，+1后取值就是1-10
			a[i]=i+1;
	   }
		//打印数组中的元素
		System.out.println(a);
		//Arrays是数组的工具类，toString(m)-m是要把哪个数组的元素显示成一个字符串
		System.out.println(Arrays.toString(a));
	}
	//创建method3
	public static void method3() {
		//1、创建数组动态
		int a[]=new int[10];
		//2、遍历数组，给元素赋值
		//i<a.length是指下标最大值是数组的长度-1
		//i++是指下标自增
		for(int i=0;i<a.length;i++){
			//a[i]是指根据数据下标获取元素，赋予100以内的随机数
			a[i]=new Random().nextInt(100);
		}
		//3、打印数组中的元素
		System.out.println(a);
		//Arrays是数组的工具类，toString(m)-m是要把哪个数组的元素显示成一个字符串
		System.out.println(Arrays.toString(a));
	}
}
