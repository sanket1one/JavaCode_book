import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1= scanner.nextLine();
        String string2= scanner.nextLine();
        String string3= scanner.nextLine();

        System.out.println("================================");
        char[] string;
        String[] stringArray  = {string1,string2,string3};
        StringBuilder character = new StringBuilder();
        StringBuilder integer  = new StringBuilder();
        int stringInt;
        scanner.close();
        
        for(String y: stringArray)
        {
            string = y.toCharArray();
            for(char x: string)
            { 
                if(Character.isDigit(x)) {
                    integer.append(Character.getNumericValue(x));
                }else {
                    character.append(x);
                }
            }
            stringInt = Integer.parseInt(integer.toString());
            System.out.printf("%-15s",character);
            System.out.printf("%03d \n",stringInt);
            character.delete(0,character.length());
            integer.delete(0,integer.length());
        }        
            System.out.println("================================");

    }
}



