package myxap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

@ParameterizedTest(name = "{index} - {0} is older that 40")
@ArgumentsSource(EmployeeArgumentsProvider.class)
    void isEmployeeAgeGreaterThat40(Employee employee){
        assertTrue(Period.between(employee.getDob(), LocalDate.now()).
                get(ChronoUnit.YEARS) > 40);
    }

}