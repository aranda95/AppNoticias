package alex.estudio.com.com.appnoticias;

import android.app.FragmentManager;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton boton1;
    private ImageButton boton2;
    private Button instrucciones;

    public Button getInstrucciones() {

        return instrucciones;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (ImageButton)findViewById(R.id.botonMenu);
        boton2 = (ImageButton)findViewById(R.id.salir);
        instrucciones = (Button)findViewById(R.id.instrucciones);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        instrucciones.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        if (v.getId() == boton1.getId()){

            Intent i = new Intent(this,Main2Activity.class);
            this.startActivity(i);
        }
         if (v.getId() == boton2.getId()){
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            System.exit(0);
        }
        if (v.getId() == instrucciones.getId()){

            instrucciones.setClickable(false);
            FragmentManager fragmentManager = getFragmentManager();
            DialogoInstrucciones dialogo = new DialogoInstrucciones(this);
            dialogo.show(fragmentManager, "tagInstruccion");

        }


    }
}
