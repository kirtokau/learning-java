package cn.tedu.bigdecimal;
//�ݹ飺���ϵص��÷�������
import java.io.File;

public class Test_DigGui {

	public static void main(String[] args) {
		// ָ��Ҫ���ĸ�Ŀ¼���ܴ�С
		File file =new File("D:\\teach\\a");
		
		//��Ŀ¼��С
		long total=size(file);
		System.out.println(total);
	}
        private static long size(File file) {
         //�г��ļ����µ�������ԴlistFiles()
        	File fs[]=file.listFiles();
         //�������飬��ȡÿ���ļ�����
        	long sum=0;//�������,��¼�ܺ�
        	for(int i=0;i<fs.length;i++) {
        		File f=fs[i];//��ȡ��ǰ��Դ
        //�жϵ�ǰ��Դ���ļ������ļ���
        		if(f.isFile()) {
        			//���ļ������ļ����ֽ�����Сlength()��;���
        			sum+=f.length();//�൱��sum=sum+f.length()
          		}else if(f.isDirectory()) {
          			//--���ļ��У�������1��2������---�����˵ݹ�����󣬾����ڷ����ڲ�������ҵ��ͷ�������һ��
          			sum+=size(f);
          		}
        	}
        
        return sum;//��sum��¼��ֵ���ص���λ��
 }
}
