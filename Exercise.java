public class Exercise {
    private String name;
    private int sets;
    private int reps;
    private boolean isCompleted;

    public Exercise() {
        this("unknown");
    }

    public Exercise(String name) {
        this(name, 0);
        this.name = name;
    }

    public Exercise(String name, int sets) {
        this(name, sets , 0);
        this.name = name;
        this.sets = sets;
    }

    public Exercise(String name, int sets, int reps) {
        this.name = name;
        this.sets = sets;
        this.reps = reps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString(){
        return  "Exercise: " + this.name + ", sets: " + this.sets + ", reps: " + this.reps;
    }

}
