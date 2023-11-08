package Company;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Employee {
    private String empName;
    private int empAge;
    private int empSalary;
    private List<String> mobiles;
    private List<Department> department;

}
