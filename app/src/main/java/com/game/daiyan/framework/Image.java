package com.game.daiyan.framework;

/**
 * Created by daiyan on 17/11/14.
 */
public interface Image {
    public int getWidth();
    public int getHeight();
    public Graphics.ImageFormat getFormat();
    public void dispose();
}
