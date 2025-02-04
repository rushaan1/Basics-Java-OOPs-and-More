public abstract class LivingCreature {
    private int age;
    private String gender;

    public LivingCreature(int age, String gender){
        this.age = age;
        this.gender = gender;
    }

    public void Breathe(){
        System.out.println("The creature is breathing!");
    }

    public abstract void Eat();
    public abstract void Drink();
    public abstract void Sleep();


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
