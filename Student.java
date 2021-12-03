public class Student {
    private String name;
    private int year;
    public Student(String name, int year){
        this.name = name;
        this.year = year;
    }

    // getter
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null) return false;
        if(getClass() != o.getClass()) return false;
        Student other = (Student) o;
        return name.equals(other.name) && year == other.year;
    }

    public int hashCode(){
        int result = 1;
        result = 31*result + name.hashCode();
        result = 31*result + Integer.valueOf(year).hashCode();
        return result;
    }

    public String toString(){
        return "\t[" + this.getName() +", "+this.getYear() +"학년]";
    }

}
