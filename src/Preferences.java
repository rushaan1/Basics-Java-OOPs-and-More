public interface Preferences {
    int VALUE = 100;
    default void testVoid() {
        System.out.println("Gawk Gawk");
    }
    private void humming(){
        System.out.println("Hum Hum");
    }
    static void innit(){
        System.out.println("innit");
    }
    


    String[] getPreferences();
    void setPreferences(String[] prefs);
}
