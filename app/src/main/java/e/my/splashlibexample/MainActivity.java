package e.my.splashlibexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import e.my.splashlibrary.Splash;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        FrameLayout frameLayout = new FrameLayout(this);

        Splash splash = new Splash(this,frameLayout);

    }
}
