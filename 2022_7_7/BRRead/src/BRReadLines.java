import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//使用BufferedReader在控制台读取字符
public class BRReadLines {

	public static void main(String[] args) throws IOException {
		//使用system.in创建BufferedReader
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter lines of text.");
		System.out.println("Enter 'end' to quit.");
		do {
			str=br.readLine();
			System.out.println(str);
		}while(!str.equals("end"));
	}
}
