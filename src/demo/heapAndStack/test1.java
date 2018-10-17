package demo.heapAndStack;

/**
 * @Auther: Administrator
 * @Date: 2018/10/16 0016 20:31
 * @Description:java堆栈原理解析
 */

class Person{
        String name;
        int age;

public void tell(){
        System.out.println("姓名："+name+", 年龄："+age);
        }
}

public class test1 {
    /**
     *堆内存是用来存储对象实体的：各个属性的具体值
     * 栈内存是用来存储对象的申明和引用地址的（8大常量对象的值也是存储在栈内存中的），栈内存中的值具有共享性
     */
    public static void main(String[] args){
        /**
         * 验证值传递
         */
//        String a ="a";
//        String b =a;//将a的值赋给b，栈中的操作是将栈中创建的a常量的值的地址赋给b，如果b修改了的话，栈是会去占中寻找是否存在该值，不存在就在栈中创建，属于值传递。
//        b = "b";
//        System.out.println("a="+a+" b="+b);//结果：a=a b=b

        /**
         * 验证引用传递
         */
//        Person perA = new Person();
//        perA.name="张三";
//        perA.age=23;
//        Person perB = new Person();
//        perB = perA;
//        perB.name="李四";
//        /**
//         * 姓名：李四, 年龄：23
//         * 姓名：李四, 年龄：23
//         *
//         * 两个都输出李四。说明perB指向的是perA对象指向的堆内存空间地址，因此修改perB的同时，perA也被修改了
//         */
//        perA.tell();
//        perB.tell();

        /**
         * 验证常量类型的特殊性
         */
        String a = new String("张三");
        String b = new String();
        b =a;
        b = "李四";
        System.out.println("a:"+a+", b:"+b);

    }



    }





