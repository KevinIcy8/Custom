public class VideoGame {
    private String userName;
    private String password;

    public VideoGame(String n, String g){
        userName = n;
        password = g;
    }

    public String getName() {
        return userName;
    }

    public String getGenre() {
        return password;
    }

    public void play(){
        System.out.println("You are currently playing. Don't forget to do your homework!");
    }
}
