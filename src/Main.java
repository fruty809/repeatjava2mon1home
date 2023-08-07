public class Main {
    public static void main(String[] args) {
        ComplexEnum enumValue = ComplexEnum.OPTION1;
        Level2Class objectA = new Level2Class("Field2Value", enumValue);
        Level3Class objectB = new Level3Class("Field2ValueB", enumValue, "Field4ValueB");
        Level3Class objectC = new Level3Class("Field2ValueC", enumValue, "Field4ValueC");


        System.out.println("Object A - Field2: " + objectA.getField2());
        System.out.println("Object A - Field3: " + objectA.getField3());


        objectA.overloadedMethod();
        objectA.overloadedMethod(42);


        System.out.println("Object B - Field2: " + objectB.getField2());
        System.out.println("Object B - Field3: " + objectB.getField3());
        System.out.println("Object B - Field4: " + objectB.getField4());


        objectB.overloadedMethod(99);


        System.out.println("Object C - Field2: " + objectC.getField2());
        System.out.println("Object C - Field3: " + objectC.getField3());
        System.out.println("Object C - Field4: " + objectC.getField4());


        objectC.overloadedMethod();
        objectC.overloadedMethod(123);
    }
}
