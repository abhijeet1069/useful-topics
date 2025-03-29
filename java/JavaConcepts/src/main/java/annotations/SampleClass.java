package annotations;

public class SampleClass {
    @LogExecutionTime
    public void myFunction(){
        for(int i = 0; i < 1000000; i++);
        System.out.println("Function executed!!");
    }

    @LogExecutionTime
    public void concatenate(){
        String str = "";
        for(int i = 0; i < 100; i++){
            str += i+"";
        }
        System.out.println("Concatenate executed!!");
    }
}
