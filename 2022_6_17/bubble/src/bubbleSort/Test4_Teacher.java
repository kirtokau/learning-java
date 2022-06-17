package bubbleSort;

public class Test4_Teacher {

	public static void main(String[] args) {
		// 创建对象测试
		Teacher t=new Teacher();//这样创建对象，默认会调用无参构造
		//由于Teacher类中的属性都被封装了，外界无法查看，想要设置值获取值必须访问公共的方法
		t.setAddr("大北京");
		t.setName("jack");
		t.setSalary(100000);
		System.out.println(t.getAddr());
		System.out.println(t.getAge());
		System.out.println(t.getName());
		System.out.println(t.getSalary());
		
		Teacher t2=new Teacher("rose",18,100000,"大上海");
		System.out.println(t2.getName()+t2.getAddr()+t2.getAge()+t2.getSalary());
	}

}

class Teacher{
	private String name;
	private int age;
	private double salary;
	private String addr;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, int age, double salary, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
}