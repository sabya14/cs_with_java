package concepts;

import lombok.AllArgsConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

    @AllArgsConstructor
    private static class Demo {
        private String name;

        private void method2(String address, String phno) {
            System.out.println("Does something");
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Demo obj = new Demo("Neel");
        Class cls = obj.getClass();
        System.out.println("Name of class " + cls.getSimpleName());

        Constructor constructor = Demo.class.getConstructor(String.class);

        Field field = cls.getDeclaredField("name");
        field.setAccessible(true);

        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Method methodCall = cls.getDeclaredMethod("method2", String.class, String.class);
        methodCall.setAccessible(true);
        methodCall.invoke(obj, "Test", "123");

    }
}
