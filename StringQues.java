

public class StringQues {
    public static void main(String[] args) {
        String a = "Amresh";
        System.out.println("------------Question number 1------------"); 
        System.out.println("Number of characters in the string: " + a.length());
        
         System.out.println("------------Question number 2------------"); 
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'e'|| a.charAt(i) == 'E'|| a.charAt(i) == 'a'|| a.charAt(i) == 'A' || a.charAt(i) == 'i' || a.charAt(i) == 'I' || a.charAt(i) == 'o' || a.charAt(i) == 'O' || a.charAt(i) == 'u' || a.charAt(i) == 'U') {
                count++;
            }
        }
            System.out.println("Number of vowels in the string: " + count);// count the number of vowels in the string
           System.out.println("------------Question number 3------------"); 
            String rev = ""; 

        for (int i = a.length() - 1; i >= 0; i--) {
            rev = rev + a.charAt(i); 
        }
        System.out.println("Reversed string: " + rev);  // reverse the string

         System.out.println("------------Question number 4------------"); 
        if(a.equals(rev)){
            System.out.println("The string is a palindrome.");// check if the string is a palindrome
        } else {
            System.out.println("The string is not a palindrome.");
        }
 System.out.println("------------Question number 5------------"); 
		String s = "This language is Java";
        int p=0;
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)== ' ')
			p++;
		}
		System.out.println("Number of spaces in string: " + p);             // count of space in string
	
        System.out.println("------------Question number 6------------"); 
        String m="amresh7355";
        int digitCount = 0;
        for (int i = 0; i < m.length(); i++) {
            if (Character.isDigit(m.charAt(i))) {
                digitCount++;              // count the number of digits in the string
            }
        }
        System.out.println("Number of digits in string: " + digitCount);
         System.out.println("------------Question number 7------------"); 
        System.out.println("String in uppercase: " + s.toUpperCase()); // convert the string to uppercase

         System.out.println("------------Question number 8------------"); 
        String n="JAVA";
        for(int i=0;i<n.length();i++) {
            
                System.out.println( n.charAt(i));  // print each character of the string in a new line
            }

             System.out.println("------------Question number 9------------"); 
            String Space = s.replace(" ", "");  // remove all spaces
        System.out.println("String without spaces: " + Space);
        }
    }


    

    

