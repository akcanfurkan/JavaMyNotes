package referans_kavrami;

public class DVDPlayerTestDrive {

    public static void main(String[] args) {

        DVDPlayer dvdPlayer = new DVDPlayer();
        dvdPlayer.canRecord = true;
        dvdPlayer.playDVD();

        if (dvdPlayer.canRecord == true) {
            dvdPlayer.recordDVD();
        }
    }

}
