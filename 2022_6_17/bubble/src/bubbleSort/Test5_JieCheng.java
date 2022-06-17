package bubbleSort;
//这个类用来测试5的阶乘
public class Test5_JieCheng {

	public static void main(String[] args) {
		int res=method(5);
		System.out.println(res);
    }
	//用来求5的阶乘
	public static int method(int i) {
		if(i==1) {//求1的阶段
			return 1;
		}else {
			//方法的递归，就是不断的重复干相同的业务，求谁的阶乘
			//递归：在方法内部调用方法本身
			return i*method(i-1);
			
		}
	}

}
