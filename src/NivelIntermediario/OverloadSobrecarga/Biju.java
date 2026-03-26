package NivelIntermediario.OverloadSobrecarga;

public enum Biju {

    SHUKAKU("Shukaku",1,"Gaara"),
    MATATABI("Matatabi", 2, "Yugito Nii"),
    ISOBU("Isobu", 3, "Yagura Karatachi"),
    SON_GOKU("Son Goku", 4, "Roshi"),
    KOKUO("Kokuo", 5, "Han"),
    SAIKEN("Saiken", 6, "Uta,ata"),
    CHOMEI("Chomei", 7, "Fu"),
    GYUKI("Gyuki", 8, "Killer Bee"),
    KURAMA("Kurama", 9, "Naruto Uzumaki"),
    JUUBI("Juubi", 10, "Obito Uchiha");

    // CONSTRUTOR(NoArgs) DO ENUM
    Biju() {
    }

    // VARIAVEIS DO ENUM
    String nomeBiju;
    int caldas;
    String portador;

    // CONSTRUTOR(AllArgs) DO ENUM
    Biju(String nomeBiju, int caldas, String portador) {
        this.nomeBiju = nomeBiju;
        this.caldas = caldas;
        this.portador = portador;
    }
}
