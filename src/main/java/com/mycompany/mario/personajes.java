package com.mycompany.mario;

public class personajes {

    private String name;
    private int health;
    private int atribute;
    private int damage;

    public personajes(String name, int health, int atribute, int damage) {
        this.name = name;
        this.health = health;
        this.atribute = atribute;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAtribute() {
        return atribute;
    }

    public int getDamage() {
        return damage;
    }

    public void recibirDamage(int damage) {
        int menosVida = (int) (health - damage);
        this.health = menosVida;

        if (this.health <= 0) {
            System.out.println("GAME OVER");
        }
    
    }
    public int ocasionarDamage (int damage){
        System.out.println(this.name + " ha hecho un ataque.");
        return this.damage;
    }
    public void vidas(){
        System.out.println("a " + this.name + " le quedan " + this.health + " vidas");
    }
}
