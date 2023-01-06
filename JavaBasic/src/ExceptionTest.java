import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {

	public static void main(String[] args) {
	      File f= new File("hello");
	      f.mkdir();
	      try {
	    	  FileInputStream fis = new FileInputStream("hello.txt");
	      } catch(FileNotFoundException e){
	    	  
	      }
	      
	}
}