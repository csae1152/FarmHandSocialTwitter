/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmhand.twitter.template;

import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author Helmut
 */

@Component
public class TwitterTemplateConnector {
    
    @Autowired
    Environment env;
    
    /**
     * 
     * @param accountName
     * @return twitterTemplate
     */
    public Twitter getTwitterTemplate(String accountName) {
        String consumerKey = env.getProperty(accountName + ".consumerKey");
      String consumerSecret = env.getProperty(accountName + ".consumerSecret");
      String accessToken = env.getProperty(accountName + ".accessToken");
      String accessTokenSecret = env.getProperty(accountName + ".accessTokenSecret");
      Preconditions.checkNotNull(consumerKey);
      Preconditions.checkNotNull(consumerSecret);
      Preconditions.checkNotNull(accessToken);
      Preconditions.checkNotNull(accessTokenSecret);
        
       TwitterTemplate twitterTemplate = 
         new TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret);
      return twitterTemplate;
        
    }
    
    
    
}
