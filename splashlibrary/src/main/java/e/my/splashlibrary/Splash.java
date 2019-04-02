package e.my.splashlibrary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import processing.android.CompatUtils;
import processing.android.PFragment;
import processing.core.PApplet;

public class Splash extends AppCompatActivity {
    private PApplet sketch;
    private Context context;
    private FrameLayout layout;

    Splash(){

    }

  public  Splash(Context context, FrameLayout layout){

        this.context = context;
        this.layout = layout;


    onCreate();

    }



    protected void onCreate() {

         layout = new FrameLayout(context);
        layout.setId(CompatUtils.getUniqueViewId());
        setContentView(layout, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        sketch = new MySplash();
        PFragment fragment = new PFragment(sketch);
        fragment.setView(layout, this);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        if (sketch != null) {
            sketch.onRequestPermissionsResult(
                    requestCode, permissions, grantResults);
        }
    }

    @Override
    public void onNewIntent(Intent intent) {
        if (sketch != null) {
            sketch.onNewIntent(intent);
        }
    }
}