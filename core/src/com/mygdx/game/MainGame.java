package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Pixmap;

/**
 * The MainGame, which extends the Game class, is responsible for starting
 * the program by setting the game screen to the SplashScreen class. The
 * MainGame class also contains 
 * 
 * @author Brian Tran
 * @version 4.0 03/06/2016
 *
 *          <p>
 *          <b>Instance Variables</b>
 *          <p>
 *          <b>pm</b> Instance of Pixmap that allows for the image importing of
 *          the cursor image for custom cursors.
 *          <p>
 *          <b>mainMusic</b> Instance of Music that allows for streaming of
 *          audio
 *          <p>
 *          <b>EXT</b> Final String as extension
 *          <p>
 *          <b>mainSaveManager</b> Instance of SaveManager used to save data to
 *          files
 *
 */
public class MainGame extends Game {

	public static Music mainMusic;
	public static final String EXT = ".sav";
	private Pixmap pm;
	private SaveManager mainSaveManager;

	/**
	 * create() is an overridden method that is responsible for setting the
	 * cursor of the game to a custom texture, as well as initializing the batch
	 * variable and calling upon the mainMenu() method.
	 */
	@Override
	public void create() {

		// set music
		mainMusic = Gdx.audio.newMusic(Gdx.files.internal("assets/main_music.mp3"));
		mainMusic.setLooping(true);
		mainMusic.play();

		// sets the cursor to a custom image
		pm = new Pixmap(Gdx.files.internal("assets/cursor.png"));
		Gdx.graphics.setCursor(Gdx.graphics.newCursor(pm, 0, 0));
		pm.dispose();
		mainSaveManager = new SaveManager();

		splashScreen();

	}

	/**
	 * This method returns the current save manager.
	 * 
	 * @return mainSaveManager SaveManager currently used
	 */
	public SaveManager getSaveManager() {
		return this.mainSaveManager;
	}

	/**
	 * This method sets the current save manager using a parameter.
	 * 
	 * @param passSaveManager SaveManager used to set the current SaveManager
	 */
	public void setSaveManager(SaveManager passSaveManager) {
		this.mainSaveManager = passSaveManager;
	}

	/**
	 * Sets the current screen to the MainMenu screen.
	 */
	private void splashScreen() {
		setScreen(new SplashScreen(this));
	}

	/**
	 * Calls the render method of the Game class.
	 */
	@Override
	public void render() {
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
	}

}
