package lab2.task2;

public class Task2 {

    public static void main(String[] args) {

        Queue queue1 = new Queue();
        Queue queue2 = new Queue(2);

        queue1.push(3);
        queue1.push(4);
        queue1.push(8);
        queue2.push(2);
        queue2.push(3);
        queue2.push(8);

        queue2.extractLast();
        queue1.extractLast();

        queue1.pop();
        queue1.pop();
        queue1.pop();

        queue1.checkEmpty();
        queue2.checkEmpty();

        queue1.checkFull();
        queue2.checkFull();
    }
}
