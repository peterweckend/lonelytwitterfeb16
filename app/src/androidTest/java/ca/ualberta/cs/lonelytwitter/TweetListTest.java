package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by PeterWeckend on 2017-02-16.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }


    public void testAddTweet() {

        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

        // tested illegalargumentexception
        //tweets.add(tweet);



    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");

        tweets.add(tweet);
        NormalTweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");

        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));



    }


    public void testReturnTweets(){
        TweetList tweets = new TweetList();
        ArrayList<NormalTweet> tweets2 = new ArrayList<NormalTweet>();
        NormalTweet tweet = new NormalTweet("some tweet");
        NormalTweet tweet2 = new NormalTweet("some other tweet");

        tweets.add(tweet);
        tweets.add(tweet2);


        tweets2 = tweets.getTweets();

        NormalTweet rettweet = tweets2.get(0);
        NormalTweet rettweet2 = tweets2.get(1);
        assertEquals(rettweet.getMessage(), tweet.getMessage());
        assertEquals(rettweet2.getMessage(), tweet2.getMessage());
    }

    public void testgetCount(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        tweets.add(tweet);
        assertTrue(tweets.getCount() == 1);
    }

}