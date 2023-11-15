package ie.atu.springvalidationlab;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService=personService;
    }

    @PostMapping("/person/createPerson")
    @ResponseStatus(HttpStatus.CREATED)
    public Person createUser(@Valid @RequestBody Person person ){
        personService.createPerson(person);
        return person;
    }

    @GetMapping("/person/{employeeId}")
    public ResponseEntity<?> getPerson(@PathVariable String employeeId){
        if(employeeId.length() >5 || employeeId.isBlank()){
            return ResponseEntity.badRequest().body("EmployeeId is invalid");
        }
        Person person = personService.getPersonById(employeeId);
        if(person == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(person);
    }



}
