package annotations;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        SampleClass obj = new SampleClass();
        AnnotationProcessor.process(obj);
    }
}
