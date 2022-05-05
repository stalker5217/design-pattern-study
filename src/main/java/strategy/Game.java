package strategy;

import java.util.Collections;

import strategy.characters.Character;
import strategy.characters.Barbarian;
import strategy.weapon.TwoHandedSwordBehavior;

public class Game {
	public static void main(String[] args) {
		Character barbarian = new Barbarian();
		barbarian.setWeapon(new TwoHandedSwordBehavior());
		barbarian.attackPerform();
	}
}
