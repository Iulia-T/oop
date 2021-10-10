package lab1.task2;

public class Task2 {
    public static void main(String[] args) {

        Student st1 = new Student(); st1.name = "Alina"; st1.age = 20; st1.mark = 9;
        Student st2 = new Student(); st2.name = "Stanislav"; st2.age = 21; st2.mark = 8;
        Student st3 = new Student(); st3.name = "Dan"; st3.age = 20; st3.mark = 9;
        Student st4 = new Student(); st4.name = "Anatol"; st4.age = 20; st4.mark = 10;
        Student st5 = new Student(); st5.name = "Alexandra"; st5.age = 22; st5.mark = 10;
        Student st6 = new Student(); st6.name = "Florin"; st6.age = 21; st6.mark = 8;
        Student st7 = new Student(); st7.name = "Anastasia"; st7.age = 20; st7.mark = 9;
        Student st8 = new Student(); st8.name = "Sorin"; st8.age = 23; st8.mark = 7;

        University university1 = new University();
        university1.name = "UTM";
        university1.foundationYear = 1966;
        university1.students = new Student[] {st1, st2, st3};

        University university2 = new University();
        university2.name = "UAIC";
        university2.foundationYear = 1959;
        university2.students = new Student[] {st4, st5, st6};

        University university3 = new University();
        university3.name = "ASEM";
        university3.foundationYear = 1985;
        university3.students = new Student[] {st7, st8};

        University[] universities = new University[] {university1, university2, university3};

        for (University univer : universities){
            double sum=0;
            for(Student st : univer.students) {
                sum += st.mark;
            }
            double average = sum / univer.students.length;
            System.out.println("Average mark for " + univer.name + " is " + average);
        }

    }
}
