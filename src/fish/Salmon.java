package fish;

public class Salmon {

    static String fishPlatform = "Atlantic Ocean";

    String fishName;
    int piece;
    double cost;
    boolean isAlive;
    char size;

    public Salmon (){}

    public Salmon (String fishName,int piece,double cost){
        this.fishName = fishName;
        this.piece    = piece;
        this.cost = cost;
    }
    public Salmon (String fishName,int piece,double cost,boolean isAlive,char size){
        this.fishName = fishName;
        this.piece    = piece;
        this.cost = cost;
        this.isAlive =isAlive;
        this.size = size;
    }
    public void disPlay(){
        System.out.println("Fish name : "+fishName);
        System.out.println("Fish pieces : "+piece);
        System.out.println("Fish cost : "+cost);
        System.out.println("Is fish alive : "+isAlive);
        System.out.println("Fish size : "+size);
    }
    public String valueString(){
        int i=0;
        do {
            System.out.println("Salmon fish");
            i++;
        }while (i<3);
            return "";
    }
    public int fishCost(){
        int num = (int)(Math.random()*5);
        System.out.println(num);

        if(num==4){
            System.out.println("4 Fish cost : "+num*20);
        }
        else
            System.out.println("No fish count");
        return num;
    }
    public boolean valueOfBoolean(){
        int num = (int)(Math.random()*10);
        System.out.println(num);

        if(num==5 && num==5){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        return false;
    }
    public String welcomeFish(){
        int i=0;
        while (i<3){
            System.out.println("While loop fish");  //

            for(int j=0; j<3; j++){
                System.out.println("for loop fish");

                int k=0;
                do{
                    System.out.println("do..while loop fish");
                    k++;
                }while (k<3);
            }
            i++;
        }
        return "";
    }
    public void pyramid(){
        int i=0;
        while (i<2){
            System.out.println(" *");
            for (int j=0; j<3; j++){
                System.out.println(" **");
                int k=0;
                do {
                    System.out.println("* ");
                    k++;
                }while (k<1);
            }
            i++;
        }
    }
}
