public class Slytherin extends Hogwarts {
    private int trickery;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin (String name, int sorcery, int transgressionDistance, int trickery, int resoluteness,
                      int ambition, int resourcefulness, int lustForPower) {
        super(name, sorcery, transgressionDistance);
        this.trickery = trickery;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTrickery() {
        return trickery;
    }

    public void setTrickery(byte trickery) {
        this.trickery = trickery;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public void setResoluteness(byte resoluteness) {
        this.resoluteness = resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(byte ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(byte resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(byte lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return getName() + ", sorcery: " + getSorcery() +
                ", transgression distance: " + getTransgressionDistance() +
                ", trickery: " + getTrickery() + ", resoluteness: " + getResoluteness() +
                ", ambition: " + getAmbition() + ", resourcefulness: " + getResourcefulness() +
                ", lustForPower: " + getLustForPower();
    }

    public void compareStudents (Slytherin student) {
        int qualities = this.getTrickery() + this.getResoluteness() + this.getAmbition() +
                this.getResourcefulness() + this.getLustForPower();
        int qualities2 = student.getTrickery() + student.getResoluteness() + student.getAmbition() +
                student.getResourcefulness() + student.getLustForPower();
        if (qualities > qualities2) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " лучший Слизеринец, чем " + this.getName());
        }
    }
}
