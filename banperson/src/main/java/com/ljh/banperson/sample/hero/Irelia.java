package com.ljh.banperson.sample.hero;

import com.ljh.banperson.sample.ISkill;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class Irelia implements ISkill {
    public void q(){
        System.out.println("Irelia Q");
    }
    
    public void w(){
        System.out.println("Irelia W");
    }
    
    public void e(){
        System.out.println("Irelia E");
    }
    
    public void r(){
        System.out.println("Irelia R");
    }
}
