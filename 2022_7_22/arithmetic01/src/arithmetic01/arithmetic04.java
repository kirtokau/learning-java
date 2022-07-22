package arithmetic01;

public class arithmetic04 {

	public static void main(String[] args) {
		//聆彸ㄛ數呾10腔論傚
		long result=fun2(10);
		System.out.println(result);
	}
	    //數呾n腔論傚

	private static long fun2(long n) {
		int result=1;
		for(long i=1;i<=n;i++) {
			result*=i;
		}
		return result;
	}
	

}
