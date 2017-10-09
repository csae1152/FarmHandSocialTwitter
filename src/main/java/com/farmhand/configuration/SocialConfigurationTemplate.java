package com.farmhand.configuration;

import com.farmhand.twitter.template.SocialTemplateConnector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author Helmut
 * 
 * <p>For accessing Twitter and Instagram</p>
 */

@Configuration
@PropertySource("classpath:config.properties")
public class SocialConfigurationTemplate {
    
    /**
     * 
     * @return TwitterConfigTemplate
     * @throws Exception 
     */
    @Bean
    public SocialTemplateConnectorAbstract twitterConfigTemplate() throws Exception {
        return newTwitterTemplate;      
    }
    
    @Inject
    public Loader(Social social) {
         return social.load(String status);
    }
    
}
