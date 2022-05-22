public class Flight {
    private String name;
    private int count;
    private boolean is_arriving;
    private int hour;

    public Flight(String name, int count, boolean is_arriving, int hour) {
        this.name = name;
        this.count = count;
        this.is_arriving = is_arriving;
        this.hour = hour;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }

    public boolean getIs_arriving() {
        return this.is_arriving;
    }

    public int getHour() {
        return this.hour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setIs_arriving(boolean is_arriving) {
        this.is_arriving = is_arriving;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String toString()
    {
        String str = (" The class: " + this.name + "," + this.count + "," + this.is_arriving + "," + this.hour);
        return str;
    }
}