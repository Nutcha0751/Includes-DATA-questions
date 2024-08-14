package DinamicArray;

public class DinamicArray {
    int[] arr;
    int capacity;
    int size;

    public DinamicArray(int capacity){
        this.capacity = capacity;
        size = 0;
        arr = new int[capacity];
    };

    public void pushBack(int value){
        arr[size] = value;
        size++;
    };

    public int popBack(){
        int tmp = arr[size-1]; //ตัวสุดท้าย
        size--;
        return tmp;
    };

    public void printAll(){
        for(int i = 0; i < size; i++){
            System.out.println(arr[i] + ", ");
        };
        System.out.println("");
    }
}
