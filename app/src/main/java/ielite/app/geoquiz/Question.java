package ielite.app.geoquiz;

/**
 * Created by Suraj on 15-03-2016.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int txtResId, boolean answerTrue){
        mTextResId = txtResId;
        mAnswerTrue = answerTrue;

    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }
}
