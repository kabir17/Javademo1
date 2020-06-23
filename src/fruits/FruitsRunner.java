package fruits;

import com.sun.org.apache.xpath.internal.operations.Or;

public class FruitsRunner {
    public static void main(String[] args) {

        Mango mObj = new Mango();
        mObj.displayLoop();
        System.out.println(mObj.stringValue());
        mObj.mangoLogic();
        System.out.println("Mango Multiply : "+mObj.mangoMultiply(10));
        mObj.number();
    }
}

