package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * The MainGame, which extends the Game class, is currently responsible for
 * starting the execution of the application by calling upon the MainMenu class.
 * 
 * @author Brian Tran
 * @version 1.0 13/05/2016
 *
 *<p>
 *<b>Instance Variables</b>
 *<p>
 *<b>batch</b> Acts as a container for onscreen elements
 *
 */
public class MainGame extends Game {
 private SpriteBatch batch;
 
 /**
  * create() is an overridden method that is responsible for setting the cursor
  * of the game to a custom texture, as well as initializing the batch variable
  * and calling upon the mainMenu() method.
  */
 @Override
 public void create () {
	 //sets the cursor to a custom image
  Pixmap pm = new Pixmap(Gdx.files.internal("cursor.png"));
  Gdx.graphics.setCursor(Gdx.graphics.newCursor(pm, 0, 0));
  pm.dispose();
  
  batch = new SpriteBatch();
  mainMenu();
 }
 
 /**
  * Returns the SpriteBatch object.
  * @return batch
  */
 public SpriteBatch getSpriteBatch (){
	 return batch;
 }
 
 /**
  * Sets the current screen to the MainMenu screen.
  */
 public void mainMenu(){
  setScreen (new MainMenu (this));
 }

 /**
  * Calls the constructor of the Game class.
  */
 @Override
 public void render () {
  super.render();
 }

 /**
  * Unused overridden method.
  */
@Override
public void resize(int width, int height) {
	// TODO Auto-generated method stub
	
}

/**
 * Unused overridden method.
 */
@Override
public void pause() {
	// TODO Auto-generated method stub
	
}

/**
 * Unused overridden method.
 */
@Override
public void resume() {
	// TODO Auto-generated method stub
	
}

/**
 * Unused overridden method.
 */
@Override
public void dispose() {
	// TODO Auto-generated method stub
	
}


}
