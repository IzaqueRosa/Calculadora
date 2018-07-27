package modelo;

public class Calculos {

    int num1;
    int num2;

    public Calculos() {
    }

    public Calculos(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int soma() {
        return num1 + num2;
    }

    public int subtracao() {
        return num1 - num2;
    }

    public int divisao() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return 0;
        }
    }

    public int multiplicacao() {
        return num1 * num2;
    }

    public int exponenciacao() {
        return (int)Math.pow(num1, num2);
    }

    public int resto() {
        return num1 % num2;
    }

}
