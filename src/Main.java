
//Scrivere un programma che contenga una classe chiamata Forma ed un metodo
//chiamato calcolaArea() che stampi l'area della forma.
//Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea()
//per calcolare l'area del rettangolo.

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(10,5);
        System.out.println("L' area del rettangolo è: " + rettangolo.calcolaArea());
    }
}