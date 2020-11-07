package Basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {
	
  public static void main(String[] args){
    		System.out.println("Current System Data & Time" + DateStamping());
   }

  //Data Stamping 
  public static String  DateStamping(){
    		Date date = new Date();
    		
    		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YY HH:mm:ss");
    		String DateTime = sdf.format(date);
    		return DateTime;
    }

 }







