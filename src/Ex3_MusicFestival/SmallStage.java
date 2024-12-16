package Ex3_MusicFestival;

class SmallStage extends Event{

    public int numMem;
    public String location = "Crane";

    public SmallStage(String name, String type, int numMem){
        super(name, type);



    }

    public void setNumMem(int numMem) {
        this.numMem = numMem;
    }

    public void likeability(){
        System.out.println("How much do the crowed like the artist?\nAlot\nkinda\nnot at all");
        String name = Library.input.nextLine();
        if(name.equalsIgnoreCase("Alot")){
            System.out.println("we will invite them back");
        }else if (name.equalsIgnoreCase("kinda")){
            System.out.println("we will invite them back if there is room");
        }else if (name.equalsIgnoreCase("not at all")){
            System.out.println("we will not invite them back");
        }

    }
}//class
