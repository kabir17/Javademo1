package fish;

import java.util.Scanner;

public class fishRunner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        System.out.println("Enter any number : ");
        num = input.nextInt();

        System.out.println("Use Scanner for number :"+num);

        Salmon sobj = new Salmon("salmon",2,20.00);
        sobj.valueString();
        sobj.fishCost();
        sobj.valueOfBoolean();
         sobj.welcomeFish();
         sobj.pyramid();

        Shrimp shrmobj = new Shrimp();
        shrmobj.display();
        shrmobj.shrimpValue(2,15);
          shrmobj.booleanValue();
        shrmobj.booleanTrue();
        shrmobj.trueFalse();

        Tuna tobj = new Tuna();
        tobj.display();
        tobj.stringValue();
        System.out.println("Tuna priece : "+tobj.tunaPriece(50));
        System.out.println("Addition : "+tobj.addition(10));
        System.out.println("Divide : "+tobj.divide(20));
        System.out.println(tobj.isBoolean());
        System.out.println(tobj.trueFalse());
        shrmobj.oddEven();
        shrmobj.oddEvenNumber();
    }
}
