/**
 * MusicPlayerDemo.java
 *
 * Tests the playlist
 */
public class MusicPlayerDemo {

    public static void main(String[] args) {

        // Create the playlist object
        MusicPlaylist playlist = new MusicPlaylist();

        // Add songs
        playlist.addSong("Shape of You - Ed Sheeran");
        playlist.addSong("Save Me - BTS");
        playlist.addSong("Snap - Manifest");
        playlist.addSong("like JENNIE - JENNIE");

        System.out.println("=== PLAYLIST ===");
        playlist.displayPlaylist();
        System.out.println();

        System.out.println("=== CURRENT SONG PLAYING ===");
        playlist.displayCurrentSong();
        System.out.println();

        System.out.println("=== NEXT SONG TO PLAY ===");
        playlist.nextSong();
        System.out.println();

        System.out.println("=== NEXT SONG TO PLAY ===");
        playlist.nextSong();
        System.out.println();

        System.out.println("=== PREVIOUS SONG TO PLAY ===");
        playlist.previousSong();
        System.out.println();

        System.out.println("=== AFTER REMOVING Shape of You SONG ===");
        // Remove the song called "Shape of You - Ed Sheeran" from the playlist
        playlist.removeSong("Shape of You - Ed Sheeran");
        // Then display the Playlist
        playlist.displayPlaylist();
        System.out.println();

        System.out.println("=== AFTER REMOVING Snap SONG ===");
        // Remove the song called "Snap - Manifest" from the playlist
        playlist.removeSong("Snap - Manifest");
        // Then display the Playlist
        playlist.displayPlaylist();

    }
}