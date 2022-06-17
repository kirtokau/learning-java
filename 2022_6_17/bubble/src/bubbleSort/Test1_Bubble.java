package bubbleSort;

import java.util.Arrays;

public class Test1_Bubble {

	public static void main(String[] args) {
		//1、创建无序数组
		int[]a= {21,96,75,23,25};
		//2、调用method()排序
//		int[] newA=method(a);
		//底层使用的排序算法是：经过优化后的快速排序算法
		Arrays.sort(a);//对无序数组进行排序
		System.out.println(Arrays.toString(a));
	}
	//完成排序
	public static int[] method(int[] a) {
		//1、外循环：控制比较轮数，假设n个数，需要比较n-1次
		//a.length-1是指需要比较的轮数是数组的长度-1
		for(int i=0;i<a.length-1;i++){
			//相邻元素的值比较，a[j]代表的是前一个元素，并且不会再次参与比较
			for(int j=0;j<a.length-1;j++){
				//相邻元素的值比较，a[j]代表的是前一个元素，a[i+j]代表的是后一个元素
				if(a[j]>a[j+1]) {
					//交换数据
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		return a;//把排序后的数组返回
	}

}
