import java.util.Vector;

public class Enumeration {

	public static void main(String[] args) {
		java.util.Enumeration<String> days;
		Vector<String>dayNames=new Vector<String>();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		days=dayNames.elements();
		while(days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}
	}
}
