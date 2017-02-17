package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by PeterWeckend on 2017-02-16.
 */

public class TweetList {
    private ArrayList<NormalTweet> tweets = new ArrayList<NormalTweet>();
    public ArrayList<NormalTweet> tweets2 = new ArrayList<NormalTweet>();

    //    addTweet() -- should throw an IllegalArgumentException when one tries to add a duplicate tweet
    public void add(NormalTweet tweet) {
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);


    }

    //    hasTweet() -- should return true if there is a tweet that equals() another tweet
    public boolean hasTweet(NormalTweet tweet) {
       //
        int i;
        for (i = 0; i < tweets.size(); i++){
            if (tweet.equals(tweets.get(i))) {
                return true;
            }
        }
        return false;
    }

    public NormalTweet getTweet(int index){
        //return new NormalTweet("not the tweet");

        Collections.sort(tweets, new Comparator<NormalTweet>() {
            public int compare(NormalTweet m1, NormalTweet m2) {
                return m1.getDate().compareTo(m2.getDate());
            }
        });
//        Collections.sort(tweets.getDate());
        return tweets.get(index);
    }

    public void delete (NormalTweet tweet) {
        tweets.remove(tweet);
    }

    //    getTweets() -- sould return a list of tweets in chronological order
    public ArrayList<NormalTweet> getTweets(){
        //return tweets2;
        return tweets;
    }





//    getCount() -- should accurately count up the tweets
    public int getCount(){
        return tweets.size();
        //return 0;
    }
}
