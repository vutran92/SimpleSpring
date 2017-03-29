package vutran.springinaction.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import vutran.springinaction.knights.BraveKnight;
import vutran.springinaction.knights.Knight;
import vutran.springinaction.knights.Quest;
import vutran.springinaction.knights.SlayDragonQuest;

@Configuration
public class KnightConfig {
//    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

//    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
