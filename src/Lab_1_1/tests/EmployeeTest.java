package Lab_1_1.tests;

import Lab_1_1.helpers.PositionEnum;
import Lab_1_1.models.Employee;

public class EmployeeTest {

    public void runTest() {
        Employee employee= new Employee("", "", PositionEnum.SELLER);
        System.out.println(employee.think());
    }
}
