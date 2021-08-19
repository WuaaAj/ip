public class Deadline extends Task{
    private String endTime;

    public Deadline(String name, String endTime) {
        super(name);
        this.endTime = endTime;
    }

    public String toString() {
        return "[D]" + super.toString() + "(by: " + endTime + ")";
    }
}