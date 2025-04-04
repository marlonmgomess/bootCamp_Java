public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //Método que verifica se a TV esta desligada e então liga a TV
    public boolean ligarTv() {
        if(ligada == false){
            ligada = true;
            System.out.println("A TV está ligada");
            return true;
        }else{
            System.out.println("A TV já está ligada");
            return false;
        }
    }

    //Método que verifica se a TV esta ligada e então desliga a TV
    public boolean desligarTv() {
        if(ligada == true){
            ligada = false;
            System.out.println("A TV está desligada");
        }else{
            System.out.println("A TV já está desligada");
        }
    }

    //Método que aumenta o volume da TV
    public void aumentarVolume() {
        if(ligada == true){
            volume++;
            System.out.println("Aumentando o volume para : " + volume);
        }
    }

    //Método que diminui o volume da TV
    public void diminuirVolume() {
        if(ligada == true){
            volume--;
            System.out.println("Diminuindo o volume para : " + volume);
        }
    }

    //Método que aumenta o canal da TV
    public void aumentarCanal() {
        if(ligada == true){
            canal++;
            System.out.println("Aumentando o canal para : " + canal);
        }
    }

    //Método que diminui o canal da TV
    public void diminuirCanal() {
        if(ligada == true){
            canal--;
            System.out.println("Diminuindo o canal para : " + canal);
        }
    }

    //Método que muda para um canal específico
    public void mudarCanal(int canal) {
        if(ligada == true){
            this.canal = canal;
            System.out.println("Mudando para o canal : " + canal);
        }
    }


}