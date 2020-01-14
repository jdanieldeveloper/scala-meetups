package cl.scala.meetup.variables;

public class VariableJava {

    public static void main(String[] args) {
        // variables null
        Double dou1 = null;
        String strNull = null;


        // Mutable variables
        Integer int1 = 0;
        String  str1 = "String1";
        // change values
        int1 = 1;
        str1 = "String Modified";

        // Inmutable variables
        final Integer int2 = 0;
        final String  str2 = "String2";
        final MyClass myObject = new MyClass(int2, str2);

        // change values fail
        //int2 = 2;
        //str2 = "String Modified"
        // mutable variables modified
        final Integer int3 = Integer.valueOf(int2);
        final String  str3 = String.valueOf(str2);

        // exists alternatives how SerializationUtils.clone apache commons lang library

        try {
            // create object extend from Object
            final MyClass myObject2 = myObject.clone();
        }catch (CloneNotSupportedException e){
            // log here
        }
    }

}

class MyClass implements Cloneable {

    private Integer field1;
    private String  field2;

    public MyClass(){}

    public MyClass(Integer field1, String field2){
        this.field1 = field1;
        this.field2 = field2;
    }

    @Override
    protected MyClass clone() throws CloneNotSupportedException {
        return new MyClass();
    }

    public Integer getField1() {
        return field1;
    }

    public void setField1(Integer field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }
}
