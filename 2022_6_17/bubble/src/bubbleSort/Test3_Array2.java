package bubbleSort;

public class Test3_Array2 {

	public static void main(String[] args) {
		//1、创建二维数组
		int[][]a= {{1,3},{4,6},{7,9}};
		//2、遍历二维数组
		for(int i=0;i<a.length;i++){//遍历外部数组
			//a[i].length--根据外部数组的下标获取，a[i]又是一个数组，a[i].length是内部数组的长度
			for(int j=0;j<a[i].length;j++){//遍历内部数组
				//a[i][j]--根据外部数组的下标和内部数组的下标定位具体的元素
				System.out.println(a[i][j]);
			}
			
		}
		
		

	}

}
