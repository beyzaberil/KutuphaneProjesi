

   // Mainli Kısım
public class Main {
    public static void main(String[] args) {
        //new c dilindeki malloca(memory allocation) benzer,yani bu nesneyi tanımlamak için hafızada yer açıyor
        Student student = new Student();

        student.name="Murat";
        student.id=123;
        student.midTerm=70;
        student.finalExam=80;
        student.showAllInfo();

        Student student2= new Student();
        student2.id=124;
        student2.showAllInfo();
    } }

