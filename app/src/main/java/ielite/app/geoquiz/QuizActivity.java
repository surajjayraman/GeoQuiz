package ielite.app.geoquiz;

<<<<<<< HEAD
import android.app.Activity;
import android.content.Intent;
=======
<<<<<<< HEAD
import android.app.Activity;
import android.content.Intent;
=======
>>>>>>> 41f94498dd72466f665551ebc62879d1effcdee8
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
<<<<<<< HEAD
import android.util.Log;
=======
<<<<<<< HEAD
import android.util.Log;
=======
<<<<<<< HEAD
import android.util.Log;
=======
<<<<<<< HEAD
import android.util.Log;
=======
>>>>>>> 4df0bf10e2dd35da0569d85107267c3468de8098
>>>>>>> e85612616f53dd9acf03287199c59c96ab5aa7e7
>>>>>>> 41f94498dd72466f665551ebc62879d1effcdee8
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06
    private static final String TAG = "QuizActivity";
    private static final String KEY_INDEX = "index";
    private static final int REQUEST_CODE_CHEAT = 0;

<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
    private static final String TAG = "QuizActivity";
    private static final String KEY_INDEX = "index";

=======
<<<<<<< HEAD
    private static final String TAG = "QuizActivity";

=======
>>>>>>> 4df0bf10e2dd35da0569d85107267c3468de8098
>>>>>>> e85612616f53dd9acf03287199c59c96ab5aa7e7
>>>>>>> 41f94498dd72466f665551ebc62879d1effcdee8
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06
    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private Button mPrevButton;
<<<<<<< HEAD
    private Button mCheatButton;
=======
<<<<<<< HEAD
    private Button mCheatButton;
=======
>>>>>>> 41f94498dd72466f665551ebc62879d1effcdee8
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06
    private TextView mQuestionTextView;

    private Question[] mQuestionBank = new Question[]{
            new Question(R.string.question_oceans, true),
            new Question(R.string.question_mideast, false),
            new Question(R.string.question_africa, false),
            new Question(R.string.question_americas,true),
            new Question(R.string.question_asia,true)

    };

    private int mCurrentIndex = 0;
<<<<<<< HEAD
    private boolean mIsCheater;
=======
<<<<<<< HEAD
    private boolean mIsCheater;
=======
>>>>>>> 41f94498dd72466f665551ebc62879d1effcdee8
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        Log.d(TAG, "onCreate(Bundle) called");
=======
<<<<<<< HEAD
        Log.d(TAG, "onCreate(Bundle) called");
=======
<<<<<<< HEAD
        Log.d(TAG, "onCreate(Bundle) called");
=======
<<<<<<< HEAD
        Log.d(TAG, "onCreate(Bundle) called");
=======
>>>>>>> 4df0bf10e2dd35da0569d85107267c3468de8098
>>>>>>> e85612616f53dd9acf03287199c59c96ab5aa7e7
>>>>>>> 41f94498dd72466f665551ebc62879d1effcdee8
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06
        setContentView(R.layout.activity_quiz);

        //get a reference to the text view and set its text to the question
        //at the current index
        mQuestionTextView = (TextView)findViewById(R.id.question_text_view);
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 41f94498dd72466f665551ebc62879d1effcdee8
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06

        if(savedInstanceState != null){
            mCurrentIndex = savedInstanceState.getInt(KEY_INDEX,0);
        }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> e85612616f53dd9acf03287199c59c96ab5aa7e7
>>>>>>> 41f94498dd72466f665551ebc62879d1effcdee8
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06
        updateQuestion();

        //Getting references to Button Widgets
        mTrueButton = (Button)findViewById(R.id.true_button);
        mFalseButton = (Button)findViewById(R.id.false_button);
        mNextButton = (Button)findViewById(R.id.next_button);
        mPrevButton = (Button)findViewById(R.id.prev_button);
<<<<<<< HEAD
        mCheatButton = (Button)findViewById(R.id.cheat_button);
=======
<<<<<<< HEAD
        mCheatButton = (Button)findViewById(R.id.cheat_button);
=======
>>>>>>> 41f94498dd72466f665551ebc62879d1effcdee8
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06

        //Set listeners for Buttons
        mTrueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                checkAnswer(true);
            }
        });

        mFalseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                checkAnswer(false);
            }
        });

        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
<<<<<<< HEAD
                mIsCheater = false;
=======
<<<<<<< HEAD
                mIsCheater = false;
=======
>>>>>>> 41f94498dd72466f665551ebc62879d1effcdee8
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06
                updateQuestion();
            }
        });

        mPrevButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mCurrentIndex = mCurrentIndex -1;
                if (mCurrentIndex < 0){
                    mCurrentIndex = mQuestionBank.length -1;
                }
                updateQuestion();
            }
        });

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06
        mCheatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start CheatActivity
                //Intent i = new Intent(QuizActivity.this, CheatActivity.class);
                boolean answerIsTrue = mQuestionBank[mCurrentIndex].isAnswerTrue();
                Intent i= CheatActivity.newIntent(QuizActivity.this,answerIsTrue);
                //startActivity(i);
                startActivityForResult(i, REQUEST_CODE_CHEAT);

            }
        });

<<<<<<< HEAD
=======
=======
>>>>>>> 41f94498dd72466f665551ebc62879d1effcdee8
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (resultCode != Activity.RESULT_OK){
            return;
        }

        if (requestCode == REQUEST_CODE_CHEAT){
            if (data == null){
                return;
            }
            mIsCheater = CheatActivity.wasAnswerShown(data);
        }
    }

    @Override
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> 41f94498dd72466f665551ebc62879d1effcdee8
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "onSaveInstanceState");
        savedInstanceState.putInt(KEY_INDEX, mCurrentIndex);

    }

    @Override
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> e85612616f53dd9acf03287199c59c96ab5aa7e7
>>>>>>> 41f94498dd72466f665551ebc62879d1effcdee8
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06
    public void onStart(){
        super.onStart();
        Log.d(TAG, "OnStart() Called");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG, "OnPause() Called");
    }

    public void onResume(){
        super.onResume();
        Log.d(TAG, "OnResume() Called");
    }

    public void onStop(){
        super.onStop();
        Log.d(TAG, "OnStop() Called");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "OnDestroy() Called");
    }


    @Override
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> 4df0bf10e2dd35da0569d85107267c3468de8098
>>>>>>> e85612616f53dd9acf03287199c59c96ab5aa7e7
>>>>>>> 41f94498dd72466f665551ebc62879d1effcdee8
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Method that updates the Question
    private void updateQuestion(){
        int question = mQuestionBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(question);
    }

    //Checks User's answer against the correct answer
    private void checkAnswer(boolean userPressedTrue){
        boolean answerIsTrue =  mQuestionBank[mCurrentIndex].isAnswerTrue();
        int messageResId = 0;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06
        if (mIsCheater){
            messageResId = R.string.judgement_toast;
        }else {
            if (userPressedTrue == answerIsTrue) {
                messageResId = R.string.correct_toast;
            } else {
                messageResId = R.string.incorrect_toast;
            }
<<<<<<< HEAD
=======
=======
        if(userPressedTrue == answerIsTrue){
            messageResId = R.string.correct_toast;
        }else {
            messageResId = R.string.incorrect_toast;
>>>>>>> 41f94498dd72466f665551ebc62879d1effcdee8
>>>>>>> 05f33654f37ce8a7ea27bed1aeb395235a23ee06
        }

        Toast.makeText(this,messageResId,Toast.LENGTH_SHORT).show();
    }
}
