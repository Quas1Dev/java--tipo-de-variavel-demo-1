package tipodevariaveldemo1;

public class TipoDeVariavelDemo1 {
    public static void main(String[] args) {
        int velocidadeDaLuz;
        long dias;
        long segundos;
        long distancia;
            
        // Velocidade aproximada da luz em kilometros por segundo
        velocidadeDaLuz = 299792;
            
        // Específica o número de dias.
        dias = 1000; 
            
        // Converte dias para segundos. 
        segundos = dias * 24 * 60 * 60; 
            
        // Cálcula a distância.
        distancia = velocidadeDaLuz * segundos; 
            
        // Exíbe o resultado do cálculo.
        System.out.print("Em " + dias);
        System.out.print(" dias a luz viaja por cerca de ");
        System.out.println(distancia + "km.");
    }
}
