//Author Shahd Mahmoud
package taskoop2;

public class Taskoop2 {

    public static void main(String[] args) {
        Complexnumbers c1 = new Complexnumbers(3, 4);
        Complexnumbers c2 = new Complexnumbers(1, 2);

        Complexnumbers c3 = c1.AddComplex(c2);

        c3.PrintComplex();

    }

}

class Complexnumbers {

    private int real;
    private int img;

    public Complexnumbers(int real, int img) {
        this.real = real;
        this.img = img;

    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public float getReal() {
        return real;
    }

    public float getImg() {
        return img;
    }

    public Complexnumbers AddComplex(Complexnumbers c) {
        int new_real = real + c.real;
        int new_img = img + c.img;
        c = new Complexnumbers(new_real, new_img);

        return c;
    }

    public Complexnumbers SubComplex(Complexnumbers c) {
        int new_real = real - c.real;
        int new_img = img - c.img;

        c = new Complexnumbers(new_real, new_img);
        return c;
    }

    public void PrintComplex() {

        System.out.println(real + " + " + img + "i");
    }

}
