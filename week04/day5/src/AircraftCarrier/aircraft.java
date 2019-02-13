/*package AircraftCarrier;

public class aircraft {

    int ammo;
    protected int maxAmmo;
    protected int baseDamage;

    public aircraft () {
        this.ammo = 0;
    }

    //fight
    //It should use all the ammos (set it to 0) and it should return the damage it deals
    //The damage is the multiplication of the base damage and the ammos

    public void fight() {
        int damage = this.ammo * this.baseDamage;
        this.ammo =0;
    }

    //refill
    //It should take a number as parameter and substract as much ammo as possibe
    //It can't have more ammo than the number or the max ammo (can't get more ammo than what's coming from the parameter or the max ammo of the aircraft)
    //It should return the remaining ammo
    //Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288

    public int refill (int ammo) {
        int numberOfAmmosToBeLunched = this.ammo - this.ammo;
        if (numberOfAmmosToBeLunched > 0 && ammo <= numberOfAmmosToBeLunched) {
            this.ammo += ammo;
            return 0;
        } else {
            this.ammo += numberOfAmmosToBeLunched;
            return ammo -= numberOfAmmosToBeLunched;
        }

    }
    //getType
    //It should return it's type as a string

    public String getStatus () {
        return "Type" + getClass().getSimpleName() + ", Ammo: " + this.ammo +", Base Damage: " + this.baseDamage + ", All damage: " + this.baseDamage * this.ammo;

    }

    public boolean isPriority () {
        return getClass().getSimpleName().equals("F35");
    }

    //getStatus
    //It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
    //isPriority
    //It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16



}
*/