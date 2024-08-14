package DynamicArray;

public class Array {
    public static void main(String[] args){
        DynamicArray a = new DynamicArray(4);
        a.pushBack(7);
        a.pushBack(8);
        a.pushBack(9);
        a.pushBack(10);
        int b = a.popBack();
        a.printAll();
        System.out.println(b);
    }
}
//run โดย 
//(1)cd "d:\Data\TestYourSelf"
//(1)javac Capacity\DinamicArray.java Capacity\Array.java

//(2)java -cp "d:\Data\TestYourSelf" Capacity.Array

/*(1)javac Array.java DinamicArray.java
(2)cd D:\Data\TestYourSelf
java DinamicArray.Array
อีกแบบ
cd D:\Data\TestYourSelf\DinamicArray
javac Array.java DinamicArray.java
java DinamicArray.Array

cd D:\Data\TestYourSelf
java DinamicArray.Array
 */