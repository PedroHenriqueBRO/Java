package Classes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs = new ArrayList<Song>();
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }
    public boolean addSong(String title, double duration) {
        Song novo= new Song(title,duration);
        if(findSong(title)==null) {
            songs.add(novo);
            return true;
        }else{
            return false;
        }

    }
    private Song findSong(String title) {
        for(Song song: songs) {
            if(song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }
    public boolean addToPlayList(String title, LinkedList<Song> aux) {
        if(findSong(title)!=null) {
            aux.offer(findSong(title));
            return true;
        }
        return false;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> aux) {
        if(trackNumber-1>=0) {
            if (songs.size() >= trackNumber && songs.get(trackNumber - 1) != null) {
                aux.offer(songs.get(trackNumber - 1));
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", songs=" + songs +
                '}';
    }
}
