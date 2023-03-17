public class Minecraft extends VideoGame{
    private int numberOfDiamonds;
    private boolean multiplayer;

    public Minecraft(String n, String p, boolean m, int d){
        super(n,p);
        multiplayer = m;
        numberOfDiamonds = d;
    }

    public int getNumberOfDiamonds() {
        return numberOfDiamonds;
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void mine(){
        if(multiplayer == false){
            System.out.println("You mined zero diamonds and you are lonely");
        }
        else{
            System.out.println("You mined zero diamonds but go ask your friends for some");
        }
    }
}
