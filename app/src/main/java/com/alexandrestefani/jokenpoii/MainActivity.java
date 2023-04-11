package com.alexandrestefani.jokenpoii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void optionSelected(int optionSelected){
            NumberAleatory appPlay = new NumberAleatory();
            int numberApp = appPlay.getAleatoryNumber();
            System.out.println(numberApp);

            ImageView imageResult = findViewById(R.id.imageResult);
            TextView resultText = findViewById(R.id.resultText);

            GameEngine gameEngine = new GameEngine();
            String result = gameEngine.engine(optionSelected,numberApp);
            System.out.println(result);

            //Update the App image choice
            if (numberApp == 0){
                imageResult.setImageResource(R.drawable.pedra);
            }else if (numberApp == 1){
                imageResult.setImageResource(R.drawable.papel);

            }else{
                imageResult.setImageResource(R.drawable.tesoura);
            }

            //Update the Result
            if (result == "lose"){
                resultText.setText("Você perdeu");
            }else if (result == "win"){
                resultText.setText("Você ganhou!");

            }else{
                resultText.setText("Empatou");;
            }


        }
        public void rockSelected(View view){
        this.optionSelected(0);

        }
        public void paperSelected(View view) {
            this.optionSelected(1);
        }
        public void scissorSelected(View view) {
            this.optionSelected(2);
        }



    }