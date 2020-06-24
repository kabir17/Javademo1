package fruits;

public class Mango {

    static String name = "Fruits";

    String fruitName;
    int piece;
    double priece;
    boolean isFruit;

    public Mango(){
    }

    public Mango(String fruitName,int piece){
        this.fruitName = fruitName;
        this.piece = piece;
    }
    public Mango(String fruitName,int piece,double priece,boolean isFruit){
        this.fruitName = fruitName;
        this.piece = piece;
        this.priece = priece;
        this.isFruit= isFruit;
    }
    public void displayLoop(){
        int i=0;
        while (i<1){
            System.out.println("while loop Mango");
            for (int j=0; j<2; j++){
                System.out.println("for loop mango");
            }
            int k=0;
            do{
                System.out.println("do..while loop mango");
                k++;
            }while (k<3);
            i++;
        }
    }
    public String stringValue(){

        for (int i=0; i<3; i++){
            System.out.println("Hello");
        }
        return "Thank you";
    }
    public void mangoLogic(){
        int i= (int)(Math.random()*10);
        System.out.println(i);

        if(i==9){
            System.out.println("equal to mango");
        }
        else if(i==5 && i==5){
            System.out.println("&& Mango");
        }
        else if(i==4 || i==2){
            System.out.println("|| Mango");
        }
        else if(i<2){
            System.out.println("Less then mango");
        }
        else if(i>8){
            System.out.println("Greater then mango");
        }
        else if(i!=6){
            System.out.println("Not equal Mango");
        }
        else {
            System.out.println("else Mango");
        }
    }
    public int mangoMultiply(int a){
        int total= a *10;
        return total;
    }
    public void randomNumber(){
        int i= (int) (Math.random()*1000);
        System.out.println(i);
    }
    public void number(){
        int i = (int) (Math.random()*10);
        int j = 0;
        while (j<i){
            System.out.println(i);
            j++;
        }
    }
    public void evenOdd(){
        int i= (int)(Math.random()*2);
        System.out.println("Random number: "+i);

        if (i==0 || i==2){
            System.out.println("Even number");
        }
        if(i==1){
            System.out.println("Odd number");
        }
    }
}
