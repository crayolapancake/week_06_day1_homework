public class Bottle {

    private int volume;


    public Bottle() {
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

    public void takeDrink() {
        this.volume -= 10;
     }


    public void emptyBottle(){
        this.volume = 0;
    }


        public void fillBottle(){
            this.volume = 100;
     }

}
