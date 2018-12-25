package Facade;

public class HDD {
    void copyFromDVD (DVDRom dvdRom) {
        if(dvdRom.hasData()) {
            System.out.println("Copy to HDD from DVD");
        } else {
            System.out.println("Enter DVD on DVDRom");
        }
    }
}
