package cn.tedu.net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

import javax.lang.model.element.Element;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class dom4j_Test1 {
	public static Document load(String filename) {
		Document document=null;
		try {
			SAXReader saxReader=new SAXReader();
			document=saxReader.read(new File(filename));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	return document;
   }	
	public static boolean doc2XmlFile(Document document,String filename) {
		boolean flag=true;
		try {
			XMLWriter writer=new XMLWriter(new OutputStreamWriter(new FileOutputStream(filename),"utf-8"));
			writer.write(document);
			writer.close();
		} catch (Exception ex) {
			flag=false;
			ex.printStackTrace();			
		}
		System.out.println(flag);
		return flag;
	}
	public void writeTo(OutputStream out,String encoding) throws IOException {
		OutputFormat format=OutputFormat.createPrettyPrint();
		format.setEncoding("gb2312");
		XMLWriter writer=new XMLWriter(System.out,format);
//		writer.write(doc);
		writer.flush();
		return;
	}
	public boolean isOnly(String catNameEn,HttpServletRequest request,String xml) {
		boolean flag=true;
		String path=request.getRealPath("");
		Document doc=load(path+"/"+xml);
		Element root=(Element) doc.getRootElement();
		for(Iterator<E> i=root.elementIterator();i.hasNext();) {
			Element el=(Element)i.next();
			if(catNameEn.equals(elementTextTrim("engName"))) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		String fileName="C:/text.xml";
		Document document=DocumentHelper.createDocument();//����document������������xml�ļ�
		Element booksElement=(Element) document.addElement("books");//�������ڵ�
		booksElement.addComment("This is a test for dom4j");//����һ��ע��
		Element bookElement=booksElement.addElement("book");//���һ��book�ڵ�
		booksElement.addAttribute("show","yes");//�����������
		Element titleElement=bookElement.addElement("title");//����ı��ڵ�
		titleElement.setText("ajax in action");//����ı�����
		try {
			XMLWriter writer=new XMLWriter(new FileWriter(new File(filename)));
			writer.write(document);//д��
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
