package fish;

public class Tuna {

    static String fishPlatform = "Atlantic Ocean";

    String fishName;
    int piece;
    double cost;
    boolean isAlive;
    char size;

    public Tuna(){}

    public Tuna(String fishName,int piece,double cost){
        this.fishName = fishName;
        this.piece    = piece;
        this.cost = cost;
    }
    public Tuna(String fishName,int piece,double cost,boolean isAlive,char size){
        this.fishName = fishName;
        this.piece    = piece;
        this.cost = cost;
        this.isAlive =isAlive;
        this.size = size;
    }

    public void display(){
        int i= (int)(Math.random()*10);
        System.out.println(i);

        if(i==7){
            System.out.println("Tuna fish");
        }
        else if(i==3){
            System.out.println("One piece of Tuna fish");
        }
        else if(i==9){
            System.out.println("$10.00");
        }
        else if(i==0){
            System.out.println("false");
        }
        else if(i==2){
            System.out.println("B");
        }
        else
            System.out.println("No msg");
    }
    public String stringValue(){
        int i=5;
        do {
            System.out.println("Tuna fish");
            i++;
        }while (i<2);
        return "";
    }
    public int tunaPriece(int a){
        int total =  a *2;
        return total;
    }
    public int addition(int a){
        int total= a +5;
        return total;
    }
    public int divide(int a){
        int total = a /2;
        return total;
    }
    public boolean isBoolean(){
        int i= 10;

        if(i<5){
            System.out.println("true");
        }
        return true;
    }
    public boolean trueFalse(){
        int i = (int)(Math.random()*10);
        System.out.println(i);

        if(i==5 && i==5){
            System.out.println("&& true");
        }
        else if(i==9 || i==6){
            System.out.println("|| true");
        }
        else if(i<2){
            System.out.println("less then true");
        }
        else if(i>9){
            System.out.println("Greater then true");
        }
        else if(i==7){
            System.out.println("Equal to true");
        }
        else if(i!=10){
            System.out.println("Not equal to msg");
        }
        else
            System.out.println("else msg");
        return true;
    }
}
