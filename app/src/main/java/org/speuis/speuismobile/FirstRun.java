package org.speuis.speuismobile;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.onClick;

public class FirstRun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_run);

        Typeface Exo2Light = Typeface.createFromAsset(getAssets(), "fonts/Exo2-Light.otf");
        TextView tvBienvenido = (TextView) findViewById(R.id.tvBienvenido);
        TextView tvMesage1 = (TextView) findViewById(R.id.tvMessage1);
        Button BotonInicio = (Button) findViewById(R.id.btContinue);

        tvMesage1.setTypeface(Exo2Light);
        tvBienvenido.setTypeface(Exo2Light);
        BotonInicio.setTypeface(Exo2Light);

    }


}
