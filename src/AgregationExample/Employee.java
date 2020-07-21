package AgregationExample;

class Employee
{
    int EmployeeID;
    String EmployeeName;
    //Creating HAS-A relationship with Address class
    Address EmployeeAddr;
    Employee(int ID, String name, Address addr){
        this.EmployeeID=ID;
        this.EmployeeName=name;
        this.EmployeeAddr = addr;
    }
}
