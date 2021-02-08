package com.company;
import java.util.Scanner;

public class Game {

    String characterName;
    String weaponName;
    int weaponDamage;
    int hp;

    static int swordMaximumDamage = 50;
    static int swordMinimumDamage = 10;
    static int sword = (int) (Math.random() * ((swordMaximumDamage - swordMinimumDamage) + 1)) + swordMinimumDamage;

    static int katanaMaximumDamage = 100;
    static int katanaMinimumDamage = 0;
    static int katana = (int) (Math.random() * (katanaMaximumDamage - katanaMinimumDamage));

    static int Excalibur = 666;

    public Game(String charName, int wDamage, int health, String wName) {
        characterName = charName;
        weaponName = wName;
        weaponDamage = wDamage;
        hp = health;
    }

    public void beingAttacked(String defenderName, String attackerName, int attackerWeaponDamage, String attackerWeaponName) {
        if (hp <= 0) {
            System.err.println("\n" + "YOU CANNOyT ATTACK!!!");
        } else {
            System.out.println("\n" + attackerName + " STRIKES " + defenderName + " WITH " + attackerWeaponName + " IT DOES " + attackerWeaponDamage + " DAMAGE");
            hp = (hp - attackerWeaponDamage);
            if(hp < 1) {
                System.out.println("\n" + characterName + " IS DEAD. THE ADVENTURE FINISHES HERE. ");}
            else {
                System.out.println("\n" + defenderName + " HAS " + hp + " REMAINING HEALTH! ");}
        }

    }

    public static void searchWeapon(String searchWeaponName) {
        switch(searchWeaponName) {
            case "sword": System.out.println("\n" + "We found a sword.");
                break;
            case "katana": System.out.println("\n" + "We found a katana");
                break;
            case "Excalibur": System.out.println("\n" + "Wild Excalibur appeared!!!");
                break;

            default:
                System.out.println("\n" + "CAN'T FIND " + searchWeaponName + " HERE.");
                break;
        }
    }

    public void drinkingHealingPotion() {
        int healingPotion = 20;
        hp = hp + healingPotion;
        System.out.println("\n" + characterName + " GAINED " + healingPotion + " HEALTH BY DRINKING A HEALING POTION");
        System.out.println("\n" + characterName + " NOW HAS A HEALTH OF " + hp);
    }

    public void equipExcalibur() {

        System.out.println("\nDo you want to equip Cloud with Excalibur?\n\nType Y for 'Do it!' or N for 'Ignore the weapon.'");

        Scanner in = new Scanner(System.in);
        String equip;
        equip = in.nextLine();


        while (true) {
            if (equip.toLowerCase().equals("y")) {
                weaponName = "Excalibur";
                weaponDamage = Excalibur;

                System.out.println("\n*swords clashing*\n" + characterName + " IS NOW EQUIPPED WITH " + weaponName + "\n");

                break;

            } else if (equip.toLowerCase().equals("n")) {
                System.out.println("\nEVIL WINS THIS TIME.");
                System.out.println("\nSephiroth STRIKES Cloud FOR 100 HP.\n\nCloud CAN NOT ATTACK BACK.\nEVERYTHING IS TURNING DARK...");
                break;

            } else {
                System.out.println("\nMake a decision! The future of Midgar depends on you!.\nWant to equip Excalibur? (Y/N)");
                in.nextLine();
                break;
            }
        }


}

    public static void main(String[] args) {
        Game goodGuy = new Game("Cloud", sword, 100, "Buster");
        Game evilGuy = new Game("Sephiroth", katana, 80, "Masamune");

        Game Weapon = new Game("Excalibur", Excalibur, 1000000, "Excalibur");


        goodGuy.beingAttacked(goodGuy.characterName, evilGuy.characterName, evilGuy.weaponDamage, evilGuy.weaponName);
        evilGuy.beingAttacked(evilGuy.characterName, goodGuy.characterName, goodGuy.weaponDamage, goodGuy.weaponName );
        goodGuy.drinkingHealingPotion();
        evilGuy.drinkingHealingPotion();
        searchWeapon("Excalibur");
        goodGuy.equipExcalibur();
        if (goodGuy.weaponName == "Excalibur") {
            evilGuy.beingAttacked(evilGuy.characterName, goodGuy.characterName, goodGuy.weaponDamage, goodGuy.weaponName );
        } else {
            System.out.println("\n \n____THE END_____");
        }

        String equip;

    }
}
