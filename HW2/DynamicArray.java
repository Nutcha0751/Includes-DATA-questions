package HW2;

public class DynamicArray {
    private int[] arr;
    private int capacity;
    private int size;// Last element can be indexed at size-1
    
    public DynamicArray(int cap){ // Class Constructor
        arr = new int[cap];
        capacity = cap;
    }
    
public void PushBack(int data) {

    if (size == capacity) { //ถ้าจำนวนเท่ากับความจุ

        int newCap = capacity * 2;  //ให้ความจุใหม่มี2เท่า
        int[] newarr = new int[newCap];  //กำหนดarrใหม่เปล่าๆค.จุ2เท่าไว้ก๊อปเนื้อหาarrเดิม
        for (int i = 0; i < capacity; i++) {
            newarr[i] = arr[i]; //ทำfor loopไว้ก๊อปเนื้อหาarrเดิมมาใส่ใหม่
        }
        arr = newarr; //กำหนดให้arrมีค่าเท่ากับnewarr
        capacity = newCap; //อัปเดตความจุว่าเท่ากับค.จุใหม่
    }
    

    arr[size] = data; ;//ให้ตัวสุดท้ายเป็นค่าที่รับมา
    size++; //อัปเดตจำนวนสมาชิกเพิ่ม
}
    public int PopBack(){
        if(size == 0){
            System.out.println("ERROR");
        } //ถ้า Data structure ว่างหรือไม่มีข้อมูลอยู่ ให้แสดงคำว่า ERROR ออกมา
        else{
            int temp = arr[size - 1];
            size--;
            return temp;
        } //ถ้า Data structure ไม่ว่างหรือมีข้อมูลอยู่ ให้ size ลดลง 1 ในตัวแปรชื่อ temp แล้ว return temp ออกมา
        return 0;
    }

    public int Get(int i) { // return "Error" ถ้า i น้อยกว่า 0 หรือ มากกว่า ขนาดของ arr ถ้าไม่ก็ return ตำแหน่งนั้นๆ ให้
        if (i < 0 || i >= size) {
            System.out.println("ERROR");
            return 0;
        }
        return arr[i];
    }
    
    public void Set(int i, int value){
         if(i >= 0 && i < size){
            arr[i] = value;
         } //ทำการเซตvalueไปที่ตำแหน่งarray ที่รับค่า i เมื่อค่า iมีค่าตั้งแต่0ขึ้นไป แต่ไม่มากกว่าขนาดของarray
         else{
            System.out.println("ERROR");
         }//ในกรณีที่i น้อยกว่า 0 หรือมากกว่าหรือเท่ากับขนาดของarray ให้ปริ้น "ERROR"
    }
    
    public void Remove(int i){
        if (i < 0 || i >= size) {
        System.out.println("ERROR");
        return;
    } // i น้อยกว่า 0 หรือมากกว่าหรือเท่ากับขนาดของอาเรย์  จะพิมพ์คำว่า "ERROR" แล้ว return เมื่อสิ้นสุดการทำงาน
    // เลื่อนตำแหน่ง
    for (int j = i; j < size - 1; j++) {
        arr[j] = arr[j + 1];
    } // ลูปนี้เริ่มต้นจากตำแหน่ง i และทำงานไปจนถึงตำแหน่งก่อนสุดท้าย (size - 1)ในแต่ละรอบของลูป ที่ตำแหน่ง j จะถูกแทนที่ที่ตำแหน่ง j + 1 ทำให้หลังจากตำแหน่ง i ถูกเลื่อนไปซ้ายหนึ่งตำแหน่ง
    size--;
    } // หลังจากเลื่อน ขนาดของอาเรย์จะถูกลดลงหนึ่ง (size--) เพื่อลบที่ตำแหน่งสุดท้าย
    
    public boolean IsEmpty() {
        return size == 0; // ถ้า size == 0 return true ถ้าไม่ return false
    }
    
    public int GetSize(){
        return size; // return จำนวนข้อมูลที่บรรจุ ซึ่งค่าเหล่านั้นอยู่ใน size
    }
    
    public void PrintStructure(){
        System.out.print("Size = " + size + ", Cap = " + capacity + ", arr = [ ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        if (size == 0) {
            System.out.println("]");
        } else System.out.println(" ]");
    }
}