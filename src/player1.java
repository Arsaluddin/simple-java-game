public class player1 {
    private String name;
    private String weapon;
    private int health;

    public player1(String name, String weapon, int health){
        this.name = name;
        this.weapon = weapon;
        if(health<0 || health>100){
            this.health = 100;
        }
        else{
            this.health = health;
        }
    }

    public void damagedbyGun1(){
        this.health -= 30;
        if(this.health<=0){
            this.health = 0;
        }
        System.out.println("the health is reduced by 30 and new health is" + this.health);

        if(this.health==0){
            System.out.println(getname() +" is dead");
        }
    }


    public void damagedbyGun2(){
        this.health -= 50;
        if(this.health<=0){
            this.health = 0;
        }
        System.out.println("the health is reduced by 30 and new health is" + this.health);
        
        if(this.health==0){
            System.out.println(getname() +" is dead");
        }
    }
    
    public void heal(){
        if(health <=0){
            System.out.println("the player is dead can not heal");
        }
        else{
            this.health = 100;
            System.out.println("new health : " + this.health);
        }
    }

    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name = name;
    }

    public String getweapon(){
        return weapon;
    }

    public void setweapon(String name){
        this.weapon = weapon;
    }

    public int gethealth(){
        return health;
    }

    public void sethealth(int health){
        this.health = health;
    }
}
