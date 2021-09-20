package reflect;

import reflect.hero.Camile;
import reflect.hero.Diana;
import reflect.hero.Irelia;

public class HeroFactory {
    public static ISkill getHero(String name) throws Exception {
        // 类的加载：将class文件读入内存，并为之创建一个java.lang.Class对象
        // 类的连接
        // 类的初始化
        
        // 反射：不在编译期确定类对象，而在运行期确定类对象
        // 反射的本质：使用类首先需要加载类的字节码文件对象（二进制），而这个类的字节码文件对象就是Class类的实例化对象，
        // 因此反射其实就是将文件给转成了字节码文件对象了。

        // Class元类
        // 类是对象的抽象，元类是类的抽象
        
        // IOC控制反转
        // 举栗子：1.A类引用B类，A为主控类；2.用容器将B类注入A类中，称容器为主控方，实现控制反转
        // 代码分成主控代码和业务代码，若我们能实现控制反转，用容器来实现代码控制，主控代码非常稳定，
        // 不会发生更改；那么整套代码的控制就能交由产品。
        // 由于主控代码不会变，那么会变化的就只有业务代码，而业务代码是由产品来决定，程序来实现，因此
        // 代码的主导权其实就成功的落到了产品或者说用户身上，我们就能写出很好的商业代码。
        
        // 如果主控代码需要变动呢（即类与类之间引用十分复杂）？那么很多类能否引用或者说能否修改，产品就说了不算了，
        // 就衍生出了经典台词：”这个需求我们做不了。“
        
        // DI依赖注入
        // 依赖注入的两种形式：构造函数注入、属性注入
        // 那么是如何做到给各个类实现装配的呢？装配由容器来装配，即依赖注入，分被动依赖注入和主动依赖注入，@AutoWired帮我们解决了装配问题
        // 同时，是在给谁装配？ Controller，控制类
        String classStr = "reflect.hero." + name;
        Class<?> cla = Class.forName(classStr);
        Object obj = cla.newInstance();
        return (ISkill) obj;
    }
}
