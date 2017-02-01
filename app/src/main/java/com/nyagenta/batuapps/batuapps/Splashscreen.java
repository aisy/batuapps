package com.nyagenta.batuapps.batuapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class Splashscreen extends Activity {

    private static int splashInterval = 800;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        //saat awal membuka aplikasi akan langsung membuat progress bar dan load gambar splash
        super.onCreate(savedInstanceState);

        //memanggil windows feature
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //mengambil content dari xml
        setContentView(R.layout.splashscreen);

        //progress membuat loading
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(Splashscreen.this, MainMenu.class);
                startActivity(i);

                this.finish();

            }

            private void finish(){

            }

        }, splashInterval);
    }

}
