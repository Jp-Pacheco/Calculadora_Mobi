package mobile.appescola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtValor1, edtValor2;
    Button btnSomar, btnSub, btnMult, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtValor1 = findViewById(R.id.edtV1);
        edtValor2 = findViewById(R.id.edtV2);
        btnSomar = findViewById(R.id.btnSomar);
        btnSub = findViewById(R.id.btnSub);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);




        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, soma;
                valor1 = Double.parseDouble(
                        edtValor1.getText().toString());
                valor2 = Double.parseDouble(
                        edtValor2.getText().toString());
                soma = valor1 + valor2;
                Toast.makeText(MainActivity.this,
                        "A soma vai ser igual a "+soma,
                        Toast.LENGTH_LONG).show();
            }
        });


        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, sub;
                valor1 = Double.parseDouble(
                        edtValor1.getText().toString());
                valor2 = Double.parseDouble(
                        edtValor2.getText().toString());
                sub = valor1 - valor2;
                Toast.makeText(MainActivity.this,
                        "A subtração vai ser igual a "+sub,
                        Toast.LENGTH_LONG).show();
            }
        });


        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, mult;
                valor1 = Double.parseDouble(
                        edtValor1.getText().toString());
                valor2 = Double.parseDouble(
                        edtValor2.getText().toString());
                mult = valor1 * valor2;
                Toast.makeText(MainActivity.this,
                        "A multiplicação vai ser igual a "+mult,
                        Toast.LENGTH_LONG).show();
            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, div;
                valor1 = Double.parseDouble(
                        edtValor1.getText().toString());
                valor2 = Double.parseDouble(
                        edtValor2.getText().toString());
                div = valor1 / valor2;
                Toast.makeText(MainActivity.this,
                        "A divisão vai ser igual a "+div,
                        Toast.LENGTH_LONG).show();
            }
        });


    }
}