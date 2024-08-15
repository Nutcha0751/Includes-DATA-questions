package test261217;

public class StToIntAndSum {
    public static int calculateString(String text){
        String[] textArray = text.split(" ");
        String oper = textArray[1];

        int a = Integer.parseInt(textArray[0]);
        int b = Integer.parseInt(textArray[2]);

        if(oper.equals("+")){
            return a + b;
        }
        else if(oper.equals("-")){
            return a - b;
        }
        else if(oper.equals("*")){
            return a * b;
        }
        return 0; //fix this
    }
}
