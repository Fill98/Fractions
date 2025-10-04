public class Main {
    public static void main(String[] args) {

        Fractions z1 = new Fractions(2,9);
        Fractions z2 = new Fractions(6,11);

        System.out.println("Prvi zlomok");
        System.out.println();

        z1.vypis();

        System.out.println();
        System.out.println("Druhy zlomok");
        System.out.println();

        z2.vypis();

        System.out.println();
        System.out.println("Scitanie");
        System.out.println();

        Fractions z3 = z1.scitaj(z2);
        z3.vypis();

        System.out.println();
        System.out.println("Odcitanie");
        System.out.println();

        z3 = z1.odcitaj(z2);
        z3.vypis();

        System.out.println();
        System.out.println("Vynasob");
        System.out.println();

        z3= z1.vynasob(z2);
        z3.vypis();

        System.out.println();
        System.out.println("Delenie");
        System.out.println();

        z3 = z1.vydelit(z2);
        z3.vypis();

        //spravit odcitanie, nasobenie a delenie DOMA
    }
}
