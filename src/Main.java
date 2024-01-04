public class Main {
    public static void main(String[] args) {
        Griffindor Potter = new Griffindor ("Garry Potter", 80, 50,
                70, 75, 78);
        Griffindor Granger = new Griffindor("Hermione Granger",  100,
                80, 60, 65, 70);
        Griffindor Uizly = new Griffindor("Ron Uizly", 50, 40, 60,
                80, 65);

        Slytherin Malfoy = new Slytherin("Draco Malfoy", 80, 60, 70,
                50, 80, 75, 80);
        Slytherin Montegu = new Slytherin("Grahem Montegu", 50, 40,
                40, 45, 50, 55, 54);
        Slytherin Goyl = new Slytherin("Gregory Goyl", 80, 70,
                80, 78, 90, 95, 60);

        Hufflepuff Smit = new Hufflepuff("Zakhariya Smit", 60, 40,
                70, 76, 60);
        Hufflepuff Diggori = new Hufflepuff("Sedrick Diggori", 75, 70,
                86, 60, 67);
        Hufflepuff FinchFletchli = new Hufflepuff("Justin Finch-Fletchli", 88, 70,
                50, 60, 70);

        Ravenclaw Chang = new Ravenclaw("Chjou Chang", 87, 78,
                69,68,78, 88);
        Ravenclaw Patil = new Ravenclaw("Padma Patil", 88, 50, 69,
                70, 78, 80);
        Ravenclaw Belbi = new Ravenclaw("Marcus Belbi", 50, 50, 60,
                58, 69, 40);
    Potter.compareStudents(Malfoy);
    Chang.compareStudents(Patil);
    }
}