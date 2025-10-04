public class Fractions {
    private  int citatel;
    private int menovatel;

    public Fractions(int citatel, int menovatel){
        if(menovatel == 0){
            throw new IllegalArgumentException("Menovatel nesmie byt 0"); //zastavenie programu ak sa menovatel = 0
        }
        this.citatel = citatel;
        this.menovatel = menovatel;
        uprav();
    }

    public void vypis(){
        System.out.println(citatel);
        System.out.println("-");
        System.out.println(menovatel);
    }

    public Fractions scitaj(Fractions z){
        int pomCitatel = this.citatel * z.menovatel + this.menovatel * z.citatel;
        int pomMenovatel = this.menovatel * z.menovatel;
        return new Fractions(pomCitatel, pomMenovatel);
    }

    public Fractions odcitaj(Fractions z){
        int pomCitatel = this.citatel * z.menovatel - this.menovatel * z.citatel;
        int pomMenovatel =this.menovatel * z.menovatel;
        return new Fractions(pomCitatel, pomMenovatel);
    }

    public Fractions vynasob(Fractions z){
        int pomCitatel = this.citatel * z.citatel;
        int pomMenovatel =this.menovatel * z.menovatel;
        return new Fractions(pomCitatel,pomMenovatel);
    }

    public Fractions vydelit(Fractions z){
        if(z.citatel == 0){
            throw new IllegalArgumentException("Delene 0");
        }
        int pomCitatel = this.citatel * z.menovatel;
        int pomMenovatel =this.menovatel * z.citatel;
        return new Fractions(pomCitatel, pomMenovatel);
    }

    //BONUS
    //Private lebo s tymito funkciami pracujeme len v tomto classe
    private int nsd(int citatel, int menovatel){
        if(citatel < 0){
            citatel =citatel * -1;          //Ak je citatel < 0 musime z neho spravit kladne cislo
        }
        if(menovatel < 0){
            menovatel = menovatel * -1;     //Ak je menovatel < 0 spravime z neho kladne cislo
        }                                   //Ak pocitame nsd obydva cisla musia byt kladne inak vypocita nespravne
        while(menovatel != 0){
            int pom = menovatel;
            menovatel = citatel % menovatel;    //Hladanie najmansieho spolocneho delitela
            citatel = pom;
        }
        return citatel;
    }
    //Zlomok upravime, tak ze citatel a menovatel vydelime NSD.
    private void uprav(){
        int najmansiSpolocnyDelitel = nsd(citatel,menovatel);
        citatel = citatel / najmansiSpolocnyDelitel;
        menovatel = menovatel / najmansiSpolocnyDelitel;
    }
}
