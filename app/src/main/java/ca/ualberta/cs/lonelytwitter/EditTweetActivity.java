package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EditTweetActivity extends Activity {

    private TextView editTweetsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);


        // display the received data
        editTweetsView = (TextView) findViewById(R.id.textView_edit);
        editTweetsView.setText(getIntent().getExtras().getString("sendtweet"));

    }
}
