import java.security.PublicKey;

public class AudioBook extends Book{
    private int sizeInMBS;
    private int playLengthInMins;
    private String playBackArtist;

    AudioBook(String title, int yearOfPublication, String author, String iSBM, int sizeInMBS, int playLengthInMins,String playBackArtist){
        super(title, yearOfPublication, author, iSBM);
        this.sizeInMBS = sizeInMBS;
        this.playLengthInMins = playLengthInMins;
        if (playLengthInMins >= 120){
            throw new IllegalArgumentException("Play length can't be longer than 2 hours");
        }
        this.playBackArtist = playBackArtist;
    }

    @Override
    public String toString(){
        return String.format("%sSize in MB's:%d MB\nLength Of book in Minutes:%d Minutes\nPlay Back Artist:%s",
                super.toString(),sizeInMBS,playLengthInMins,playBackArtist);

    }
}
