public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligarTv();

       smartTv.aumentarVolume();
       smartTv.aumentarVolume();
       smartTv.aumentarCanal();
       smartTv.aumentarCanal();

       smartTv.mudarCanal(12);

    }
}
