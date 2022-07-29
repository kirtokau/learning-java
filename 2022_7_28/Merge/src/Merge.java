import java.util.Arrays;

//排序代码
public class Merge {
	private static Comparable[] assit;//归并所需要的辅助数组
    /*
     * 对数组a中的元素进行排序
     */
	public static void sort(Comparable[] a) {
		assit=new Comparable[a.length];
		int lo=0;
		int hi=a.length-1;
		sort(a,lo,hi);
	}
	/*
	 * 对数组a中从lo到hi的元素进行排序
	 */
	private static void sort(Comparable[] a, int lo, int hi) {
		if(hi<=lo) {
			return;
		}
		int mid=lo+(hi-lo)/2;
		//对lo到mid之间的元素进行排序
		sort(a,lo,mid);
		//对mid+1到hi之间的元素进行排序
		sort(a,mid+1,hi);
		//对lo到mid这组数据和mid到hi这组数据进行归并
		merage(a,lo,mid,hi);
	}
	/*
	 * 对数组中，从lo到mid为一组，从mid+1到hi为一组，对这两组数据进行归并
	 */
	private static void merage(Comparable[] a, int lo, int mid, int hi) {
		// lo到mid这组数据和mid+1到hi这组数据归并到辅助数组assit对应的索引处
		int i=lo;//定义一个指针，指向assit数组中开始填充数据的索引
		int p1=lo;//定义一个指针，指向第一组数据的第一个元素
		int p2=mid+1;//定义一个指针，指向第二组数据的第一个元素
		//比较左边数组和右边数组中的元素大小，哪个小，就把哪个数据填充到assit数组
		while(p1<=mid&&p2<=hi) {
			if(less(a[p1],a[p2])) {
			  assit[i++]=a[p1++];
			}else {
			  assit[i++]=a[p2++];
			}
		}
		//上面的循环结束后，如果退出循环的条件是p1<=mid,则证明左边数组中的数据已经归并完毕，如果
         //退出循环的条件是P2<=hi,则证明右边小组的数据已经填充完毕
		 //所以需要把未填充完毕的数据继续填充到assit中，下面两个循环，只会执行其中的一个
		while(p1<=mid) {
			assit[i++]=a[p1++];
		}
		while(p2<=hi) {
			assit[i++]=a[p2++];
		}
		//到现在为止，assit数组中，从lo到hi的元素是有序的，再把数据拷贝到a数组中的索引处
		for(int index=lo;index<=hi;index++) {
			a[index]=assit[index];
		}		
	}
	/*
	 * 比较V元素是否小于w元素
	 */
	private static boolean less(Comparable v,Comparable w) {
		return v.compareTo(w)<0;
	}
	/*
	 * 数组元素i和j交换位置
	 */
	private static void exch(Comparable[] a,int i,int j) {
		Comparable t=a[i];
		a[i]=a[j];
		a[j]=t;	
	}
	//测试代码
	public static void main(String[] args) {
		Integer[] arr= {8,4,5,7,1,3,6,2};
        Merge.sort(arr);
        System.out.println(Arrays.toString(arr));
	
	}
}
