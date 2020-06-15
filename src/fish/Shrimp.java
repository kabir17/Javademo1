package fish;

public class Shrimp {

    static String fishPlatform = "Atlantic Ocean";

    String fishName;
    int piece;
    double cost;
    char size;
    boolean isAlive;


    public Shrimp (){
    }
    public Shrimp(String fishName,int piece,double cost){
       this.fishName = fishName;
       this.piece    = piece;
       this.cost     = cost;
    }
    public Shrimp (String fishName,int piece,double cost,char size,boolean isAlive){
        this.fishName = fishName;
        this.piece = piece;
        this.cost = cost;
        this.size = size;
        this.isAlive = isAlive;
    }
    public void display(){
        int i=0;
        while (i<1){
            System.out.println("Fish name");
            System.out.println("piece");
            System.out.println("Cost");
            System.out.println("size");
            System.out.println("IsAlive");
            i++;
        }
    }
    public int shrimpValue(int num1,int num2){
        int total= (num1 * num2);
        System.out.println("Shrimp value : "+total);
        return total;
    }
    public boolean booleanValue(){
        int a= (int)(Math.random()*10);
        System.out.println(a);

        if(a==10 || a==6){
            System.out.println("true");
        }else if (a==9 || a==0){
            System.out.println("true");
        }else if(a==4 || a==7){
            System.out.println("true");
        }
        else
            System.out.println("false");
            return true;
    }
    public boolean booleanTrue(){
        int i=5;
        if (i==5 && i==5){
            System.out.println("true");
        }else
            System.out.println("false");
            return true;
    }
    public boolean trueFalse(){
        int x= (int)(Math.random()*5);
        System.out.println(x);

        if(x==3 && x==3){
            System.out.println("true");
        }else
            System.out.println("false");
        return false;
    }
}
