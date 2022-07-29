import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortCompare {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer>list=new ArrayList<>();
		//读取a.txt文件
		BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream("D:\\eclipse\\eclipseworkspace\\Merge\\src\\reverse_arr.txt")));
		String line=null;
		while((line=reader.readLine())!=null) {
			//把每一个数字存入到集合中
			list.add(Integer.valueOf(line));			
		}
		reader.close();
		//把集合转换成数组
		Integer[] arr=new Integer[list.size()];
		list.toArray(arr);
		testMerge(arr);//使用归并排序耗时：1200
   //testShell(arr);//使用希尔排序耗时：1277

	}

	private static void testMerge(Integer[] arr) {
		// 使用插入排序完成测试
		long start=System.currentTimeMillis();
		Merge.sort(arr);
		long end=System.currentTimeMillis();
		System.out.println("使用归并排序耗时："+(end-start));
		
	}
	public static void testShell(Integer[] arr) {
		//使用希尔排序完成测试
		long start=System.currentTimeMillis();
		shellsort.sort(arr);
		long end=System.currentTimeMillis();
		System.out.println("使用希尔排序耗时："+(end-start));
	}

}
