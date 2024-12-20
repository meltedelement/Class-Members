public class AudioBook extends Book {
    protected int playLength;

    public AudioBook(String title, int yearOfPublication, String isbn, String author, int playLength) {
        super(title, yearOfPublication, isbn, author);
        setPlayLength(playLength);
    }

    public int getPlayLength() {
        return this.playLength;
    }

    public void setPlayLength(int playLength) {
        int maximumPlayLength = 2 * 60 * 60;

        if (playLength < maximumPlayLength && playLength > 0) {
            this.playLength = playLength;
        } else {
            throw new RuntimeException("Invalid play length.");
        }
    }

    @Override
    public String toString() {
        int hours = Math.floorDiv(this.getPlayLength(), 60 * 60);
        int minutes = Math.floorDiv(this.getPlayLength() - (hours * 60 * 60), 60);
        int seconds = this.getPlayLength() - (hours * 60 * 60) - (minutes * 60);

        String output = super.toString() + String.format("%nPlay Length: %02d:%02d:%02d", hours, minutes, seconds);
        return output;
    }
}
