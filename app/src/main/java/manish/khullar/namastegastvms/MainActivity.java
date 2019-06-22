package manish.khullar.namastegastvms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        imageView=findViewById(R.id.imageView);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.animation);
        imageView.startAnimation(animation);
        Thread splash=new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(2000);
                    Intent i=new Intent(getBaseContext(),LoginActivity.class);
                    startActivity(i);
                    finish();
                }
                catch(Exception e)
                {

                }
            }
        };
        splash.start();
        //if(anything wrong happens)
        //        makeMainActivity(ComponentName mainActivity)
        //Create an intent to launch the main (root) activity of a task.
    }
}