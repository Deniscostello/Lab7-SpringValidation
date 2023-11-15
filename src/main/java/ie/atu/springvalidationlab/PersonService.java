package ie.atu.springvalidationlab;

import org.springframework.stereotype.Service;

@Service
public class PersonService {


    public void createPerson(Person person){
        System.out.println(person);
    }

    public Person getPersonById(String personId) {
        Person newPerson = new Person("John", "John11@gmail.com", personId, 36, "Mr", "Senior Engineer", "Nwm");
        return newPerson;
    }
}
