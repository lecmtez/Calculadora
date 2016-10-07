package lecmtez.desapp.com.calculadora;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class calculadora extends AppCompatActivity implements View.OnClickListener {

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        View v1 = findViewById(R.id.tvVisor);
        myTextView=(TextView) v1;
        myTextView.setText("");

        View btn1 = findViewById(R.id.btnUno);
        btn1.setOnClickListener(this);
        View btn2 = findViewById(R.id.btnDos);
        btn2.setOnClickListener(this);
        View btn3 = findViewById(R.id.btnTres);
        btn3.setOnClickListener(this);
        View btn4 = findViewById(R.id.btnCuatro);
        btn4.setOnClickListener(this);
        View btn5 =  findViewById(R.id.btnCinco);
        btn5.setOnClickListener(this);
        View btn6 = findViewById(R.id.btnSeis);
        btn6.setOnClickListener(this);
        View btn7 = findViewById(R.id.btnSiete);
        btn7.setOnClickListener(this);
        View btn8 = findViewById(R.id.btnOcho);
        btn8.setOnClickListener(this);
        View btn9 = findViewById(R.id.btnNueve);
        btn9.setOnClickListener(this);
        View btn0 = findViewById(R.id.btnCero);
        btn0.setOnClickListener(this);
        View btnSuma = findViewById(R.id.btnSuma);
        btnSuma.setOnClickListener(this);
        View btnResta = findViewById(R.id.btnResta);
        btnResta.setOnClickListener(this);
        View btnMultiplicar = findViewById(R.id.btnMultiplicacion);
        btnMultiplicar.setOnClickListener(this);
        View btnDividir = findViewById(R.id.btnDivision);
        btnDividir.setOnClickListener(this);
        View btnPunto = findViewById(R.id.btnPunto);
        btnPunto.setOnClickListener(this);
        View btnBorrar = findViewById(R.id.btnClear);
        btnBorrar.setOnClickListener(this);
        View btnIgual = findViewById(R.id.btnResultado);
        btnIgual.setOnClickListener(this);
        View btnMasMenos = findViewById(R.id.btnMasMenos);
        btnMasMenos.setOnClickListener(this);

    }

    double result, m1 = 0, m2 = 0;
    char opAnterior = '+';

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnUno) myTextView.append("1");
    }
}
