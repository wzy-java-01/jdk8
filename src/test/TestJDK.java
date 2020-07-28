package test;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wzy
 * @description
 * @date 2020/7/22 14:00
 */
public class TestJDK {


    public static void main(String[] args) {
        System.out.println("这是一个jdk学习工程！");
    }

    @Test
    public void testJunit5(){
        System.out.println("hello Junit5!");
    }

    @Test
    public void testObject(){
        Object o1 = new Object();
        Object o2 = new Object();

        assertEquals(o1, o2);
        assert !o1.equals(o2);
        assert o1 != o2;
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        Class<?> aClass = o1.getClass();

        System.out.println(o1.toString());
    }

    @Test
    public void testInteger(){
        System.out.println(Integer.MAX_VALUE);
        Integer integer = 12345;
        System.out.println(Integer.toHexString(123123));
        System.out.println(Integer.toUnsignedString(1, 123));
        System.out.println(Integer.toOctalString(123));
        System.out.println(Integer.toBinaryString(123));
        System.out.println(Integer.decode("123123"));
        System.out.println(Integer.reverse(12345));
        System.out.println(Integer.toString(123312, -2147483647));
    }

    @Test
    void testString(){
        System.out.println(String.CASE_INSENSITIVE_ORDER.compare("aa", "ac"));
    }

    @Test
    void testClazz(){

    }



}
