import java.util.Scanner;

public class task {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password:");
        String password = sc.next();

        StringBuilder symbols = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder characters = new StringBuilder();

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isLetter(ch)) {
                characters.append(ch);
             
            } else if (Character.isDigit(ch)) {
                numbers.append(ch);
               
            } else {
                symbols.append(ch);
           
            }
        }

        System.out.println("Letters: " + characters+"  characters length :"+characters.length());
        
        System.out.println("Digits: " + numbers+"   numbers  length: "+numbers.length());
      
        System.out.println("Symbols: " + symbols+ "   symbols length: "+ symbols.length());
      
        sc.close();
    }
}