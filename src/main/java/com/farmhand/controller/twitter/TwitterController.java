package com.farmhand.controller.twitter;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Helmut
 */
@RestController
@RequestMapping(TwitterController.TWITTER_BASE_URI)
public class TwitterController {
    public static final String TWITTER_BASE_URI = "farmhand/v1/tweets";
    
    @Autowired
    private Twitter twitter;
    
    public List<Tweet> getTweets(@PathVariable final String farmhand) {
        private String pathUrl;
        return null;
        
    } 
}
