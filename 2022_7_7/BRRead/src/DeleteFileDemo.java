import java.io.File;

public class DeleteFileDemo {

	public static void main(String[] args) {
		// �����޸�Ϊ�Լ��Ĳ���Ŀ¼
		File folder=new File("/tmp/java/");
		deleteFolder(folder);

	}
	//ɾ���ļ���Ŀ¼
	public static void deleteFolder(File folder) {
		File[] files=folder.listFiles();
		if(files!=null) {
			for(File f:files) {
				if(f.isDirectory()) {
					deleteFolder(f);
				}else {
					f.delete();
				}
			}
		}
		folder.delete();
	}

}