/**
 * 
 */
package com.funzio.pure2D.sounds;

/**
 * @author long
 */
public abstract class AbstractSound implements Soundable {
    protected final int mKey;
    protected int mSoundID = 0;
    protected int mPriority = 1;
    protected int mLoop = 0;

    public AbstractSound(final int key) {
        mKey = key;
    }

    public int getKey() {
        return mKey;
    }

    public int getSoundID() {
        return mSoundID;
    }

    public int getPriority() {
        return mPriority;
    }

    public void setPriority(final int priority) {
        mPriority = priority;
    }

    public int getLoop() {
        return mLoop;
    }

    public void setLoop(final int loop) {
        mLoop = loop;
    }

}