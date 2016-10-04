package com.bignerdranch.ahill.geoquiz;

/**
 * Created by alanhill on 8/15/16.
 */
public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mIsCheater = false;

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        this.mAnswerTrue = answerTrue;
    }

    public boolean isCheater() {
        return mIsCheater;
    }

    public void setIsCheater(boolean isCheater) {
        this.mIsCheater = isCheater;
    }
}
