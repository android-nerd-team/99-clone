package com.example.recepinanc.demo99game;

/**
 * Created by Recepinanc on 03.10.2015.
 */
public class Stage {

    private int mStageNumber;
    private boolean isFirstPassed;
    private boolean isSecondPassed;
    private boolean isThirdPassed;

    private boolean[] isStars = new boolean[] {isFirstPassed,isSecondPassed,isThirdPassed};

    public Stage (int number,boolean firstPassed,boolean secondPassed,boolean thirdPassed) {
        mStageNumber = number;
        isFirstPassed = firstPassed;
        isSecondPassed = secondPassed;
        isThirdPassed = thirdPassed;
    }

    public boolean[] getIsStars() {
        return isStars;
    }

    public int getStageNumber() {
        return mStageNumber;
    }

    public void setStageNumber(int stageNumber) {
        mStageNumber = stageNumber;
    }

    public boolean isFirstPassed() {
        return isFirstPassed;
    }

    public void setIsFirstPassed(boolean isFirstPassed) {
        this.isFirstPassed = isFirstPassed;
    }

    public boolean isSecondPassed() {
        return isSecondPassed;
    }

    public void setIsSecondPassed(boolean isSecondPassed) {
        this.isSecondPassed = isSecondPassed;
    }

    public boolean isThirdPassed() {
        return isThirdPassed;
    }

    public void setIsThirdPassed(boolean isThirdPassed) {
        this.isThirdPassed = isThirdPassed;
    }

}
