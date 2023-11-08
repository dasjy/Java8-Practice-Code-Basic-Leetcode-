package Company;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Department {
        private int departmentId;
        private List<Code> code;
}
