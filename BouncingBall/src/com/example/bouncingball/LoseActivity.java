package com.example.bouncingball;

import java.io.IOException;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LoseActivity extends Activity {
	
	private MediaPlayer mp = null;
	private String Path0 ="/sdcard/BackgroundMusic/over.wav";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lose);
		mp = new MediaPlayer();
        try {
            mp.setDataSource(Path0);//…Ë÷√¬∑æ∂
            mp.prepare();//ª∫≥Â
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mp.start();
        mp.setLooping(false);
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		mp.stop();
		mp.release();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.victory, menu);
		return true;
	}

}
