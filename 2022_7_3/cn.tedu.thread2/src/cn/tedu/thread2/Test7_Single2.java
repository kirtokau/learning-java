package cn.tedu.thread2;
//������������Ե������ģʽ--����ʽ
//�ӳټ���˼�룺��ָ�����һʱ��ͰѶ��󴴽�����ռ���ڴ棬����ʲôʱ����ʲô����
//�̰߳�ȫ���⣺��ָ������Դ���̲߳�����������������ͬ��������������Ҳ�����������
public class Test7_Single2 {

	public static void main(String[] args) {
		MySingleton my=MySingleton.getMy();
		MySingleton my2=MySingleton.getMy();
		System.out.println(my==my2);
	}
}
//������
class MySingleton{
	//˽�л����췽��--�������new ��Ȩ��
	private MySingleton() {}
	//������ڲ������ö���--�ӳټ���
	static private MySingleton my;
	//static Object obj=new Object();
	//�ṩȫ�ַ��ʵ�
	//���⣺�������й�����Դmy.�����ж����������˹�����Դ����ʱ��my������Դһ������ڶ��̱߳�̵����ݰ�ȫ����
	//����������Ǽ�ͬ����
	//���ͬ���������Ҫ����ȷ��λ�ã����Ķ������ڷ����е����д��붼��ͬ���ˣ�����ֱ�ӱ��ͬ������
	synchronized static public MySingleton getMy() {
		//synchronized(obj)//ͬ������飬����ʹ��this�ؼ��֣���Ϊ���ص��Ⱥ�˳������
		if(my==null) {//˵��ûnew���������Ĭ��ֵ��null
			my=new  MySingleton();//��Ҫʱ�Żᴴ�����󣬲���ҪҲ������ǰ�Ϳ�ʼռ���ڴ�
		}
		return my;
	}
	
	}

