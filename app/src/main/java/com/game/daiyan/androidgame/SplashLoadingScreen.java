package com.game.daiyan.androidgame;

import com.game.daiyan.framework.Game;
import com.game.daiyan.framework.Graphics;
import com.game.daiyan.framework.Screen;

/**
 * Created by daiyan on 17/11/14.
 */
public class SplashLoadingScreen extends Screen {
    public SplashLoadingScreen(Game game) {
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.splash= g.newImage("splash.jpg", Graphics.ImageFormat.RGB565);


        game.setScreen(new LoadingScreen(game));

    }

    @Override
    public void paint(float deltaTime) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void backButton() {

    }
}
