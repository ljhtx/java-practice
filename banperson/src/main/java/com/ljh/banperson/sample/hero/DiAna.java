package com.ljh.banperson.sample.hero;

import com.ljh.banperson.sample.ISkill;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class DiAna implements ISkill {
    // 如何将对象注入IOC容器之中
    // 1.XML 2.注解
    // 注解：1.模式注解；（@Component（组件/类/bean））
    //      2.@Service;@Controller;@Repository(与@Component无区别，只是表明类的作用)
    //      3.@Configuration()
    // @Autowired被动注入
    // bytype根据类型注入（默认注入方式，先找到实现了声明的类型的类对象，若找到多个，再采用byname），
    // byname根据名字注入
    // @Qualifier主动注入
    // 目前来看还是不清楚DI到底优势何在，容器只是帮我们把类实例化的过程（通过扫描所有类，用反射来实现实例化）给统一解决了，
    // 但依赖注入后，不还是改依赖，引用了该依赖的类都得跟着改吗？
    
    // 但是，问题又来了，如何给各个类在实例化的时候进行装配呢？实例化可能还需要别的构造参数啊？
    // 同时，是谁在给这些类进行装配？
    
    // 首先先来看一下Spring老版的配置文件xml
    // Spring为了实现OCP原则，将代码的修改隔离到了xml配置文件之中；即老版Spring是xml文件给这些类进行装配
    // 新版Spring用@Configuration来代替xml配置文件
    
    // 面向对象中变化的应对方案
    // 1.制定一个Interface，然后用多个类实现同一个interface（策略模式）
    // 若要保证控制类中变量名字不变，有如下方案：
    //   方案1：byname 切换control中的bean name
    //   方案2：@Qualifier 指定bean
    //   方案3：通过注释掉同类bean的@Componenet，保证每类bean只有一个，即用bytype来读取bean
    //   方案4：使用Primary，这个感觉和第三种也差不多啊。
    //   方案5：使用Conditional+配置项/用户的变换；来决定注入的bean是哪个
    //         内置的Condition方法：
    //         @ConditionOnProperty:
    //         @
    // 2.只有一个类，通过更改类的属性来达到对应变化
    // 通过修改配置来实现更改类的属性，即直接将类的属性放在了Configuration里头。
    
    // 在js中，想要使用linUi的时候： npm安装 --》引用组件
    // 在Spring中，想要使用第三方包：在pom.xml复制包的xml代码 --》import引用- -。。没啥区别啊。。
    
    // 自动配置/装配
    // 1. 原理是什么？
    //
    // 2. 为什么要有自动装配？
    // @Configuration两个作用：1.将属性配置到配置文件中；2.将bean加入到IOC容器之中；
    // @EnableAutoConfiguration
    // 模块装配，多个Configuration的组合称为模块
    
    
    
    // @ComponentScan扫描注解，spring通过该注解来扫描对应文件夹下所有的@Component
    // @Conditional条件注解
    public void q(){
        System.out.println("Diana Q");
    }
    
    public void w(){
        System.out.println("Diana W");
    }
    
    public void e(){
        System.out.println("Diana E");
    }
    
    public void r(){
        System.out.println("Diana R");
    }
}

