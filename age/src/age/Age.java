
package age;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Person's Age:");
        age=sc.nextInt();
        
        if(age>=14 && age<30)
        {
            System.out.println("Young Person");
        }
        else
        {
            System.out.println("Not Young Person");
        }
       
    }
    
}
