package alex.estudio.com.com.appnoticias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button noticia1;
    private Button noticia2;
    private Button noticia3;
    private Button noticia4;
    private Button noticia5;
    private Button noticia6;
    private ImageButton volver;
    private   Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        noticia1 = (Button)findViewById(R.id.noticia1);
        noticia2 = (Button)findViewById(R.id.noticia2);
        noticia3 = (Button)findViewById(R.id.noticia3);
        noticia4 = (Button)findViewById(R.id.noticia4);
        noticia5 = (Button)findViewById(R.id.noticia5);
        noticia6 = (Button)findViewById(R.id.noticia6);
        volver = (ImageButton)findViewById(R.id.volver);
        noticia1.setOnClickListener(this);
        noticia2.setOnClickListener(this);
        noticia3.setOnClickListener(this);
        noticia4.setOnClickListener(this);
        noticia5.setOnClickListener(this);
        noticia6.setOnClickListener(this);
        volver.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == volver.getId()){

            System.exit(0);

            //si no funciona forzarlo con Intent
        }
        if (v.getId() == noticia1.getId()){
             i = new Intent(this,NoticiaPrimera.class);

        }
        if (v.getId() == noticia2.getId()){
             i = new Intent(this,Noticia2.class);

        }
        if (v.getId() == noticia3.getId()){
             i = new Intent(this,Noticia3.class);

        }
        if (v.getId() == noticia4.getId()){
             i = new Intent(this,Noticia4.class);

        }
        if (v.getId() == noticia5.getId()){
             i = new Intent(this,Noticia5.class);

        }
        if (v.getId() == noticia6.getId()){
          i = new Intent(this,Noticia6.class);

        }

        startActivity(i);
}
}
