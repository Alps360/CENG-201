package Lab4;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedPlaylist playlist = new DoublyLinkedPlaylist();
        
        playlist.addSong("Sting - Shape of My Heart");
        playlist.addSong("Steelheart - She's Gone");
        playlist.addSong("Bill Withers -  Ain't No Sunshine");

        playlist.printPlaylist();

        playlist.nextSong();
        playlist.nextSong();

        playlist.previousSong();
        playlist.previousSong();

        playlist.removeCurrent();

        playlist.printPlaylist();
    }
}
