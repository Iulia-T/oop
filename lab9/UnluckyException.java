package lab9;

public class UnluckyException extends Exception {

    UnluckyException(String input1, String input2) {
        super(input1, input2);
    }

    String exception(){
        if(input2.equals("13")) return "It is unlucky number";
        else return "";
    }

}
