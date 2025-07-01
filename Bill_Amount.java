import java.util.Scanner;

public class Bill_Amount {
    public static void main(String[] s)
    {
        float unit,amt = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the unit ");
        unit = sc.nextFloat();

        if(unit <=100)
        {
           amt = 500;
        }
        else if(unit<=200)
        {
            amt = 500 + (unit -200) *2;
        }
        else if(unit<=300)
        {
            amt = 700 +(unit-300) *3;
        }

        else if(unit<=400)
        {
            amt = 1000+(unit -400)*4;
        }
        else if(unit<=500)
        {
            amt = 1400 +(unit-500)*5;
        }

        System.out.println("The amount of bill is :"+amt);
    }


}
