package com.farmhand.twitter;

import com.sun.prism.Image;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Service;

/**
 *
 * @author Helmut
 */
@Service
public class ImageRetrieverFromTwitter {
     private final Logger logger = LoggerFactory.getLogger(getClass());

     public void tweet(Twitter twitter, String text) {
        try {
         twitter.timelineOperations().updateStatus(text);
      } catch (RuntimeException ex) {
         logger.error("Unable to tweet" + text, ex);
      }
    }

     public void retrieveImage(Twitter twitter, Image img) {

     }
}



