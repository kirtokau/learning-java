

import java.util.Arrays;

//排序代码
public class shellsort {
	/*
	 * 对数组a中的元素进行排序
	 */
	public static void sort(Comparable[] a) {
		int N=a.length;
		//确定增长量h的最大值
		int h=1;
		while(h<N/2) {
			h=h*2+1;		
	}
	//当增长量h小于1，排序结束
	while(h>=1) {
	//找到待插入的元素
		for(int i=h;i<N;i++) {
			//a[i]就是待插入的元素
			//把a[i]插入到a[i-h],a[i-2h],a[i-3h]...序列中
			for(int j=i;j>=h;j-=h) {
				/*a[j]就是待插入元素，依次和a[j-h],a[j-2h],a[j-3h]进行比较，如果a[j]小，
				那么交换位置，如果不小于，a[j]大，则插入完成
				*/
				if(greater(a[j-h],a[j])) {
					exch(a,j,j-h);
				}else {
					break;
				}
			}
		}
		h/=2;
	}

}

	private static void exch(Comparable[] a, int j, int i) {
		Comparable t=a[i];
		a[i]=a[j];
		a[j]=t;
		
	}

	private static boolean greater(Comparable v, Comparable w) {
		
		return v.compareTo(w)>0;
	}
	
	public static void main(String[] args) {
		Integer[]a= {9,1,2,5,7,4,8,6,3,5};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
}