package ie.atu.week8;


import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public void savePerson(Person person) {
        System.out.println("Person saved: " + person);
    }


    public Person getPersonByEmployeeId(String employeeId){
        return new Person();
    }
}
