package strategy.characters;

import strategy.weapon.WeaponBehavior;

public abstract class Character {
	WeaponBehavior weapon;

	public void attackPerform() {
		weapon.attack();
	}

	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
}
