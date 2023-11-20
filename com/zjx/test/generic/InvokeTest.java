package com.zjx.test.generic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zjx
 * @Date 2023-11-08 12:02:19
 * @Desc
 */
public class InvokeTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<Shape> shapeClass = Shape.class;
        Shape shape = shapeClass.newInstance();
        Method[] methods = shapeClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            // Check if the method has parameters
            if (method.getParameterCount() > 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Object[] arg = new Object[parameterTypes.length];
                int i = 0;

                for (Class<?> parameterType : parameterTypes) {
                    // For simplicity, assume the class has a default constructor
                    if (parameterType.isPrimitive()){
                        arg[i++] = getDefaultValue(parameterType);
                    }else {
                        arg[i++] =  parameterType.newInstance();
                    }
                }

                // Invoke the method and print the result
                System.out.printf("%s%n", method.invoke(shape, arg));
            } else {
                // If the method has no parameters, simply invoke it
                System.out.printf("%s%n", method.invoke(shape));
            }
        }
    }

    private static Object getDefaultValue(Class<?> type) {
        if (type == int.class) {
            return 0;
        } else if (type == short.class) {
            return (short) 0;
        } else if (type == byte.class) {
            return (byte) 0;
        } else if (type == long.class) {
            return 0L;
        } else if (type == float.class) {
            return 0.0f;
        } else if (type == double.class) {
            return 0.0;
        } else if (type == char.class) {
            return '\u0000';
        } else if (type == boolean.class) {
            return false;
        } else {
            throw new IllegalArgumentException("Unsupported primitive type: " + type.getName());
        }
    }
}
class Shape{
    int length = 5;

    int resetLength(int i){
        length = i;
        return i;
    }
}
