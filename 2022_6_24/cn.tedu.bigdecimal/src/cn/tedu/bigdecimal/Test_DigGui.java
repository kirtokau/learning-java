package cn.tedu.bigdecimal;
//递归：不断地调用方法本身
import java.io.File;

public class Test_DigGui {

	public static void main(String[] args) {
		// 指定要求哪个目录的总大小
		File file =new File("D:\\teach\\a");
		
		//求目录大小
		long total=size(file);
		System.out.println(total);
	}
        private static long size(File file) {
         //列出文件夹下的所有资源listFiles()
        	File fs[]=file.listFiles();
         //遍历数组，获取每个文件对象
        	long sum=0;//定义变量,记录总和
        	for(int i=0;i<fs.length;i++) {
        		File f=fs[i];//获取当前资源
        //判断当前资源是文件还是文件夹
        		if(f.isFile()) {
        			//是文件，求文件的字节量大小length()求和就行
        			sum+=f.length();//相当于sum=sum+f.length()
          		}else if(f.isDirectory()) {
          			//--是文件夹，继续干1和2的任务---发生了递归的现象，就是在方法内部发生的业务和方法本身一样
          			sum+=size(f);
          		}
        	}
        
        return sum;//把sum记录的值返回调用位置
 }
}
