package ie.atu.week8;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Person {
    @NotBlank(message = "name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must be betweem 2 and 50 characters")
    private String name;

    @Email(message = "invalid email address")
    private String email;

    @NotBlank(message = "title cannot be blank")
    private String title;

    @Min(value = 0, message = "Age must be greater or equal to 0")
    private int age;

    @NotBlank(message = "position cannot be blank")
    private String position;

    @NotBlank(message = "Department cannot be blank")
    private String department;

    @NotBlank(message = "EmployeeId cannot be blank")
    private String employeeId;


}
