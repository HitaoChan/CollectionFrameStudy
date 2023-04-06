package study.invoke;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Apple {
    public String weight;

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Apple(String color) {
        this.color = color;
    }

    /**
     * @param args
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        obtainAttributeFiledsMethod();
    }

    /**
     * 获取反射中的Class对象
     */
    static void obtainObject() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1.Class.forName 静态方法
        Class aClass = Class.forName("study.invoke.Apple");
        // 2.使用 .class 方法
        Class<Apple> appleClass = Apple.class;
        // 3.使用对象的getClass方法
        Apple apple = new Apple("red");
        Class aClass1 = apple.getClass();
    }

    /**
     * 反射创建对象
     */
    static void generateObject() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 1.通过Class对象的newInstance()方法
        Class appleClass = Apple.class;
        Apple apple = (Apple)appleClass.newInstance();
        // 2.通过Constructor 对象的 newInstance() 方法
        Constructor constructor = appleClass.getConstructor();
        Apple apple1 = (Apple)constructor.newInstance();
    }

    /**
     * 通过反射获取类属性、方法、构造器
     */
    static void obtainAttributeFiledsMethod(){

        // getFields() 方法可以获取 Class 类的属性，但无法获取私有属性
        Class clz = Apple.class;
        Field[] fields = clz.getFields();
        System.out.println("================getFields====================");
        for (Field field : fields) {
            System.out.println(field.getName());

        }
        System.out.println("================getDeclaredFields====================");
        // getDeclaredFields() 方法则可以获取包括私有属性在内的所有属性
        Field[] declaredFields = clz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());

        }

    }
}
