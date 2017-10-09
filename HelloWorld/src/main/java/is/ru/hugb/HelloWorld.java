package is.ru.hugb;
import org.joda.time.DateTime;
public class HelloWorld {  
 	 public static void main(String[] args) { 
 	 	DateTime today = new DateTime();
 	 	System.out.println("Today is a: " +
 	 		today.dayOfWeek().getAsText());    
  	}
  }
