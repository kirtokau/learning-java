import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//使用BufferedReader在控制台读取字符
public class BRRead {

	public static void main(String[] args) throws IOException {
		char c;
		//使用System.in创建BufferedReader
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符，按下'q'键退出");
		//读取字符
		do {
			c=(char)br.read();
			System.out.println(c);
		}while(c!='q');
	}
}
