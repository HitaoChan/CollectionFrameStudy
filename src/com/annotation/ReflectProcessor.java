package com.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectProcessor {

    public void parseMethod(final Class<?> clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        final Object object = clazz.getConstructor(new Class[]{}).newInstance(new Object[]{});
        final Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            final Reflect myReflect = declaredMethod.getAnnotation(Reflect.class);
            if(myReflect != null){
                declaredMethod.invoke(object, myReflect.name());
            }
        }
    }
}
