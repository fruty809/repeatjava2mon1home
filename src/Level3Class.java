public class Level3Class extends Level2Class{
    private String field4;

    public String getField4() {
        return field4;
    }

    public Level3Class(String field2, ComplexEnum field3, String field4) {
        super(field2, field3);
        this.field4 = field4;
    }
    @Override
    public void overloadedMethod(int param){
        System.out.println("Переопределенный метод в Level3Class с параметром инт: " + param);
    }
}
