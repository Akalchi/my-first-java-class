package dev.alejandra;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class ClassTest {

    @Test
    @DisplayName("Person class test")
    void person_test() {
        Person person = new Person("Alejandra", "12345678L",1999);
        assertThat(person, is (instanceOf(Person.class)));
        
    }

    @Test
    @DisplayName("Person name is a string")
    void person_name_test() {
        Person person = new Person("perro", "12345678L", 1999);
        assertThat(person.getName(), is (instanceOf(String.class)));
    }
    
    @Test
    @DisplayName("Person ID is a string")
    void person_ID_test() {
        Person person = new Person("gato", "12345678L", 1999);
        assertThat(person.getId(), is (instanceOf(String.class)));
    }

    @Test
    @DisplayName("ID has 9 characters")
    void person_ID_lenght_test() {
        Person person = new Person("gato", "12345678L", 1999);
        assertThat(person.getId().length(), is(9));
    }

    @Test
    @DisplayName("Year of birth is a number")
    void person_year_of_birth_test() {
        Person person = new Person("gato", "12345678L" , 1999);
        assertThat(person.getYearOfBirth(), is (instanceOf(Integer.class)));
        
    }

}
