package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	private int Number;
	private EditText InputNumber;

	//  TODO: deklarasikan variabel di sini

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
        InputNumber = findViewById(R.id.number_input);
        Button Btn = (Button) findViewById(R.id.guess_button);
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
	Random random = new Random();
	Number = random.nextInt(100) + 1;
	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
        String test = InputNumber.getText().toString();
        int tester = Integer.parseInt(test);
        if (tester > Number){
            Toast.makeText(this, "Angka anda Terlalu Besar", Toast.LENGTH_SHORT).show();
        }
        else if (tester == Number){
            Toast.makeText(this, "Angka Anda Besar", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Angka Anda Kecil", Toast.LENGTH_SHORT).show();
        }
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
        InputNumber.setText("");
        initRandomNumber();
	}
}
