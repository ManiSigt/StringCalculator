package is.ru.stringcalculator;
import java.util.ArrayList;

public class Calculator {  
  	public static int add(String text){
  		if(text.equals("")){
  			return 0;  	
  		}
  		if(text.contains(",") || text.contains("\n")){
  			return sum(split(text));
  		}
  		else {
  			return 1;
  		}	
  	}
  	private static int toInt(String number){
  		return Integer.parseInt(number);
  	}
  	private static String[] split(String number){
  		String del = ",|\n";
		if (number.startsWith("//")){
			int delindex = number.indexOf("//") + 2; 
			del = del + "|" + number.substring(delindex, delindex + 1); 
			number = number.substring(delindex + 2); 
			return number.split(del);
		}
		else {
			return number.split(del);	
		}
  	}
  	private static int sum(String [] numbers){
  		ArrayList<Integer> negative = new ArrayList<Integer>();
  		int total = 0;
  		for(String number : numbers){
  			int numberin = toInt(number);
  			if(numberin < 0){
  				negative.add(numberin);
  			}else{
  				if(numberin > 1000){
  					continue;
  				}else{
  				total += numberin;
  				}
  			}
  		}
  		if(negative.size() > 0){
  			throw new RuntimeException("Negatives not allowed: " + negative);
  		}
  		return total;
  	}
  }
