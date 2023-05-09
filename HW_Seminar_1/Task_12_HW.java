/**
 * Task_1.1_HW
 */
public class Task_12_HW {

    public static void main(String[] args) {
        String myObj = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(myObj);
        StringBuilder builder = new StringBuilder(myObj);
        builder.delete(0, builder.indexOf("\"")+1);
        System.out.println(builder);
        builder.deleteCharAt(builder.indexOf("\""));
        System.out.println(builder);
        String field = builder.substring(0,builder.indexOf(":"));
        System.out.println(field);
        String name = builder.substring(builder.indexOf("\"")+1, builder.lastIndexOf("\""));
        System.out.println(name);
        System.out.println(builder);
        System.out.println(String.format("Parametr %s: %s", field, name));






    }
}
