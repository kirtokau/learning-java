package Basic;

import java.util.Scanner;

public class Test2_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        method();//����method()
     }
	//����method()
	public static void method(){
		for(int i=1;i<=100;i++) {//����forѭ������ִ��100��
			//�����û������100������
			int input=new Scanner(System.in).nextInt();
			if(input!=88) {//�������88
				continue;//��������
				//break����continue֮�󶼲�����д���룬���ǲ��ɴﵽ�Ĵ���
			}else if(input==88)//�ҵ�88
					System.out.println("��ϲ�����¶�����");
					
			}
					
		}
	}
	
	
