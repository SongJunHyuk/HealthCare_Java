
public class Condition2 {

	public static void main(String[] args) {
		
			int num = 0;
	       // switch
	       switch( num ){
	         case 0 : System.out.println("3 의 배수"); break;
	         case 1 : System.out.println("3 의 배수 + 1"); break;
	         default : System.out.println("3 의 배수 - 1");
	       }

	       // 삼항 연산자
	       String result = num % 2 == 0 ? "짝수" : "홀수";
	       System.out.println( result );

	}
}