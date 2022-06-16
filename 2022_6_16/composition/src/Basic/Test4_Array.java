package Basic;

public class Test4_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1、创建数组
		//静态创建
		char[]c=new char[] {'h','e','l','l','o'};
		char[]c2= {'h','e','l','l','o'};
		//动态创建
		char[]c3=new char[5];
		c3[0]='h';//给数组中的第一个元素赋值
		c3[1]='e';//给数组中的第二个元素赋值
		c3[2]='l';//给数组中的第三个元素赋值
		c3[3]='l';//给数组中的第四个元素赋值
		c3[4]='o';//给数组中的第五个元素赋值
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c3);
	}

}
