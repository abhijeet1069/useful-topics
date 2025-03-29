package annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.METHOD) // Can only be applied to methods
@interface LogExecutionTime { }
