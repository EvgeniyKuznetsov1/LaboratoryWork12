class Program {
    public static void main(String[] args) {
        Teacher userTeacher = new Teacher("Ванюшин И.С.", 38, "Преподаватель");
        userTeacher.setLogin("aaaaa@gmail.com");
        userTeacher.setPassword("KRUTOI12345678");

        Student userStudent = new Student("Парвадов П.Ю.", 15, "Студент");
        userStudent.setLogin("pavel2007super@gmai.com");
        userStudent.setLogin("Pashok2007");
    }
}

interface User{
    void setPassword(String password);
    String getPassword();
    void setLogin(String login);
    String getLogin();
}

abstract class People implements User{
    String FIO;
    int age;
    String post;
    String password;
    String login;

    public People(String FIO, int age, String post) {
        this.FIO = FIO;
        this.age = age;
        this.post = post;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogin() {
        return login;
    }
}

class Teacher extends People{
    Teacher(String FIO, int age, String post){
        super(FIO, age, post);
    }
}

class Student extends People{
    Student(String FIO, int age, String post){
        super(FIO, age, post);
    }
}
