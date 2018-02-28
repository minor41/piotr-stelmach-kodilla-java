package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User alexxxx0 = new Millenials("Alexxxx0");
        User bright00 = new YGeneration("BriBright");
        User janeOhNo = new ZGeneration("JaneOhNo");

        //When
        String alexShare = alexxxx0.sharePost();
        System.out.println("Alexxxx0 shares posts on " + alexShare);
        String brightShare = bright00.sharePost();
        System.out.println("BriBright shares posts on " + brightShare);
        String janeShare = janeOhNo.sharePost();
        System.out.println("JaneOhNo shares posts on " + janeShare);

        //Then
        Assert.assertEquals("Facebook", alexShare);
        Assert.assertEquals("Twitter", brightShare);
        Assert.assertEquals("Snapchat", janeShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Giver
        User robBig = new Millenials("Rob Big");

        //When
        String robShare = robBig.sharePost();
        System.out.println("Rob Big shares posts on " + robShare);
        robBig.sharePostOnDifferentMedia(new SnapchatPublisher());
        robShare = robBig.sharePost();
        System.out.println("Rob nowadays share post on " + robShare);

        //Then
        Assert.assertEquals("Snapchat", robShare);
    }
}
