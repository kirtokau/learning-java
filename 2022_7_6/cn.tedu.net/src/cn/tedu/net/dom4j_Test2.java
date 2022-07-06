package cn.tedu.net;

import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class dom4j_Test2 {
	public static void removeNode() {
		String oldStr="c:/text.xml";
		String newStr="C:/text1.xml";
		Document document=null;
		try {
			SAXReader saxReader=new SAXReader();//用来读取xml文档
			document=saxReader.read(new File(oldStr));//读取xml文档
			List<E> list=document.selectNodes("/books/book");//用xpath查找对象
			Iterator<E> iter=list.iterator();
			while(iter.hasNext()) {
				Element titleElement=(Element)iterator.next();
				if(titleElement.getText().equals("ajax in action")) {
					bookElement.remove(titleElement);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}try {
			XMLWriter writer=new XMLWriter(new FileWriter(new File(newStr)));
			writer.write(document);
			writer.close();
		} catch ( Exception ex) {
			ex.printStackTrace();
		}
	}
	

}
