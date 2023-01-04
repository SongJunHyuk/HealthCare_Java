
public class Type {

	public static void main(String[] args) {
	      // Primitive Type
	      int num = 10;      
	      char ch = 'A';
	      boolean isTrue = false;
	      
	      long bigNum = 1000000000L;
	      double percent = 0.37;
	      
	      byte b = 20;
	      short s = 30;
	      float f = 3.33f;
	      
	      // Reference Type
	      String str = "안녕하세요, Reference Type 입니다. 길어도 됩니다.";
	      String str2 = "문자열은 immutable 입니다.";
	      
	      String str3 = str + str2;
	      System.out.println(str3);
	      
	      StringBuilder sb = new StringBuilder();
	      sb.append("ABC").append("DEF").append("GHI");
	      System.out.println(sb);
	      
	      String hello1 = "hello";
	      String hello2 = "hello";
	      
	      if( hello1 == hello2 ) System.out.println("same");
	      if( hello1.equals( hello2 ) ) System.out.println("same");
	}
}