package exeEmployeed.model;

import exeEmployeed.entity.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CustomException extends Exception {
    private static final long serialVersion = 1L;
    public CustomException(String str){
        super();
        System.out.println(str);
        EmployeeSystem.operations();
    }
    
    public class EmployeeSystem{
        public static Map<Integer, Employee> map = new HashMap<>();
        public static void addEmployee(String name,int age, int id){
            Employee emp = new Employee(name, age, id);
            map.put(id, emp);
            operations();
        }
        public static void deleteeEmployee(int EmpId) throws  CustomException{
            if (map.containsKey(EmpId)){
                map.remove(EmpId);
                System.out.println("Success");
            }else {
                throw new CustomException("Not Found Exception");
            }
            operations();
        }

        public static void searchEmployee(int EmpId) throws CustomException{
            if (map.containsKey(EmpId)){
                System.out.println("Emp Details: " + map.get(EmpId));
            }else {
                throw new CustomException("not Found");
            }
            operations();
        }
        public static void employeeList(){
            System.out.println(map.toString());
        }

        public static void operations() {
        }
    }
    public static void operations(){
        System.out.println("Menu");
        System.out.println("1.Add");
        System.out.println("2.Delete");
        System.out.println("3.Search");
        System.out.println("4.List");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        if (userInput == 1){
            System.out.println("Enter Emp Details(name,age,id");
            Scanner sc1 = new Scanner(System.in);
            String name = sc1.next();
            int age = sc1.nextInt();
            int id = sc1.nextInt();

            if (!name.equals("") && age !=0 && id != 0){
                EmployeeSystem.addEmployee(name, age, id);
            }else if (userInput == 2){
                System.out.println("Enter EmployeeId");
                Scanner sc2 = new Scanner(System.in);

                int EmpId = sc2.nextInt();
                try {
                    EmployeeSystem.deleteeEmployee(EmpId);
                }catch (CustomException e){
                    e.printStackTrace();
                }
            }else if(userInput == 3){
                System.out.println("Enter EmployeeId");
                Scanner sc3 = new Scanner(System.in);
                int EmpId = sc3.nextInt();
                searchEmployeed(EmpId);

                operations();
            }else if(userInput == 4){
                EmployeeSystem.employeeList();
                operations();
            }

        }

    }

    private static void searchEmployeed(int empId) {
    }

    public static void main(String[] args) {
        operations();
    }
}
