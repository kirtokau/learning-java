package finaldemo;

public class Test5_DuoTai {
//这个类用来测试多态的入门案例
	public static void main(String[] args) {
		// 创建子类对象测试
		Dog d=new Dog();
		d.eat();
		//创建多态对象测试
		//口诀：父类引用 指向子类对象
		Animal a=new Dog();
		//编译（保存）看左边，运行（测试）看右边
		a.eat();//eat()是使用的父类的声明，但是使用的子类的实现方式
		//多态的出现，是为了统一调用的标准：向父类看齐，父类提供的功能才能用，子类特有功能用不了
		//a.show();
		Animal b=new Animal();
		b.eat();
	}
}
        //创建父类
        class Animal{
        	public void eat() {
        		System.out.println("吃啥都行");
        	}
        }
        //创建子类
        //多态的前提：是要发生继承关系
        class Dog extends Animal{
        	//多态的前提：是要发生方法重写
        	public void eat() {
        		System.out.println("狗吃肉");
        	}
        }
