package lab2.task2;

public class Queue {

    int elements[],actualsize, maxsize;
    boolean limited;

    Queue(){
        this.actualsize=0;
        this.elements = new int[1];
        this.limited = false;
    }

    Queue(int size){
        this.elements = new int[size];
        this.actualsize=0;
        maxsize = size;
        this.limited = true;
    }

    public void push(int element){
        if (limited==true){
            if (actualsize<maxsize){
                this.actualsize++;
                this.elements[actualsize-1] = element;
            }
            else {
                System.out.println("Queue 2 is already full");
            }
        }
        else {
            this.elements = (int[])resizeArray(this.elements, actualsize+1);
            this.actualsize++;
            this.elements[actualsize-1] = element;
        }
    }

    public void pop(){
        if (actualsize != 0){
            for (int i=0; i<actualsize-1; i++) {
                elements[i] = elements[i + 1];
            }
            actualsize--;
            elements[actualsize] = 0;
            if (limited==false) {
                this.elements = (int[])resizeArray(this.elements, actualsize);
            }
        }
          else {
            System.out.println("The queue is already empty");
        }

    }

    public void extractLast(){
        System.out.println(this.elements[actualsize-1]);
    }

    public void checkEmpty(){
        if (this.actualsize==0) System.out.println("The queue is empty");
        else System.out.println("The queue is not empty");
    }

    public void checkFull(){
        if (this.limited==true && this.actualsize==maxsize) {
            System.out.println("The queue is full");
        }
        else if (this.limited==true && this.actualsize!=maxsize) {
            System.out.println("The queue is not full");
        }
             else System.out.println("The queue cannot be full");
    }


    private static Object resizeArray (Object oldArray, int newSize) {
        int oldSize = java.lang.reflect.Array.getLength(oldArray);
        Class elementType = oldArray.getClass().getComponentType();
        Object newArray = java.lang.reflect.Array.newInstance(elementType, newSize);
        int preserveLength = Math.min(oldSize, newSize);
        if (preserveLength > 0)
            System.arraycopy(oldArray, 0, newArray, 0, preserveLength);
        return newArray;
    }



}
