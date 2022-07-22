package arithmetic01;

import java.util.Arrays;

public class reverse1 {

	public static void main(String[] args) {
		int arr[]= {1,8,98,65,43};
//		reverse1(arr);
		
		int temp[] = null;
//		reverse2(arr);
//		for(int i=0;i<=temp.length-1;i++) {
//			System.out.println(temp[i]);
//		}
		serach(8);
		
         
	}

	private static int serach(int num) {
		int arr[]= {1,8,98,65,43};
		for(int i=0;i<=arr.length-1;i++) {
			if(num==arr[i]) {
				System.out.println(num);
			}
		}
		return -1;				
	}

	private static int[] reverse2(int[] arr) {
		int n=arr.length;
		int[] temp=new int[n];
		for(int i=n-1;i>=0;i--) {
			temp[n-1-i]=arr[i];
		}
		System.out.println(Arrays.toString(temp));
		return temp;		
		
	}

	private static int[] reverse1(int[] arr) {
		int n=arr.length;//申请4个字节
		int temp;//申请4个字节
		for(int start=0,end=n-1;start<=end;start++,end--) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
		return arr;
		
	}

}
