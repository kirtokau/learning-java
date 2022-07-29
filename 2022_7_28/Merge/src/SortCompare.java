import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortCompare {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer>list=new ArrayList<>();
		//��ȡa.txt�ļ�
		BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream("D:\\eclipse\\eclipseworkspace\\Merge\\src\\reverse_arr.txt")));
		String line=null;
		while((line=reader.readLine())!=null) {
			//��ÿһ�����ִ��뵽������
			list.add(Integer.valueOf(line));			
		}
		reader.close();
		//�Ѽ���ת��������
		Integer[] arr=new Integer[list.size()];
		list.toArray(arr);
		testMerge(arr);//ʹ�ù鲢�����ʱ��1200
   //testShell(arr);//ʹ��ϣ�������ʱ��1277

	}

	private static void testMerge(Integer[] arr) {
		// ʹ�ò���������ɲ���
		long start=System.currentTimeMillis();
		Merge.sort(arr);
		long end=System.currentTimeMillis();
		System.out.println("ʹ�ù鲢�����ʱ��"+(end-start));
		
	}
	public static void testShell(Integer[] arr) {
		//ʹ��ϣ��������ɲ���
		long start=System.currentTimeMillis();
		shellsort.sort(arr);
		long end=System.currentTimeMillis();
		System.out.println("ʹ��ϣ�������ʱ��"+(end-start));
	}

}
