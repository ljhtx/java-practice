package com.ljh.banperson;

import com.ljh.banperson.sample.EnableLOLConfiguration;
import com.ljh.banperson.sample.HeroConfiguration;
import com.ljh.banperson.sample.ISkill;
import com.ljh.banperson.sample.LOLConfigurationSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@EnableLOLConfiguration
public class LOLApplication {
    
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(LOLApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        ISkill iSkill = (ISkill) ctx.getBean("camille");
        iSkill.r();
    }
    
}
