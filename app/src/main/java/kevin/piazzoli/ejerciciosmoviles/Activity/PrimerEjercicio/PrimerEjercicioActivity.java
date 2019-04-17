package kevin.piazzoli.ejerciciosmoviles.Activity.PrimerEjercicio;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import kevin.piazzoli.ejerciciosmoviles.R;

public class PrimerEjercicioActivity extends AppCompatActivity {

    private Button btnLoginUno;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer_ejercicio);
        btnLoginUno = findViewById(R.id.btnLoginUno);

        btnLoginUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PrimerEjercicioActivity.this,LoginUnoActivity.class));
            }
        });

    }
}
