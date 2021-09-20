package com.ljh.banperson.sample;

import com.ljh.banperson.sample.condition.CamilleCondition;
import com.ljh.banperson.sample.condition.DianaCondition;
import com.ljh.banperson.sample.condition.IreliaCondition;
import com.ljh.banperson.sample.hero.Camille;
import com.ljh.banperson.sample.hero.DiAna;
import com.ljh.banperson.sample.hero.Irelia;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroConfiguration {
    @Bean
    @ConditionalOnProperty(value = "hero.condition", havingValue = "camille")
//    @Conditional(CamilleCondition.class)
    public ISkill camille(){
        return new Camille();
    }
    
    @Bean
    @ConditionalOnProperty(value = "hero.condition", havingValue = "diana")
//    @Conditional(DianaCondition.class)
    public ISkill diana() { return new DiAna(); }
    
    @Bean
    @ConditionalOnProperty(value = "hero.condition", havingValue = "irelia")
//    @Conditional(IreliaCondition.class)
    public ISkill irelia() { return new Irelia();
    }
}
