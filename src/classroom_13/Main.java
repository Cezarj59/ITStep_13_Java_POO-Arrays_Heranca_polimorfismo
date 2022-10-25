package classroom_13;

public class Main {

    public static void main(String[] args) {
        String[] carro = {"Uno", "Tipo", "Kadett", "Chevett", "Belina", "Fiorino"};

        for (String c : carro) {
            System.out.println(c);
        }

        Animal[] animais = {
            new Animal("yoshi", "Poodle"),
            new Animal("pangaré", "Cavalo"),
            new Animal("belinha", "cão")
        };

        for (Animal a : animais) {

            System.out.println("Nome: " + a.nome);
            System.out.println("Raça: " + a.raca);
            System.out.println("--------------");
        }

        Animal[] animais2 = animais;

        Animal[] maior = new Animal[animais.length + 1];

        for (int i = 0; i < animais.length; i++) {
            maior[i] = animais[i];
        }

        animais = maior;
        animais[3] = new Animal("Sonic", "Ouriço");

        System.out.println("---------------------");
        for (Animal a : maior) {

            System.out.println("Nome: " + a.nome);
            System.out.println("Raça: " + a.raca);
            System.out.println("--------------");
        }
        animais = aumentaArrayAnimal(animais);
        animais[4] = new Animal("Muthley", "rabujento");
        for (Animal a : animais) {
            System.out.println("Nome: " + a.nome);
            System.out.println("Raça: " + a.raca);
            System.out.println("---------------");
        }

        /*-----------------------------Carros------------------------------*/
        Carros[] carros = {
            new Carros("Palio", "2005", "Preto"),
            new Carros("Monza", "1993", "Prata"),
            new Carros("Fiesta", "2005", "Prata")
        };

        for (Carros c : carros) {
            System.out.println("Modelo: " + c.modelo);
            System.out.println("Ano: " + c.ano);
            System.out.println("Cor: " + c.cor);
            System.out.println("--------------");
        }

        carros = pushCarros(carros);
        carros[3] = new Carros("Camaro SS", "1968", "Azul");

        for (Carros c : carros) {
            System.out.println("Modelo: " + c.modelo);
            System.out.println("Ano: " + c.ano);
            System.out.println("Cor: " + c.cor);
            System.out.println("--------------");
        }

    }

    private static Animal[] aumentaArrayAnimal(Animal[] a) {
        Animal[] aux = new Animal[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            aux[i] = a[i];
        }
        return aux;
    }

    private static Carros[] pushCarros(Carros[] c) {
        Carros[] aux = new Carros[c.length + 1];
        for (int i = 0; i < c.length; i++) {
            aux[i] = c[i];
        }
        return aux;
    }

}

/*------------------------------------------------------*/
class Animal {

    String nome, raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

}

class Carros {

    String modelo, ano, cor;

    public Carros(String modelo, String ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

}
