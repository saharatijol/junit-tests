import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    private Student student;

    @Before
    public void setUp() {
        //this.student = new Student("Sahara", 000000001);
        this.student = new Student("Sahara", 331652815);
        student.addGrade(72);
        student.addGrade(85);
        student.addGrade(89);
    }

    @Test
    public void testConstructor() {
        assertEquals(student.getName(), "Sahara");
        assertEquals(student.getId(), 331652815);
        assertNotEquals(student.getId(), 331652817);
        assertNotNull(student.getGrades());
    }

    @Test
    public void testAddGrade(){
        student.addGrade(92);
        assertEquals(4, student.getGrades().size());
        assertSame(72, student.getGrades().get(0));
    }

    @Test
    public void TestGetGradeAverage() {
        double average = student.getGradeAverage();

        assertEquals(3, student.getGrades().size());
        assertSame(72, student.getGrades().get(0));
        assertSame(85, student.getGrades().get(1));
        assertSame(89, student.getGrades().get(2));


        assertEquals(82, average, 0);
    }

}

