package bubbleSort;
//这个类用来测试变量的使用
public class Test4_Variable {
	// 成员变量：位置在类里方法外+作用在整个类中+可以不手动初始化也会有默认值
	static int count;
	//3、变量的使用有一个原则，就近原则
	static int sum=200;
	
	public static void main(String[] args) {
		//1、局部变量：位置在方法里+必须手动完成初始化+作用在方法里
		int sum=100;
		System.out.println(sum);//3、变量的就近原则，使用的都是自己附近的变量，100
		System.out.println(count);
		}
}
