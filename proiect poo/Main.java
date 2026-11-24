public class Main {
    public static void main(String[] args) {
        FisierText t = new FisierText("nota.txt", "C:/Doc/", 600, "2024-03-10", "Ana", 1200, 40, "UTF-8", "romana", true);
        FisierImagine i = new FisierImagine("poza.png", "C:/Poze/", 1024, "2024-05-02", "Mihai", 1920, 1080, "PNG", 24, true);
        FisierPdf p = new FisierPdf("raport.pdf", "C:/PDF/", 2048, "2024-06-15", "Elena", 30, "1.7", false, true, 300);
        FisierDoc d = new FisierDoc("cv.docx", "C:/Word/", 150, "2024-01-20", "Andrei", 800, "2019", false, true, "CV");
        Email e = new Email("ana@firma.ro", "mihai@client.ro", "Va rog raspundeti urgent", "2025-02-01", false, "Oferta", 2, 3.5, "elena@firma.ro", 3);
        SMS s = new SMS("0722111222", "0733444555", "Ne vedem la 5", "2025-02-03", true, "0733444555", 300, "Orange", true, false);

        System.out.println(t);
        System.out.println("cost: " + t.calculeazaCostStocare() + ", voluminos: " + t.esteVoluminos());
        System.out.println(i);
        System.out.println("cost: " + i.calculeazaCostStocare() + ", voluminos: " + i.esteVoluminos());
        System.out.println(p);
        System.out.println("cost: " + p.calculeazaCostStocare() + ", pregatit print: " + p.estePregatitPentruPrint());
        System.out.println(d);
        System.out.println("cost: " + d.calculeazaCostStocare() + ", pregatit print: " + d.estePregatitPentruPrint());
        System.out.println(e);
        System.out.println("cost: " + e.calculeazaCost() + ", urgent: " + e.esteUrgent());
        System.out.println(s);
        System.out.println("cost: " + s.calculeazaCost() + ", urgent: " + s.esteUrgent());

        FisierText copie = new FisierText(t);
        copie.setNume("copie.txt");
        copie.setNrCuvinte(5);
        System.out.println(t.getNume() + " / " + t.getNrCuvinte());
        System.out.println(copie.getNume() + " / " + copie.getNrCuvinte());

        System.out.println(new Fisier());
        System.out.println(new SMS());
    }
}
