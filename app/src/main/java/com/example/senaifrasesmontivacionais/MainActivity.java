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
            "01 - E com certeza a nota alta vem",
            "2 – Uma mulher calada é uma pistola com silenciador",
            "03 – Minha amiga postou: Meu cabelo é minha vida\nFui e comentei: Vida dura HEIN\namiga: ela foi e me exclui!",
            "04 – Meu cupido deve ser traficante\nSó me traz droga",
            "05 – Com uma chinelada bem dada\nMinha mãe alinhava meu chacras, limpava minha alma,\nativava meus sentidos,\nDesobstruía meu caminho",
            "06 – Estude.. pois a caneta é mais leve que a pá.\nTambém pode significar nostalgia, incapacidade e depressão.\nAs nuvens, eventualmente, passam, e o sol brilha novamente, por mais longa que seja a tempestade.",
            "07 – Professor, a prova é com consulta?\nClaro. Quem trouxe o cérebro pode usar à vontade."
    };

    private int[] imagens = {
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

    // Adicione o código do botão ao arquivo XML correspondente (activity_main.xml)
    public void mudarFrase(View view) {
        // Gera um número aleatório para selecionar uma frase
        int indiceAleatorio = new Random().nextInt(frases.length);

        // Atualiza o texto da TextView com a frase selecionada
        textFrase.setText(frases[indiceAleatorio]);

        // Atualiza a imagem usando o ID de recurso correspondente à frase
        imagemFrase.setImageResource(imagens[indiceAleatorio]);
    }
}
