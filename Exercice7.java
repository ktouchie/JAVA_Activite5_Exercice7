import java.util.*;
class Exercice7 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Veuillez saisir un nombre naturel:"); //* Get number */
        int num = sc.nextInt(); //* Store number as n */
        String str = Integer.toString(num); //* Store n as string *//
        
        char digit[] = {'0','1','2','3','4','5','6','7','8','9'};
        int count = 0;
        
        for (int i=0; i<10; i++) {
            for (int j=0; j<(str.length()); j++) {
                if (str.charAt(j) == digit[i]) {
                    count++;
                }
            }
            if (count>0) {
                System.out.println(digit[i] + " apparait " + count + " fois.");
                count = 0;
            }            
        }
    }
}