public class Student {
    //aynı tip değişkenler yan yana da yazılabilir, bu şekilde de yazılabilir
    String name;
    int id;
    int midTerm;
    int finalExam;


    float calculateScore()
    {
        return midTerm*0.4f + finalExam*0.6F;
    }

    void showAllInfo()
    {
        System.out.println(name + " " + " " + id + " " + calculateScore());

    }
}
