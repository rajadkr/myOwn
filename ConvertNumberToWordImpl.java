
public class ConvertNumberToWordImpl implements NumberToWordConver{
	public static String numberToWord(int number) {
        if(number == 0)
            return ZERO;

        return convert(number).trim();
    }

    public static String convert(int number) {
        if(number >= 1000000000) {
            return convert(number / 1000000000) + " billion " + convert(number % 1000000000);
        }
        else if(number >= 1000000) {
            return convert(number / 1000000) + " million " + convert(number % 1000000);
        }
        else if(number >= 1000) {
            return convert(number / 1000) + " thousand " + convert(number % 1000);
        }
        else if(number >= 100) {
            return convert(number / 100) + " hundred and " + convert(number % 100);
        }

        return convertBelowHundred(number);
    }

    private static String convertBelowHundred(int number) {
        if (number == 0)
            return "";
        if (number <= 9)
            return oneToNine[number - 1];
        else if (number <= 19)
            return tenToNinteen[number % 10];
        else {
            return tens[number / 10 - 1] + " " + convertBelowHundred(number % 10);
        }
 			  }
    public static boolean isNumeric(String number) { 
  	  try {  
  	    Integer.parseInt(number);  
  	    return true;
  	  } catch(NumberFormatException e){  
  		  System.out.println("Please enter a number");
  	    return false;  
  	  }  
  	}
}

