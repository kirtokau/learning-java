package thisdemo;
//测试继承中构造方法的使用
public class Test7_UseExtends3 {

	public static void main(String[] args) {
		//创建子类对象使用
		Zi3 z=new Zi3();
	}
}
//创建父类
class Fu3{
	//构造方法能被继承吗？不能
	/*public Fu3(){
	 * System.out.println("父类的构造方法");
	 */
	public  Fu3(String n) {
		System.out.println("父类的构造方法"+n);
	}
}
//创建子类
class Zi3 extends Fu3{
	public Zi3() {
		//1、子类的构造方法中，默认就会存在super（）;
		//2、在子类创建对象是，会自动调用子类的无参构造，但是继承后，会先去执行父类的无参构造
		super("jack");//父类没有无参构造时，调用父类的含参构造
		System.out.println("子类的构造方法");
		
		
	}
}
