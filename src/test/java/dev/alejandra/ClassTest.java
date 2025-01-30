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
        Person person = new Person();
        assertThat(person, is (instanceOf(Person.class)));
        
    }

}
