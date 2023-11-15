package ie.atu.springvalidationlab;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService=personService;
    }

    @PostMapping("/person/createPerson")
    @ResponseStatus(HttpStatus.CREATED)
    public Person createUser(@Valid @RequestBody Person person ){
        return Person;
    }
}
