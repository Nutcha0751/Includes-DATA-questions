package Capacity;

public class Array {
    public static void main(String[] args){
        DinamicArray a = new DinamicArray(4);
        a.pushBack(7);
        a.pushBack(8);
        a.pushBack(9);
        a.pushBack(10);
        int b = a.popBack();
        a.printAll();
        System.out.println(" " + b);
    }
}
//run โดย 
//(1)cd "d:\Data\TestYourSelf"
//(1)javac Capacity\DinamicArray.java Capacity\Array.java

//(2)java -cp "d:\Data\TestYourSelf" Capacity.Array