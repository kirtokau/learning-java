/* 
 * HTML�ĵ���־ƥ���㷨
 */ 
import java.util.StringTokenizer; 
import dsa.Stack; 
import dsa.Stack_List; 
import java.io.*; 
//���HTML�ĵ�������ƥ��
public class HTML { 
 
//Ƕ���࣬���HTML��־
   public static class Tag { 
    String name;//��־��
    boolean opening;//��ʼ��־
    public Tag() {//Ĭ�Ϲ��췽��
  name = ""; 
  opening = false; 
  } 
  public Tag(String nm, boolean type) {//���췽��
  name = nm; 
  opening = type; 
  } 
  public boolean isOpening() { return opening; }//�ж��Ƿ���ʼ��־
  public String getName() { return name; }//���ر�־����
  } 
 //ͨ��������ʾƥ���־�Ĳ��
  private void indent(int level) { 
  for (int k=0; k<level; k++) System.out.print("\t��"); 
 }
 //���ÿ����ʼ��־�Ƿ񶼶�Ӧ��һ��������־
  public boolean isHTMLMatched(Tag[] tag) { 
 int level = 0;//��־�Ĳ��
 
 Stack S = new Stack_List();//��ű�־��ջ

   for (int i=0; (i<tag.length) && (tag[i] != null); i++) {//��һ������־
   if (tag[i].isOpening()) {//��������ʼ��־����
   S.push(tag[i].getName());//ѹ֮��ջ
  indent(level++); System.out.println("\t��"+tag[i].getName()); 
  } else {//���򣬼���ǰ��־Ϊ������־����
 if (S.isEmpty())//����ʱջ�գ���
 return false;//����"��ƥ��" 
 if (!((String) S.pop()).equals(tag[i].getName())) 
 //��������ǰ��־�뵯���ı�־��ƥ�䣬��
 return false;//����"��ƥ��" 
  indent(--level); System.out.println("\t��"+tag[i].getName()); 
  }
 }
  //���ˣ���ɨ���������ĵ�
  if (S.isEmpty())//����ʱջΪ�գ���
  return true;//����"ƥ��" 
  else//����
  return false;//����"��ƥ��" 
  }//isHTMLMatched 
  public final static int CAPACITY = 1000;//������������
  //��HTML�ĵ�����ȡ��־�����δ�������
  public Tag[] parseHTML(BufferedReader r) throws IOException { 
  String line;//�ĵ��е�һ��
  boolean inTag = false;//��־����ǰ�Ƿ�ɨ�赽��־
  Tag[] tag = new Tag[CAPACITY];//��ű�־������
   int count = 0;//��־�ļ�����
  while ((line = r.readLine()) != null) {//���ζ����ĵ��ĸ���
  StringTokenizer st = new StringTokenizer(line,"<> \t",true);
  while (st.hasMoreTokens()) { 
	 String token = (String) st.nextToken(); 
	 if (token.equals("<"))//��ɨ�赽'<'��˵����������һ��־����
	 inTag = true;//����ǰ״̬��Ϊ"����ɨ���־" 
	 else if (token.equals(">"))//��ɨ�赽'>'��˵����һ��־ɨ����ϣ���
	 inTag = false;//����ǰ״̬��Ϊ"���ڱ�־֮��" 
	 else if (inTag) { //������ɨ��һ����־
	 if ( (token.length() == 0) || (token.charAt(0) != '/') ) 
	 //������ʼ��־����
		 tag[count++] = new Tag(token, true);//����֮
	 else//����
	 tag[count++] = new Tag(token.substring(1), false); 
	 //����һ��������־���������ַ�'/'��
	 }//��ע�⣺���зǱ�־���־���������
	 }
	 } 
	 return tag;//���ر�־����
	 
	 	 
	 }
	//������main����
	 public static void main(String[] args) throws IOException { 
		 
	 BufferedReader stdr = new BufferedReader(new InputStreamReader(System.in));//��׼
	����
	 HTML tagChecker = new HTML(); 
	
	 if (tagChecker.isHTMLMatched(tagChecker.parseHTML(stdr))) 
	 System.out.println("���ļ�����HTML�ı�־ƥ��"); 
	 else 
	 System.out.println("���ļ�������HTML�ı�־ƥ��"); 
	 } 
	} 
