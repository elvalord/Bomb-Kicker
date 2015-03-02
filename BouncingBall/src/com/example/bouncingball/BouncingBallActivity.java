package com.example.bouncingball;

import java.io.IOException;

import com.example.bouncingball.VictoryActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Pelota que rebota por la pantalla y act鷄 al pulsarla.
 * 
 * Author: pingpabar
 */
public class BouncingBallActivity extends Activity {
	/*------start--------*/
	private MediaPlayer mp = null;
	private TextView tv = null ;
	private MyCount mc = null ;
	private String Path0 ="/sdcard/BackgroundMusic/Valentine.mp3";
	private String Path1 ="/sdcard/BackgroundMusic/Valentine.mp3";
	private String Path2 ="/sdcard/BackgroundMusic/Breathe.mp3";
	private String Path3 ="/sdcard/BackgroundMusic/Begin again.mp3";
	private String Path4 ="/sdcard/BackgroundMusic/Gotta have you.mp3";
	private String Path5 ="/sdcard/BackgroundMusic/Red.mp3";	
	
//	private Button b = null;
	private MenuItem mItem1;
	private MenuItem mItem2;
	private MenuItem mItem3;
	private MenuItem mItem4;
	private MenuItem mItem5;
	/*------end--------*/
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		BouncingBallView bbv=new BouncingBallView(this, null, 0);
		setContentView(bbv);
	
		mp = new MediaPlayer();
        try {
            mp.setDataSource(Path0);//设置路径
            mp.prepare();//缓冲
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mp.start();
        mp.setLooping(true);
        
        tv = new TextView(this);
        tv.setTextSize(30);
        tv.setTextColor(android.graphics.Color.WHITE);
        this.addContentView(tv, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
        mc = new MyCount(30000, 10);//(length(ms), dirt time(ms)) 
        mc.start();      	
      
//        b = new Button(this);
//        b.setText("Switch");
//
//        RelativeLayout layout = new RelativeLayout(this);
//        RelativeLayout.LayoutParams childParams = new RelativeLayout.LayoutParams(100, 50);
//        childParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
//        childParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
//        layout.addView(b, childParams);
//
//        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
//        this.addContentView(layout, params);
//        
//        b.setOnClickListener(new View.OnClickListener() {
//		public void onClick(View v) {
//		 mp.stop();//切歌
//          mp.reset();//important
//           try {
//              mp.setDataSource(Path1);//设置路径
//              mp.prepare();//缓冲
//           } catch (IllegalArgumentException e) {
//              e.printStackTrace();
//           } catch (IllegalStateException e) {
//              e.printStackTrace();
//           } catch (IOException e) {
//              e.printStackTrace();
//           }
//           mp.start();
//           mp.setLooping(true);
//		}
//	});

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
	//	Log.i(TAG, "called onCreateOptionsMenu");
		mItem1 = menu.add("Valentine");
		mItem2 = menu.add("Breathe");
		mItem3 = menu.add("Begin Again");
		mItem4 = menu.add("Gotta Have You");
		mItem5 = menu.add("Red");
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
//		Log.i(TAG, "called onOptionsItemSelected; selected item: " + item);
		mp.stop();//切歌
        mp.reset();//important
		if (item == mItem1) {
	         try {
				mp.setDataSource(Path1);
				mp.prepare();//缓冲
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//设置路径
		}
		if (item == mItem2) {
			try {
				mp.setDataSource(Path2);
				mp.prepare();//缓冲
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//设置路径
		} else if (item == mItem3) {
			try {
				mp.setDataSource(Path3);
				mp.prepare();//缓冲
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//设置路径
		} else if (item == mItem4) {
			try {
				mp.setDataSource(Path4);
				mp.prepare();//缓冲
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//设置路径
		} else if (item == mItem5) {
			try {
				mp.setDataSource(Path5);
				mp.prepare();//缓冲
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//设置路径
		}
		 
		 mp.start();
         mp.setLooping(true);
		 return true;
	}
	/*定义一个倒计时的内部类*/  
    class MyCount extends CountDownTimer {     
        public MyCount(long millisInFuture, long countDownInterval) {     
            super(millisInFuture, countDownInterval);     
        }     
        @Override     
        public void onFinish() {     
        	Intent intent = new Intent(BouncingBallActivity.this,LoseActivity.class);
            tv.setText("0.00"); 
    		mp.stop();
    		mp.release();            
            startActivity(intent);
        }     
        @Override     
        public void onTick(long millisUntilFinished) { 
        	tv.setText(millisUntilFinished/1000+"."+millisUntilFinished%1000/10);
 //           tv.setText("请等待30秒(" + millisUntilFinished / 1000 + ")...");     
      
        }    
    } 
}
