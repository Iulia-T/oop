package lab6;

import java.util.Date;

public class Patient extends Person{

    String id;
    String fullName = givenName + " " + middleName + " " + familyName;
    String gender;
    int age;
    Date acceptedDate = new Date();
    String prescriptions[];
    String allergies[];
    String specialReqs[];
    OperationsStaff operationsStaff[] = new OperationsStaff[];


}
