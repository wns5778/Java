package Class1;

public class ClassStart2 {
    public static void main(String[] args) {

        String[] StudentNames = {"학생1", "학생2", "학생3", "학생4"};
        int[] StudentAges = {15, 17, 16, 18};
        int[] StudentGrades = {90, 97, 80, 87};
        for(int i=0; i< StudentNames.length; i++){
            System.out.println("이름 : "+StudentNames[i] + " 나이 : " + StudentAges[i] + " 성적 : "+StudentGrades[i]);
        }

    }
}
