package Interview;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Mobile {
    private List<String> mobileName;
    private List<String> mobileCost;
}
