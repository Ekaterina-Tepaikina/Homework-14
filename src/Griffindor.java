public class Griffindor extends Hogwarts {
    private int nobleness;
    private int honor;
    private int bravery;

    public Griffindor (String name, int sorcery, int transgressionDistance, int nobleness, int honor,
                       int bravery) {
        super(name, sorcery, transgressionDistance);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobleness() {
        return nobleness;
    }

    public void setNobleness(byte nobleness) {
        this.nobleness = nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(byte honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(byte bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return getName() + ", sorcery: " + getSorcery() +
                ", transgression distance: " + getTransgressionDistance() +
                ", nobleness: " + getNobleness() +
                ", honor: " + getHonor() + ", bravery: " + getBravery();
    }

    public void compareStudents (Griffindor student) {
        int qualities = this.getNobleness() + this.getHonor() + this.getBravery();
        int qualities2 = student.getNobleness() + student.getHonor() + student.getBravery();
        if (qualities > qualities2) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " лучший Гриффиндорец, чем " + this.getName());
        }
    }
}
