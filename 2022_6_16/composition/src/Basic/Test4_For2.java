package Basic;

public class Test4_For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //��i=1ʱ��j=12345
		//��i=2ʱ��j=12345
		//��i=3ʱ��j=12345
		//�ܽ�1����ѭ��iִ��1�Σ���ѭ��jִ�ж��
		for(int i=1;i<4;i++){
			System.out.println(i);
			for(int j=1;j<6;j++) {
				System.out.println(j);
			}
		}
			System.out.println();//����
		//�ܽ�2����ѭ�������У���ѭ��������
			for(int i=1;i<=3;i++) {
				for(int j=1;j<=5;j++){
					System.out.println("*");
				}
				System.out.println();//�հ���
			}
			
		}
	}


