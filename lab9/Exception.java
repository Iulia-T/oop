package lab9;

public class Exception {

    String input1;
    String input2;

    Exception(String input1, String input2){
        this.input1 = input1;
        this.input2 = input2;
    }

    String wrongInput(){
        if (input1.equals("")) return "Divident is empty";
         else if (input2.equals("")) return "Divisor is empty";
               else if (!isNumeric(input1)) return "Divident is not a number";
                     else if(!isNumeric(input2)) return "Divisor is not a number";
                           else if(input2.equals("0")) return "The divisor can't be 0";
                                 else return "";
    }

    public static boolean isNumeric(String st) {
        try {
            Double.parseDouble(st);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

}
