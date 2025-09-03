package jp.ac.meijou.android.s241205050;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import jp.ac.meijou.android.s241205050.databinding.ActivityMain2Binding;
import jp.ac.meijou.android.s241205050.databinding.ActivityMain3Binding;
import jp.ac.meijou.android.s241205050.databinding.ActivityMainBinding;

public class MainActivity3 extends AppCompatActivity {

    private ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonNum0.setOnClickListener(view -> {
            String current = binding.textViewNum.getText().toString();
            if (current.equals("0")) {
                current = "0";
            } else {
                current = current + "0";
            }
            binding.textViewNum.setText(current);
        });

        binding.buttonNum1.setOnClickListener(view -> {
            String current = binding.textViewNum.getText().toString();
            if (current.equals("0")) {
                current = "1";
            } else {
                current = current + "1";
            }
            binding.textViewNum.setText(current);
        });

        binding.buttonNum2.setOnClickListener(view -> {
            String current = binding.textViewNum.getText().toString();
            if (current.equals("0")) {
                current = "2";
            } else {
                current = current + "2";
            }
            binding.textViewNum.setText(current);
        });

        binding.buttonNum3.setOnClickListener(view -> {
            String current = binding.textViewNum.getText().toString();
            if (current.equals("0")) {
                current = "3";
            } else {
                current = current + "3";
            }
            binding.textViewNum.setText(current);
        });

        binding.buttonNum4.setOnClickListener(view -> {
            String current = binding.textViewNum.getText().toString();
            if (current.equals("0")) {
                current = "4";
            } else {
                current = current + "4";
            }
            binding.textViewNum.setText(current);
        });

        binding.buttonNum5.setOnClickListener(view -> {
            String current = binding.textViewNum.getText().toString();
            if (current.equals("0")) {
                current = "5";
            } else {
                current = current + "5";
            }
            binding.textViewNum.setText(current);
        });

        binding.buttonNum6.setOnClickListener(view -> {
            String current = binding.textViewNum.getText().toString();
            if (current.equals("0")) {
                current = "6";
            } else {
                current = current + "6";
            }
            binding.textViewNum.setText(current);
        });

        binding.buttonNum7.setOnClickListener(view -> {
            String current = binding.textViewNum.getText().toString();
            if (current.equals("0")) {
                current = "7";
            } else {
                current = current + "7";
            }
            binding.textViewNum.setText(current);
        });

        binding.buttonNum8.setOnClickListener(view -> {
            String current = binding.textViewNum.getText().toString();
            if (current.equals("0")) {
                current = "8";
            } else {
                current = current + "8";
            }
            binding.textViewNum.setText(current);
        });

        binding.buttonNum9.setOnClickListener(view -> {
            String current = binding.textViewNum.getText().toString();
            if (current.equals("0")) {
                current = "9";
            } else {
                current = current + "9";
            }
            binding.textViewNum.setText(current);
        });

        binding.buttonAC.setOnClickListener(view -> {
            String current = "0";
            binding.textViewNum.setText(current);
        });

        binding.buttonKakeru.setOnClickListener(view -> {

        });
    }
}