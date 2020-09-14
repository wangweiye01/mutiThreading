package com.wang.clone;

public class A implements Cloneable {
    public A(int age, B b) {
        this.age = age;
        this.b = b;
    }

    private int age;

    private B b;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        // 浅克隆
        A a1 = new A(10, new B());
        A a2 = (A) a1.clone();

        System.out.println(a1 != a2);

        System.out.println(a1.b == a2.b);
        System.out.println(a1.age == a2.age);

        // 深克隆
    }
}
