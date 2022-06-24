package cn.tedu.bigdecimal;

import java.io.File;

public class Test4_DiGui2 {
//递归删除目录
//需求：递归删除文件夹 D:\teach\a2
	public static void main(String[] args) {
		//指定你想要删除的文件夹
		File file =new File("D:\\teach\\m2");
		del(file);//删除文件
	}
	private static void del(File file) {
		//列出文件夹下的所有资源listFiles()
		File[] fs=file.listFiles();
		for(int i=0;i<fs.length;i++) {
			File f=fs[i];
		//判断当前资源是文件还是文件夹
			if(f.isFile()){
				//--是文件,直接删除delete()
				f.delete();				
			}else if(f.isDirectory()) {
				//--是文件夹，继续干1和2的任务 --递归 在del方法内部再调用自己
				del(f);
			}
		}
		file.delete();//删除文件夹
	}

}
