package cn.tedu.bigdecimal;

import java.io.File;

public class Test4_DiGui2 {
//�ݹ�ɾ��Ŀ¼
//���󣺵ݹ�ɾ���ļ��� D:\teach\a2
	public static void main(String[] args) {
		//ָ������Ҫɾ�����ļ���
		File file =new File("D:\\teach\\m2");
		del(file);//ɾ���ļ�
	}
	private static void del(File file) {
		//�г��ļ����µ�������ԴlistFiles()
		File[] fs=file.listFiles();
		for(int i=0;i<fs.length;i++) {
			File f=fs[i];
		//�жϵ�ǰ��Դ���ļ������ļ���
			if(f.isFile()){
				//--���ļ�,ֱ��ɾ��delete()
				f.delete();				
			}else if(f.isDirectory()) {
				//--���ļ��У�������1��2������ --�ݹ� ��del�����ڲ��ٵ����Լ�
				del(f);
			}
		}
		file.delete();//ɾ���ļ���
	}

}
