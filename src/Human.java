public class Human extends LivingCreature implements Preferences {
    private String name;
    private String[] prefs;
    public Human(String name, int age, String gender){
        super(age, gender);
        this.name = name;
    }

    @Override
    public void Eat(){
        System.out.println("Human named "+name+" is eating.");
    }

    @Override
    public void Drink(){
        System.out.println("Human named "+name+" is drinking.");
    }

    @Override
    public void Sleep(){
        System.out.println("Human named "+name+" is sleeping.");
    }

    @Override
    public String[] getPreferences() {
        return prefs;
    }

    @Override
    public void setPreferences(String[] prefs) {
        this.prefs = prefs;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
