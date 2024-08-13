//เขียนโปรแกรมหาค่าที่มากที่สุด

public class FindTheMaximumValue{
    public static int findMax(int[] x){
        int theWinner = x[0];
        for(int i = 0; i < x.length; i++){
            if(x[i] > theWinner){
                theWinner = x[i];
            }
        }
    
        return theWinner;
    }
    public static void main(String[] arg){
        int[] x = {5, 6, 70, 8};
        int max = findMax(x);
        System.out.println(max);
    }
}