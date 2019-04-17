package kevin.piazzoli.ejerciciosmoviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kevin.piazzoli.ejerciciosmoviles.Activity.PrimerEjercicio.PrimerEjercicioActivity;

public class MenuActivity extends AppCompatActivity {

    private Button btnPrimerEjercicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnPrimerEjercicio = findViewById(R.id.btnPrimerEjercicio);

        btnPrimerEjercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, PrimerEjercicioActivity.class));
            }
        });

    }
}
