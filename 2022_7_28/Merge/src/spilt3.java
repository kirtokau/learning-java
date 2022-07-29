import java.util.Arrays;

public class spilt3 {
  public static void main(String[] args) {
	  String str="12.34.56c";
     
      System.out.println(Arrays.toString(str.split("\\.")));
      System.out.println(Arrays.toString(str.split("\\.",1)));
      System.out.println(Arrays.toString(str.split("\\.",2)));
      System.out.println(Arrays.toString(str.split("\\.",3)));
 }
}
