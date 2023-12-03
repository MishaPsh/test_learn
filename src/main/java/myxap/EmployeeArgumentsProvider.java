package myxap;


import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.time.LocalDate;
import java.util.stream.Stream;


public class EmployeeArgumentsProvider  implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext){
        return Stream.of(
                Arguments.of(new Employee(1,"Alex", LocalDate.of(1980,2,3))),
                Arguments.of( new Employee(2,"Brian", LocalDate.of(1979,2,3))),
                Arguments.of( new Employee(3,"Alex", LocalDate.of(1978,2,3)))
        );
    }
}
