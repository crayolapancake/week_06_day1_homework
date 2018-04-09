public class Bottle {
    private int volume;


    public Bottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int takeDrink(){
        if (this.volume >= 10) {
            return this.volume - 10;}
                    else
        return this.volume;
        }

//  Add a drink function that takes 10 from the volume each time it is called.
    public int remove10(){
        return this.volume -10;
    }


//  Create an empty function that brings the volume down to 0.

    public int emptyBottle(){
        volume = 0

            }

//  Create a fill function that fills the volume back to 100.
        public int fillBottle(){

        }

}
