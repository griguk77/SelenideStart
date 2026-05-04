import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class RegisterTest extends BaseTest {

    private final static String BASE_URL = "http://localhost:5173/login";
    private final static String userName = "Grigory";
    private final static String userLoginStudent = "newStudent2";
    private final static String userLoginTeacher = "newTeacher2";
    private final static String userPasswordStudent = "newStudent123";
    private final static String userPasswordTeacher = "newTeacher123";
    private final static String userRoleStudent = "Обучающийся";
    private final static String userRoleTeacher = "Преподаватель";

    @Test
    public void registerStudentTest() {
        new LoginPage(BASE_URL)
                .goToRegisterTab()
                .register(userName, userLoginStudent, userPasswordStudent, userRoleStudent)
                .checkUserData(userName, userRoleStudent)
                .logout()
                .login(userLoginStudent, userPasswordStudent)
                .checkUserData(userName, userRoleStudent);
    }

    @Test
    public void registerTeacherTest() {
        new LoginPage(BASE_URL)
                .goToRegisterTab()
                .register(userName, userLoginTeacher, userPasswordTeacher, userRoleTeacher)
                .checkUserData(userName, userRoleTeacher)
                .logout()
                .login(userLoginTeacher, userPasswordTeacher)
                .checkUserData(userName, userRoleTeacher);
    }
}