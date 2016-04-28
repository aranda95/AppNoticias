package alex.estudio.com.com.appnoticias;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NoticiaPrimera extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout fotos;
    private ImageButton atras;
    private ImageButton adelante;
    private ImageButton menu;
    private TextView textoAudi;
    private ImageView imagen;

    public int[] imagenesAudi = {R.drawable.audi1, R.drawable.audi2, R.drawable.audi3};
    private int posicion = 0, posicionFinal = imagenesAudi.length -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia1);

        fotos = (LinearLayout)findViewById(R.id.fotosAudi);
        atras = (ImageButton)findViewById(R.id.atrasAudi);
        adelante = (ImageButton)findViewById(R.id.adelanteAudi);
        menu = (ImageButton)findViewById(R.id.menuAudi);
        textoAudi = (TextView)findViewById(R.id.textoAudi);
        imagen = (ImageView)findViewById(R.id.imagen);

        atras.setOnClickListener(this);
        adelante.setOnClickListener(this);
        menu.setOnClickListener(this);


        atras.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                if (posicion <= 0) {
                    posicion = posicionFinal;
                } else {
                    posicion = posicion - 1;
                }

                imagen.setImageResource(imagenesAudi[posicion]);

            }
        });

        adelante.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if (posicion >= posicionFinal) {

                    posicion = 0;

                } else {
                    posicion = posicion + 1;
                }


                imagen.setImageResource(imagenesAudi[posicion]);

            }
        });


        textoAudi.setText("Audi A4 L, batalla extendida para China"+
                            "\n"+
                            "\nHoy comienza el Salón de Pekín 2016 y estamos viendo muchas novedades, entre ellas vehículos con batalla extendida, algo muy típico en China. Uno de los que se apuntan a este alargamiento de carrocería es el Audi A4 L. Este modelo que solo llegará al mercado chino crece hasta los 4,81 metros de largo, dejando la distancia entre ejes en 2,91 metros, lo que supone un incremento de 4 centímetros respecto a su predecesor."+
                            "\n"+
                            "\nA pesar de ser más grande también es 110 kg más ligero que el anterior A4 L, cosas de la nueva generación. También tendrá el mismo diseño que se introdujo en el cambio generacional, con una imagen más dinámica. En el habitáculo predomina la tecnología y podremos encontrar el Virtual Cockpit de la marca, así como el Head-Up Display que proyecta la información en el parabrisas."+
                            "\n"+
                            "\nSu gama de motores estará formada por dos mecánicas de gasolina de 2.0 litros TFSI. Estos cuatro cilindros vendrán con dos niveles de potencia: 190  o 252 CV. En ambos casos el cambio será automático de doble embrague y siete velocidades. De serie tendrá tracción delantera, pero opcionalmente el cliente podrá escoger la tracción total quattro. Las ventas del Audi A4 L comenzarán en China este verano.");

    }





    @Override
    public void onClick(View v) {

        if (v.getId() == menu.getId()){
            System.exit(0);

            //Si no funciona forzar el Intent
        }


    }
}
