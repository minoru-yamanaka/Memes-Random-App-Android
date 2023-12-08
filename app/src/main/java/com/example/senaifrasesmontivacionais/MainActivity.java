package com.example.senaifrasesmontivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textFrase;
    private ImageView imagemFrase;
    private Button mudarFrase;

    private String[] frases = {
            // Suas frases aqui...

            "01 - e com certeza \n" +
                    "\n" +
                    "a nota alta vem\n",

            "2 – Uma mulher calada\n" +
                    "\n" +
                    "é uma pistola com silenciador \n",

            "03 – Minha amiga postou: Meu cabelo é minha vida\n" +
                    "\n" +
                    "Fui e comentei: Vida dura HEIN\n" +
                    "\n" +
                    "amiga: ela foi e me exclui!\n",

            "04 – Meu cupido deve ser traficante \n" +
                    "\n" +
                    "Só me traz droga\n",

           "05 – Com uma chinelada bem dada \n" +
                    "\n" +
                    "Minha mãe alinhava meu\n" +
                    "\n" +
                    "chacras, limpava minha alma,\n" +
                    "\n" +
                    "ativava meus sentidos,",
                    "\n" +
                    "Desobstruia meu caminho",

            "06 – Estude.. pois a caneta é \n" +
                    "\n" +
                    "mais leve que a pá.\n" +
                    "\n" +
                    "Também pode significar nostalgia, incapacidade e depressão.\n" +
                    "\n" +
                    "As nuvens, eventualmente, passam, e o sol brilha novamente, por mais longa que seja a tempestade.",

            "07 – Professor, a prova é com \n" +
                    "\n" +
                    "Consulta?\n" +
                    "\n" +
                    "Claro. Quem trouxe o cérebro\n" +
                    "\n" +
                    "pode usar À vontade.\n" ,

   };


    private int[] imagens = {
            // Seus IDs de recursos de imagens aqui...

            R.drawable.nota,
            R.drawable.mulher,
            R.drawable.cabeloduro,
           R.drawable.cupido,
            R.drawable.chineladas,
            R.drawable.caneta,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa os elementos da interface do usuário
        textFrase = findViewById(R.id.textFrase);
        imagemFrase = findViewById(R.id.imagemFrase);
        mudarFrase = findViewById(R.id.mudarFrase);

        // Adiciona a capacidade de rolagem ao TextView
        textFrase.setMovementMethod(new ScrollingMovementMethod());
    }

    public void mudarFrase(View view) {
        // Gere um número aleatório para selecionar uma frase
        int indiceAleatorio = new Random().nextInt(frases.length);

        // Atualize o texto da TextView com a frase selecionada
        textFrase.setText(frases[indiceAleatorio]);

        // Atualize a imagem usando o ID de recurso correspondente à frase
        imagemFrase.setImageResource(imagens[indiceAleatorio]);
    }
}
