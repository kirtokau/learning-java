package cn.tedu.inter;

public class Test6_Design {
	public static void main(String[] args) {
		CgbTeacher a=new CgbTeacher();
		a.teach();
//		ActTeacher b=new ActTeacher(); //�������޷���ֱ��ʵ����
//		b.ready();
	}
}
//�����е�����--java��
//����--����  ��Ϊ--����
//�����й��Ե��������ϳ�ȡ���γɸ���

//��������̣��ѳ���㣬��Ƴɳ�����
//���к��г��󷽷������������ɳ�����
abstract class Teacher{
	//û�з����ķ����г��󷽷�
	abstract public void teach();
	//����
	public void ready() {
		System.out.println("���ڱ���");
	}
}
//���Ű���ʦ
class CgbTeacher extends Teacher{
	//���󣺵����ི�κͱ��ε����ݺ͸��಻һ��ʱ��Ҳ������Ҫ�޸ĸ��๦��ʱ��--��д
    //��д������ķ�������Ҫ�͸��ౣ��һ�£�Ҫ�ĵľ��Ƿ�����
	//����
	public void teach() {
		System.out.println("���������Ŀ");
	}
}
//���ְ���ʦ
abstract class ActTeacher extends Teacher{
	//�����ི�κͱ��ε����ݺ͸��಻һ��ʱ��Ҳ������Ҫ�޸ĸ��๦��ʱ��--��д
	//��д������ķ�������Ҫ�͸��ౣ��һ�£�Ҫ�ĵľ��Ƿ�����
	//����
	public void ready() {
		System.out.println("���λ�����ǿ�Ϳ�ܼ�ǿ�͸��¼���");
	}
}
//
