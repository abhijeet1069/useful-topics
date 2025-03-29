package annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void process(Object object) throws InvocationTargetException, IllegalAccessException {
        for(Method method : object.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(LogExecutionTime.class)){
                long start = System.nanoTime();
                method.invoke(object);
                long end = System.nanoTime();
                System.out.println(method.getName()+" executed in "+ (end-start)+" ns");
            }
        }
    }
}
