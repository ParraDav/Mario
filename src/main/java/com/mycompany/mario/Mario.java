package com.mycompany.mario;

import java.util.Scanner;

public class Mario {

    static personajes Mario;
    static personajes Bowser;

    static void marioAtaca() {
        int ataque = Mario.ocasionarDamage(1);
        Bowser.recibirDamage(ataque);
        Mario.vidas();
        Bowser.vidas();

    }

    static void bowserAtaca() {
        int ataque = Bowser.ocasionarDamage(1);
        Mario.recibirDamage(ataque);
        Mario.vidas();
        Bowser.vidas();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Mario = new personajes("Mario", 3, 0, 1);
        Bowser = new personajes("Bowser", 5, 0, 1);
        char tecla = ' ';
        System.out.println("SIMULACION POR CONSOLA PELEA BOWSER VS MARIO");

        do {
            System.out.println("Que desea hacer?");
            System.out.println("q. Ataca mario");
            System.out.println("p. Atacar a mario (bowser ataca)");
            System.out.println("*. Terminar simulacion");

            tecla = sc.next().charAt(0);
            tecla = Character.toLowerCase(tecla);

            switch (tecla) {
                case 'q':
                    marioAtaca();
                    break;
                case 'p':
                    bowserAtaca();
                    break;
                case '*':
                    System.out.println("TERMINANDO SIMULACION");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
            if (Mario.getHealth() == 0 || Bowser.getHealth() == 0) {
                String nombreGanador = (Mario.getHealth() <= 0) ? Bowser.getName() : Mario.getName();
                System.out.println("La simulacion termino, y el ganador es " + nombreGanador);
                tecla = '*';
            }

        } while (tecla != '*');

    }
}
