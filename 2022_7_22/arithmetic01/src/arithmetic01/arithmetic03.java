package arithmetic01;

public class arithmetic03 {

	public static void main(String[] args) {
		// ²âÊÔ£¬¼ÆËã10µÄ½×³Ë
		long result=fun1(10);
		System.out.println(result);
	}

	private static long fun1(long  n) {
	    if(n==1) {
	    	return 1;
	    }
		return n*fun1(n-1);
	}

}
