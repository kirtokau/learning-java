package cn.tedu.inter;
//����ӿڱ��
public class Test7_Design2 {

	public static void main(String[] args) {
		CgbTeacher2 a =new CgbTeacher2();
		a.ready();
		a.teach();
	}
}
//��ȡ���ԣ��γɳ����--���ֽӿ�
interface Teacher2{
	//�ӿ���ķ������ǳ��󷽷�
	//����
	void teach();
	//�ӿ���ķ������Լ�д --�Զ�ƾ�� public abstract
	//����
    void ready();		
}
//ʵ����Ҫʹ�ýӿڵĹ��ܣ���Ҫ����ʵ�ֹ�ϵ
//���Ű���ʦ
class CgbTeacher2 implements Teacher2{
//����
	@Override
		public void teach() {			
			System.out.println("���������Ŀ");
		}
//����
    @Override
        public void ready() {
		    System.out.println("���ε�����Ŀ");
        }
}
//���ְ���ʦ
abstract class ActTeacher2 implements Teacher2{
}
