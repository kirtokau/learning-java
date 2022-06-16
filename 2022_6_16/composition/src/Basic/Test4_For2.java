package Basic;

public class Test4_For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //当i=1时，j=12345
		//当i=2时，j=12345
		//当i=3时，j=12345
		//总结1：外循环i执行1次，内循环j执行多次
		for(int i=1;i<4;i++){
			System.out.println(i);
			for(int j=1;j<6;j++) {
				System.out.println(j);
			}
		}
			System.out.println();//空行
		//总结2：外循环控制行，内循环控制列
			for(int i=1;i<=3;i++) {
				for(int j=1;j<=5;j++){
					System.out.println("*");
				}
				System.out.println();//空白行
			}
			
		}
	}


