package strategy.weapon;

public class FlailBehavior implements WeaponBehavior{
	@Override
	public void attack() {
		System.out.println("도리깨로 툭툭");
	}
}
