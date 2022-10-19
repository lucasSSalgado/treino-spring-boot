package academy.devdojo.springboot2.exception;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class ValidationExceptionDetails extends ExceptionDetails{

    private final String fields;
    private final String fieldsMSG;
}
