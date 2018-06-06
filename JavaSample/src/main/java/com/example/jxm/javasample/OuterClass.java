package com.example.jxm.javasample;

/**
 * Created by jiamao on 2018/5/23.
 */

public class OuterClass extends OuterClassA {

    final String name;
    private InnerA innerA;
    private InnerB innerB;

    public int id;
     private OuterClass() {

        name="";
    }
    public OuterClass(String name) {
        this.name = name;
        this.innerA = new InnerA();
        this.innerB = new InnerB();
    }
    public OuterClass(String name,int a,InnerA innerA) {
        this.name = name;
        this.innerA = new InnerA();
        this.innerB = new InnerB();
    }
    class InnerA{
        private int a;
        public void say(){
            System.out.println("InnerA:"+name+id);
            getA();
        }
    }

    class InnerB{
        private int b;
        public void say(){
            System.out.println("InnerB:"+name);
        }

    }

    private void getA(){
        InnerA a;
        System.out.println("外部类获取内部类A的数据："+innerA.a);
    }


    int sum(int a,int b){
        return a+b;
    }

    /**
     * 内部类引用外部类的私有变量时，系统会自动生成一些方法如access$000(Outer)。来进行处理，所以反射获取的方法可能多余你所看到的
     * @param args
     */
    public static void main(String [] args){

        OuterClass outerClass=new OuterClass("hello");

        InnerA a=outerClass.new InnerA();
        a.say();

    }

}
