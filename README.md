
# Memes_Random_App_AndroiSd

Este projeto é uma aplicação Android desenvolvida em Java utilizando o Android Studio. O objetivo principal é exibir frases motivacionais aleatórias juntamente com imagens relacionadas a cada frase. Abaixo estão as principais características e funcionalidades do código:

1. **Elementos da Interface Gráfica:**
   - Um `TextView` (textFrase) é utilizado para exibir as frases motivacionais.
   - Um `ImageView` (imagemFrase) é utilizado para exibir imagens correspondentes às frases.
   - Um `Button` (mudarFrase) permite ao usuário gerar uma nova frase motivacional.

2. **Dados:**
   - Um array de strings chamado `frases` armazena as frases motivacionais.
   - Um array de recursos de imagem chamado `imagens` armazena os identificadores de recursos das imagens correspondentes às frases.

3. **Método `onCreate`:**
   - No método `onCreate`, os elementos da interface do usuário são inicializados.
   - O `textFrase` recebe a capacidade de rolagem para melhorar a experiência do usuário.

4. **Método `mudarFrase`:**
   - O método `mudarFrase` é chamado quando o botão `mudarFrase` é clicado.
   - Um índice aleatório é gerado para selecionar uma frase aleatória do array `frases`.
   - O texto da `textFrase` é atualizado com a frase selecionada.
   - A imagem é atualizada utilizando o identificador de recurso correspondente à frase selecionada a partir do array `imagens`.

Em resumo, este aplicativo Android exibe frases motivacionais aleatórias com imagens correspondentes, proporcionando uma experiência interativa para os usuários que desejam receber inspiração ou motivação. O botão "Mudar Frase" permite a atualização dinâmica da frase exibida na tela.


![image](assets/Screenshot_page_home.jpg)

![image2](assets/Screenshot_page_img.jpg)
