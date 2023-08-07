public class Level2Class {
    private String field2;
    private ComplexEnum field3;

    public String getField2() {
        return field2;
    }

    public ComplexEnum getField3() {
        return field3;
    }

    public Level2Class(String field2, ComplexEnum field3) {
        this.field2 = field2;
        this.field3 = field3;
    }
    public void overloadedMethod(){
        System.out.println( System.out.println("перегрузка метода");
    }
    public void overloadedMethod(int param){
        System.out.println("Перегруженный метод с параметром инт в Level2Class: " + param);
    }
    public final void nonOverridableMethod(){
        System.out.println("Непереопределяемый метод в Level2Class");
    }
}
