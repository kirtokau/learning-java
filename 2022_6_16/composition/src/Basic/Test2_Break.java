package Basic;

import java.util.Scanner;

public class Test2_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        method();//调用method()
     }
	//创建method()
	public static void method(){
		for(int i=1;i<=100;i++) {//控制for循环可以执行100次
			//接收用户输入的100次数字
			int input=new Scanner(System.in).nextInt();
			if(input!=88) {//如果不是88
				continue;//继续输入
				//break或者continue之后都不允许写代码，都是不可达到的代码
			}else if(input==88)//找到88
					System.out.println("恭喜您，猜对啦！");
					
			}
					
		}
	}
	
	
