package session10.musicPlayer;

public class RunPlayer {

    public static void main(String[] args) {

//        MusicPlayer mp = new Mp3Player();
//
//        new Party().startParty( mp );


        MusicPlayerFactory f = new MusicPlayerFactory();

        new Party().startParty( f.getPlayer(90) );

    }

}
