package model;

/**
 *
 * @author Davi Alves
 * @since 19/03 
 * @version 1.0 T
 */
public class Numero {
   private double n1;
   private double n2;

    public Numero() { }
    
    /**
     * 
     * @param n1 se preapara para receber seu valor
     * @param n2 se preapara para receber seu valor
     */
    public Numero(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    //setters
    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    //getters
    
    /**
     * 
     * @return retorna a soma entre n1 e n2
     */
    public double somar(){
        return this.n1 + this.n2;
    }
    
    /**
     * 
     * @return  retorna a subtração entre n1 e n2
     */
    public double subtrair(){
        return this.n1 - this.n2;
    }
    
    /**
     * 
     * @return  retorna a multiplicação entre n1 e n2
     */
    public double multiplicar(){
        return this.n1 * this.n2;
    }
        
    /**
     * 
     * @return  retorna a divisão entre n1 e n2
     */
    public double dividir(){
        return this.n1 / this.n2;
    }
    /**
     * 
     * @return verifica se o n1 é par
     */
    public boolean  verificarParN1(){
        return this.n1%2==0;
    }
   
    /**
     * 
     * @param num recebe um numero qualquer
     * @return verifica se esse numero qualquer é par
     */
    public boolean  verificarNum(int num){
        return num%2==0;
    }
    
    /**
     * 
     * @param n recebe um numero
     * @return retorna o valor do numero por extenso
     */
    public String bla(int n){
        if(n==1){
            return "um";
        }
        return "erro";
    }
}
