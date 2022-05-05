package strategy.weapon;

public class TwoHandedSwordBehavior implements WeaponBehavior{
	@Override
	public void attack() {
		System.out.println("양손검으로 툭툭");
	}
}
