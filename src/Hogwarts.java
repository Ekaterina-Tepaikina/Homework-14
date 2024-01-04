public class Hogwarts {
    private String name;
    private int sorcery;
    private int transgressionDistance;

    public Hogwarts (String name, int sorcery, int transgressionDistance) {
        this.name = name;
        this.sorcery = sorcery;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSorcery() {
        return sorcery;
    }

    public void setSorcery(byte sorcery) {
        this.sorcery = sorcery;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(byte transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void compareStudents (Hogwarts student) {
        int strenghts = this.getSorcery() + this.getTransgressionDistance();
        int strenghts2 = student.getSorcery() + this.getTransgressionDistance();
        if (strenghts > strenghts2) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " обладает большей мощностью магии, чем " + this.getName());
        }
    }
}
