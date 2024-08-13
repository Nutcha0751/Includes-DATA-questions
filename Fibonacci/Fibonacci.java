package Fibonacci;
public class Fibonacci {
    public static long fibo(int n){
        long[] f = new long[n+1]; //+1 เพราะมี index ตำแหน่ง 0 ถ้าไม่ +1 จะ error (ex.เก็บ 5 ตัว แต่เราพยายามเก็บเพิ่มอีก 1 ตัว นั่นคือ index 0)
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= n; i++){
            f[i] = f[i-1] + f[i-2];
        };

        return f[n];
    };
    public static void main(String[] arg){
        System.out.println(fibo(50));
    }
}