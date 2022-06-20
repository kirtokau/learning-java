package thisdemo;
//测试继承者成员方法的使用
//总结：
//1、方法重写的意义：是在不修改源码的前提下，完成业务的修改
//2、重写的要求：子类的方法声明和父类要一模一样
//3、重写并没有改变父类原有的业务，只是子类的业务进行了修改
public class Test6_UseExtends2 {

	public static void main(String[] args) {
		//创建子类对象测试
       Zi2 z=new Zi2();
       //1、子类继承父类后，可以使用父类的所有功能
       //4、执行功能执行父类的还是子类的？
       //如果只是发生了继承关系，执行的是父类的，如果发生了方法重写，执行的都是重写后的效果
       z.eat();//爸爸在吃猪肉 --儿子在喝汤
       //继承后，子类不仅可以使用父类的功能，而且能进行功能扩展
       z.study();
       	}
}
    //创建父类
    class Fu2{
    	public void eat() {
    		System.out.println("爸爸在吃猪肉");
    	}
    }
    //创建子类
    class Zi2 extends Fu2{
    	//提供子类特有的功能
    	public void study(){
    		System.out.println("儿子在学java");
       	}
    
    //进行父类的功能修改--并没有修改父类原有的业务
    //功能修改--方法的重写override
    //重写：和父类的方法签名一模一样,修改是子类的功能，父类功能没有改变
    //重写时，子类必须有权限去重写父类的功能，方法的修饰符>=父类的修饰符
        public void eat() {
    	System.out.println("儿子在喝汤");
    }
}