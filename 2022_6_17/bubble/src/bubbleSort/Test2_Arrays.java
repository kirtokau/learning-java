package bubbleSort;

import java.util.Arrays;

//这个类用来测试数组工具类Arrays
		//总结：
		//1、toString(m[])--就是将m数组中的元素进行拼接成字符串进行展示
		//2、sort()--将一个无需数组进行排序，是在原有数组的基础上直接排序
		//3、copyof(m,n)--数组的扩容是n要大于m的长度，数组的缩容是n要小于m的长度，产生的是新数组，原数组内容并没发生变化
		
public class Test2_Arrays {

	public static void main(String[] args) {
		//copyof()--由于数组一旦创建长度
		int[]from= {1,2,3,4,5};
		int[]to=Arrays.copyOf(from,10);
		System.out.println(Arrays.toString(to));
		int[] to2=Arrays.copyOf(from,3);
		System.out.println(Arrays.toString(to2));
	}

}
