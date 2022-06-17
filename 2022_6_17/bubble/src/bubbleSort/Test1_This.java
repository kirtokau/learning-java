package bubbleSort;

public class Test1_This {

	public static void main(String[] args) {
		// 创建Person对象测试
		Persona p=new Persona();
		p.eata();		
	}
}

    class Persona{
	    int sum=20;//成员变量
	    public void eata(){
		int sum=10;//局部变量
		System.out.println(sum);//10，使用的是局部变量sum
		
		//如果不用this,即将使用的sum是局部变量，因为变量的使用有最近原则
	    //1、通过this关键字可以调用成员变量，前提是当成员变量和局部变量同名时
		System.out.println(this.sum);
	}
 }
