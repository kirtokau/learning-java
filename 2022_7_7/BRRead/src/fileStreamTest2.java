import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class fileStreamTest2 {

	public static void main(String[] args) throws IOException {
		File f=new File("a.txt");
		FileOutputStream fop=new FileOutputStream(f);
		//����FileOutputStream�����ļ������ڻ��Զ��½�
		OutputStreamWriter writer=new OutputStreamWriter(fop,"UTF-8");
		//����OutputStreamWriter���󣬲�������ָ�����룬Ĭ��Ϊ����ϵͳĬ�ϱ��룬windows��gbk;
		writer.append("��������");
		//д�뵽������
		writer.append("\r\n");
		//����
		writer.append("English");
		//ˢ�»���壬д�뵽�ļ�����������Ѿ�û��д��������ˣ�ֱ��closeҲ��д��
		writer.close();
		//�ر�д������ͬʱ��ѻ���������д���ļ������������ע�͵�
		fop.close();
		//�ر���������ͷ�ϵͳ��Դ
		FileInputStream fip=new FileInputStream(f);
		//����FileInputStream����
		InputStreamReader reader=new InputStreamReader(fip,"UTF-8");
		//����InputStreamReader���󣬱�����д����ͬ
		StringBuffer sb=new StringBuffer();
		while(reader.ready()) {
			sb.append((char)reader.read());
			//ת��char�ӵ�StringBuffer������
		}
		System.out.println(sb.toString());
		reader.close();
		//�رն�ȡ��
		fip.close();
		//�ر����������ͷ�ϵͳ��Դ
		

	}

}
