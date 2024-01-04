public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw (String name, int sorcery, int transgressionDistance, int mind, int wisdom,
                      int wit, int creation){
        super (name, sorcery, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(byte mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(byte wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(byte wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(byte creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return getName() + ", sorcery: " + getSorcery() +
                ", transgression distance: " + getTransgressionDistance() +
                ", mind: " + getMind() + ", wisdom: " + getWisdom() +
                ", wit: " + getWit() + ", creation: " + getCreation();
    }

    public void compareStudents (Ravenclaw student) {
        int qualities = this.getMind() + this.getWisdom() + this.getWit() + this.getCreation();
        int qualities2 = student.getMind() + student.getWisdom() + student.getWit() + student.getCreation();
        if (qualities > qualities2) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " лучший Когтевранец, чем " + this.getName());
        }
    }
}
