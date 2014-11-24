package com.game.daiyan.Impl;

import android.view.View;

import com.game.daiyan.framework.Input;

import java.util.List;

/**
 * Created by daiyan on 17/11/14.
 */
public interface TouchHandler extends View.OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<Input.TouchEvent> getTouchEvents();
}
