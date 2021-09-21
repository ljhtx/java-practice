package com.ljh.banperson;

import com.ljh.banperson.sample.ISkill;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class LOLApplication {
    
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(LOLApplication.class).run(args)
        ISkill iSkill = (ISkill) ctx.getBean("camille");
        iSkill.r();
    }
    
}
