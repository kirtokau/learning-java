package cn.tedu.encoding;

import java.util.ArrayList;
import java.util.List;

//������������Է��͵ĺô�
public class Test3_Generic {

	public static void main(String[] args) {
		// ��������ô����--��Ҫģ�����ݵ����ݼ������
		String[]a=new String[5];
		a[2]="jack";
		a[4]="rose";
		//����ĺô�:�ڱ���ʱ�ڼ�����ݵ����ͣ��������Ҫ������ͻ��ڱ������ͱ���
		//a[0]=90;
		//a[1]='a';
		//a[3]=9.9;
		//����ͨ�������ż���һ��ʹ��
		List list=new ArrayList();
		//û�з��ͣ��������͸���û��Լ��--̫���ɣ�
		list.add(10);//���Լ�����
		list.add(8.8);//���ԼӸ�������
		list.add('a');//���Լ��ַ���
		System.out.println(list);
		//��������--��Ҫ��Լ�������е�Ԫ������<?>
		List<String>list2=new ArrayList();
		//���ͺô������򼯺������Ԫ��ʱ�����ȼ��Ԫ�ص��������ͣ������������к��׳��쳣
		//���ͺô������򼯺������Ԫ��ʱ�����ȼ��Ԫ�ص��������ͣ�����Ҫ������;ͱ���ʧ��
		list2.add("tony");//���Լ��ַ���
		//list.add(10);
		//list.add(8.8);
		//list.add('a');
		//5��<type>--type��ֵ������ôд��Ҫ����Ҫ��ŵ�����������ɶ��type�������������Ͷ������ǻ�������
		//List<int>list3=new ArrayList();//�������Int���ֻ�������
		List<Integer>list3=new ArrayList();
		list3.add(100);
		list3.add(200);
		//list3.add("300");
	}

}
