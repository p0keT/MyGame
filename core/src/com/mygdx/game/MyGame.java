package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class MyGame extends ApplicationAdapter {
    OrthographicCamera camera;
	SpriteBatch batch;
	Texture spaceship;
	Texture planet;
	Texture planet2;
	Texture planet3;
	Music spaceMusic;
	Rectangle recPl3;

	@Override
	public void create () {
	    camera = new OrthographicCamera();
	    camera.setToOrtho(false,1280*2,720*2);
		batch = new SpriteBatch();
		spaceship = new Texture("spaceship.png");
		planet = new Texture("planet.png");
		planet2 = new Texture("planet2.png");
		planet3 = new Texture("planet3.png");
        spaceMusic = Gdx.audio.newMusic(Gdx.files.internal("spaceSound.mp3"));
        spaceMusic.setLooping(true);
        spaceMusic.play();
		//planet4 = new Texture("planet4.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(planet, 1000, 800);
		batch.draw(planet2, 600, 1000);
		batch.draw(planet3, 2000, 1000);
//		batch.draw(planet4, 50, 100);
		batch.draw(spaceship, 1000, 50);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		spaceship.dispose();
		planet.dispose();
//		planet2.dispose();
//		planet3.dispose();
//		planet4.dispose();
	}
}
