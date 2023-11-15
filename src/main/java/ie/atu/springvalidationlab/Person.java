package ie.atu.springvalidationlab;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be blank")
    @Size(min=2, max=50, message="Name must be between 2 and 50 characters")
    private String name;

    @Email(message = "Invalid email address")
    private String email;

    @NotBlank(message = "EmployeeId cannot be null")
    @Max(value = 5, message = "EmployeeId cannot be greater than 5")
    private String employeeId;

    @Min(value = 0, message = "Age must be great than 0")
    private int age;

    @NotBlank(message = "Title cannot be blank")
    private String title;

    @NotBlank(message = "Position cannot be blank")
    @Size(min=2, max=50, message = "Position must be between 2 and 50 characters")
    private String position;

    @NotEmpty(message = "Department cannot be empty")
    private String department;
}
