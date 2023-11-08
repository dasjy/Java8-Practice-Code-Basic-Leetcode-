package Company;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDetails {

    public static void main(String[] args)
    {
        Epam epam=new Epam();
      //  List<Employee> employeesDetails=epam.getEmployees();

//        List<String> allEmployeeName=employeesDetails.stream().map(Employee::getEmpName).collect(Collectors.toList());
//
//        System.out.println(allEmployeeName);
//
//        List<List<String>> mobileNumber=employeesDetails.stream().map(Employee::getMobiles).collect(Collectors.toList());
//        //List<List<String>> mobileNumber2=employeesDetails.stream().flatMap(s->s.setMobiles()).collect(Collectors.toList());
//
//        List<String> departMent=employeesDetails.stream().flatMap(s->s.getDepartment().stream()).collect(Collectors.toList())
//                        .stream().map(e->e.getCode().toString()).collect(Collectors.toList());
//
//        System.out.println(departMent);

    }

}
