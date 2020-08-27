package Lessons.AgregationExample;

//https://www.edureka.co/blog/aggregation-in-java/

public class Aggregation {
    public static void main(String args[]){
        Address ad = new Address(2, "Bangalore", "Karnataka", "India");
        Employee obj = new Employee(1, "Suraj", ad);
        System.out.println(obj.EmployeeID);
        System.out.println(obj.EmployeeName);
        System.out.println(obj.EmployeeAddr.streetNum);
        System.out.println(obj.EmployeeAddr.city);
        System.out.println(obj.EmployeeAddr.state);
        System.out.println(obj.EmployeeAddr.country);
    }
}
