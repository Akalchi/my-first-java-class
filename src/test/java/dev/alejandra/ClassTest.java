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
        Person person = new Person("Alejandra", "12345678L");
        assertThat(person, is (instanceOf(Person.class)));
        
    }

    @Test
    @DisplayName("Person name is a string")
    void person_name_test() {
        Person person = new Person("perro", "12345678L");
        assertThat(person.getName(), is (instanceOf(String.class)));
    }
    
    @Test
    @DisplayName("Person ID is a string")
    void person_ID_test() {
        Person person = new Person("gato", "12345678L");
        assertThat(person.getId(), is (instanceOf(String.class)));
    }

}
