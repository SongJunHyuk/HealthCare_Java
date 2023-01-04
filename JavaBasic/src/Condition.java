
public class Condition {

	public static void main(String[] args) {
	      // 초기화
	       int num = 10;
	       boolean isEven = false;

	       if( num == 10 && isEven == false ) System.out.println(1);
	       if( num == 10 && ! isEven ) System.out.println(2);
	       if( num != 20 && isEven == false ) System.out.println(3);

	       if( num == 10 || isEven == true ) System.out.println(4);
	       if( num == 20 && isEven ) System.out.println(5); // 출력 X

	       System.out.println();
	       
	       if( isEven == true && num++ > 5 ) System.out.println( num ); // 출력 X, 앞 false
	       System.out.println( num ); // 10, 뒤 코드 실행 X
	       if( isEven == true & num++ > 5 ) System.out.println( num ); // 출력 X
	       System.out.println( num ); // 11, 뒤 코드 실행 O
	       
	       System.out.println();
	       
	      num = 10; // 초기화
	      if( isEven == false || num++ > 5 ) System.out.println( num ); // 출력 10, 앞 true
	      System.out.println( num ); // 10, 뒤 코드 실행 X
	      if( isEven == false | num++ > 5 ) System.out.println( num ); // 출력 11
	      System.out.println( num ); // 11, 뒤 코드 실행 O

	}

}
