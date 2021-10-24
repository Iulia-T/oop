package lab4;

import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class FileManagement {

    static void Reader1() {

        try {
            FileReader reader1 = new FileReader("D:\\Univer\\OOP\\Labs\\oop_labs\\src\\lab4\\one_expression");
            int data1 = reader1.read();
            Stack<Integer> stack1 = new Stack<>();
            boolean b = true;

            while (data1 != -1) {

                char value = (char)data1;

                if (value == '(') {
                    stack1.push(1);
                }
                else if (value == ')'){
                    if (stack1.empty() == false)
                        stack1.pop();
                    else {
                        b = false;
                        break;
                    }
                }
                data1 = reader1.read();
            }
            reader1.close();

            if (stack1.empty() == false)
                b=false;

            if (b == true)
                System.out.println("The expression from one_expression file is correct.");
            else if (b == false)
                System.out.println("The expression from one_expression file is not correct.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

        static void Reader3(){
            try {
                FileReader reader3 = new FileReader("D:\\Univer\\OOP\\Labs\\oop_labs\\src\\lab4\\three_expressions");
                int data3 = reader3.read();
                boolean b = true;
                int n=0;

                while (data3 != -1) {
                    Stack<Integer> stack3 = new Stack<>();
                    b = true;

                    while ((char)data3 != '\n' && data3 != -1){

                        char value = (char)data3;

                        if (value == '(') {
                            stack3.push(1);
                        }
                        else if (value == ')'){
                            if (stack3.empty() == false)
                                stack3.pop();
                            else {
                                b = false;
                                break;
                            }
                        }

                        if (b==false)
                            break;
                        data3 = reader3.read();
                    }

                    n++;

                    if (stack3.empty() == false)
                        b=false;

                    if (b == true)
                        System.out.println("The expression " + n +" from three_expressions file is correct.");
                    else if (b == false)
                        System.out.println("The expression " + n +" from three_expressions file is not correct.");

                    data3 = reader3.read();
                }
                reader3.close();

            } catch (IOException e) {
                e.printStackTrace();
            }


    }

}
