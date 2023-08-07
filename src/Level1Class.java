public class Level1Class {
    private int field1;
    private Level2Class complexField;

    public int getField1() {
        return field1;
    }

    public Level2Class getComplexField() {
        return complexField;
    }

    public Level1Class(int field1, Level2Class complexField){
        this.field1 = field1;
        this.complexField = complexField;
    }
}
