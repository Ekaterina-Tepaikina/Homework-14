public class Hufflepuff extends Hogwarts {
    private int industry;
    private int loyalty;
    private int honesty;

    public Hufflepuff (String name, int sorcery, int transgressionDistance, int industry, int loyalty,
                       int honesty) {
        super(name, sorcery, transgressionDistance);
        this.industry = industry;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustry() {
        return industry;
    }

    public void setIndustry(byte industry) {
        this.industry = industry;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(byte loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(byte honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return getName() + ", sorcery: " + getSorcery() +
                ", transgression distance: " + getTransgressionDistance() +
                ", indastry:" + getIndustry() + ", loyalty: " + getLoyalty() +
                ", Honesty: " + getHonesty();
    }

    public void compareStudents (Hufflepuff student) {
        int qualities = this.getIndustry() + this.getLoyalty() + this.getHonesty();
        int qualities2 = student.getIndustry() + student.getLoyalty() + student.getHonesty();
        if (qualities > qualities2) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " лучший Пуффендуец, чем " + this.getName());
        }
    }
}
