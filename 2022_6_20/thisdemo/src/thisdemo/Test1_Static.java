package thisdemo;

public class Test1_Static {

	public static void main(String[] args) {
		//����ֱ�ӱ���������
		//��̬��Դ�������ڶ�����صģ��ȶ����ȼ��ؽ����ڴ�
		System.out.println(Studenta.name);
		Studenta.study();
		
		Studenta s=new Studenta();
		//��̬��Դ���ǿ��Ա�������õ�
		s.study();
		s.name="tony";
		System.out.println(s.name);
		//��̬��Դ���ڶ������䣬�ǿ��Թ����
		Studenta s2=new Studenta();
		System.out.println(s2.name);
	}
}
//����STudent��
class Studenta{
	//ʹ��static���Խ���ͨ��Դ���γɾ�̬��Դ
	static String name="jack";
	static public void study() {
		System.out.println("study()...");
	}
}
