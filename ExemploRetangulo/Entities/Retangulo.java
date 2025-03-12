package ExemploRetangulo.Entities;

public class Retangulo {
    public double widhtlargura;
    public double heightaltura;

    public double Area(){
        return widhtlargura*heightaltura;
    }
    public double Perimetro(){
        return (2*widhtlargura)+(2*heightaltura) ;
    }
    public double Diagonal(){
        return Math.sqrt(Math.pow(widhtlargura,2)+ Math.pow(heightaltura, 2));
    }
    @Override
    public String toString() {
        return "Area do retangulo= " + String.format("%.2f",Area()) + 
        "\nPerimetro()=" + String.format("%.2f",Perimetro()) + 
        "\nDiagonal()=" + String.format("%.2f",Diagonal()) ;
    }
    
}
