package arithmetic01;

import java.util.Arrays;

//排序代码
public class Bubble {
	/**
	 * 
	 * 对数组a中的元素进行排序
	 */
    
	public static void sort(Comparable[] a) {
		for(int i=a.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(greater(a[j],a[j+1])) {
					exch(a,j,j+1);
				}
			}
		}
	}
	/*
	 * 比较V元素是否大于w元素
	 */
	private static void exch(Comparable[] a, int j, int i) {
		Comparable t=a[i];
		a[i]=a[j];
		a[j]=t;
		
	}
	private static boolean greater(Comparable v, Comparable w) {
		return v.compareTo(w)>0;
	}
	
	
	public static void main(String[] args) {
		Integer[] a= {4,5,6,3,2,1};
		Bubble.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
