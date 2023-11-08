import lombok.*;

@NoArgsConstructor // use when there is 0 parameterzied
@Getter
@Setter
@ToString
@Data
public class Customer
{
    private String customerName;
    private int age;

}
class testCustomer
{
    public static void main(String[] args)
    {
        Customer c=new Customer();
        c.setCustomerName("Das");
        c.setAge(23);
        System.out.println(c.getCustomerName()+ c.getAge());


    }}
