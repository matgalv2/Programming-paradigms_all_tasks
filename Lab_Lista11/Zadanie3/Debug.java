package Lab_Lista11.Zadanie3;

import java.lang.reflect.Field;

public class Debug
{
    public static void fields(Object obj) throws NoSuchFieldException, IllegalAccessException
    {
        Field [] fields = obj.getClass().getDeclaredFields();

        for(Field field : fields)
        {
            field.setAccessible(true);
            System.out.println("Pole: " + field.getName() + "=> " + field.getType().toString() + ", " + field.get(obj));
        }
    }
}
