package bootstrap;

import org.springframework.context.support.GenericApplicationContext;

class person  
{  
    void f1()  
    {  
        System.out.println("person f1 is calling !");  
    }  
    void f2()  
    {  
        f1();  
    }  
}  
  
class student  extends person  
{  
    void f1()  
    {  
        System.out.println("student f1 is calling! ");  
    }  
    void f3()  
    {  
        System.out.println("student f3 is calling!");  
    }  
    void f4()  
    {}  
}  
class Rt20  
{  
public static void main(String[]args)  
    {  
        student s=new student();  
        call(s);  
    }  
    public static void call(person p)//子类的对象可以自动转换为父类的对象.  
    {  
        if(p instanceof student)//这句意思:p确实是student的对象吗.  
        {  
        student s=(student)p;//把person类型强制转换为student类型.  
        s.f1();  
        s.f2();  
        s.f3();   
        }  
        else   
        {  
        p.f1();  
        p.f2();  
        }  
        //p.f4();//p只能调用person类的内容,虽然说p来源于student .但是它带上person类的  
        //帽子,所以只能调用person类的成员.  
    }  
}  