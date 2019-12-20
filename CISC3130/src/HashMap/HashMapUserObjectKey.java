package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserObjectKey {

      public static void main(String[] args) {

            System.out.println("Hello");

            Employee emp1 = new Employee(101, "faisal");
            Employee emp2 = new Employee(102, "Steve ");
            Employee emp3 = new Employee(103, "Sharr ");
            Employee emp4 = new Employee(104, "Ritchy");

            HashMap<Employee, String> employeeHashMap = new HashMap<>();

            employeeHashMap.put(emp1, "User1");
            employeeHashMap.put(emp2, "User2");
            employeeHashMap.put(emp3, "User3");
            employeeHashMap.put(emp4, "User4");

            for (Map.Entry<Employee, String> entry : employeeHashMap.entrySet()) {
                  System.out.println(entry.getKey() + " ===> " + entry.getValue());
            }

      }

}
