package BuilderPatternLombok;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
public class User {
    private String name;
    private int age;

}
class TestUser{
    public static void main(String[] args)
    {
        User u1=User.builder().name("Jyoti").age(26).build();

        System.out.println(u1.getName() + u1.getAge());

        u1.setName("das"); u1.setAge(25);

        System.out.println("Updated "+u1.getName() + u1.getAge());

    }
}

