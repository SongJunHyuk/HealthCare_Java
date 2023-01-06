import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		try {
			int[] intArr = new int[3];
			int i = intArr[3];

		}catch(Exception e) {
			//throw new FileNotFoundException();
			System.out.println("예외!");
		}
		
	}

}
