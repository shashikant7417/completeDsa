package EngineerDigest;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {

    public static void main(String[] args) {

        HashMap<Student, String> map = new HashMap<>();
        Student s1 = new Student("Alice", 1);
        Student s2 = new Student("Bob", 2);
        Student s3 = new Student("Alice", 1);

        map.put(s1,"Engineer");  //hashcode1 ---> index1
        map.put(s2,"Designer");  //hashcode2 ---> index2
        map.put(s3,"Manager");   //hashcode3 ---> index3

        System.out.println("HashMap Size : " + map.size());
        System.out.println("Value for s1: " + map.get(s1));
        System.out.println("Value for s3: " + map.get(s3));




        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Shubham" , 90);  //hashcode1 ---> index1
        map1.put("Neha" , 92);     //hashcode2 ---> index2
        map1.put("Shubham" , 99);  //hashcode1 ---> index1 ---> equals() --. replace


    }
}

class Student{

    private String name;
    private int rollNo;

    public Student(String name , int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo,name);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Student other = (Student) obj;
        return rollNo == other.rollNo && Objects.equals(name,other.name);
    }
    @Override
    public String toString() {
        return "rollNo :" + rollNo + " name : " + name;
    }


}
