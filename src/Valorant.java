public class Valorant extends VideoGame{
    private int kills;
    private int deaths;

    public Valorant(String n, String p, int k, int d){
        super(n, p);
        kills = k;
        deaths = d;
    }

    public int getKills() {
        return kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public double calculateKD(){
        return (double)kills/deaths;
    }
}
