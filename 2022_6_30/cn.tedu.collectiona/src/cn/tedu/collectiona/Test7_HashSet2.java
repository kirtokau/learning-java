package cn.tedu.collectiona;

import java.util.HashSet;
import java.util.Set;

//������������Զ������ȥ��
//�������set���ϸ��Զ������ȥ�أ�Ҫ�������Լ������У�ͬʱ�ṩ��д��Hashcode()��equals()
//��д��hashcode()���ǲ���ӦĬ�ϵ��Զ���������Ĺ�ϣֵ������Ҫ���ݶ��������ֵ���㣬������������ֵ����ͬ����ô�������ͬ�Ĺ�ϣֵ
//��д��equals()����Ҫ�ȽϵĲ��Ƕ���ĵ�ֵַ�����ǱȽ�����������������ֵһ���ͷ���true
public class Test7_HashSet2 {

	public static void main(String[] args) {
		// ����set���϶���
		Set <Student> set=new HashSet<Student>();
		//��Set����������Զ������
		Student s1=new Student("tony",20,"BJ");
		Student s2=new Student("jack",10,"SH");
		Student s3=new Student("rose",30,"SH");
		
		Student s4=new Student("jack",10,"SH");
		Student s5=new Student("rose",30,"SH");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		//�ظ��������������ͬ�Ķ���Ϊʲôû��ȥ�أ�--����Դ�룬��ʾ
		//1����֤����ӵ����ͬ�Ĺ�ϣֵ����Ĭ��ʹ�õ���OBject�ṩ��hashCode()����Ĺ�ϣֵ
		//�������Ҫ�����������������ֵ�����ϣֵ���Ǿ���Ҫ��дhashcode()
		//��Ҫ��֤����������equals()����true,�Ǿ���Ҫ��дequals()
		set.add(s4);
		set.add(s5);
		
		//Ŀǰset���ϸ�����û�и��Զ������ȥ�أ���Ϊs4 s5��s2 s3������ȫһ��������set���Ǵ���
		//����set�����������ʱ��ȥ�ж���Ч����������������������ֵ��һ������ֱ��ȥ�ؾ��У���
		System.out.println(set);
	}

}
