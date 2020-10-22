import java.util.ArrayList;
import java.util.List;

public class Student {

    private long id;
    private String name;
    private List<Integer> grades;

    // Constructor
    public Student (String name, long id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    // Methods
    public long getId(){
        return this.id;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the list of grades
    public List<Integer> getGrades(){
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // BONUS
    public int updateGrade() {
        return -1;
    }

    public int deleteGrade() {
        return -1;
    }
}
