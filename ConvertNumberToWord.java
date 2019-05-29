import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertNumberToWord extends ConvertNumberToWordImpl{

    
    public static void main(String[] args) {
    	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String number = null;
	try {
		System.out.println("Enter Number to convert word :");
		number = reader.readLine();
		if(isNumeric(number)){
			if(number.length()<=9){
				System.out.println("Number is in words :"+numberToWord(Integer.parseInt(number)));
			}else{
				System.out.println("Please enter lower number");
			}
			
		}
	} catch (IOException e) {
		System.out.println("Unable to read input"+e);
	}
	}
    

}
