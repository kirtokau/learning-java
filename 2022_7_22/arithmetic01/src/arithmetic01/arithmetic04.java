package arithmetic01;

public class arithmetic04 {

	public static void main(String[] args) {
		//���ԣ�����10�Ľ׳�
		long result=fun2(10);
		System.out.println(result);
	}
	    //����n�Ľ׳�

	private static long fun2(long n) {
		int result=1;
		for(long i=1;i<=n;i++) {
			result*=i;
		}
		return result;
	}
	

}
