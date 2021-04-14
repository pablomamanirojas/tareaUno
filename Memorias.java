
public class Memorias{
    String marca;
    String color;
    int precio;
    int tamaño;
    public  Memorias(String mar,String col,int pre,int tam){
        marca = mar;
        color = col;
        precio = pre;
        tamaño = tam;
    }
    public String getMarca()
    {
        return this.marca;
    }
    public String getColor(){
        return this.color;
    }
    
}