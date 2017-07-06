import java.util.*;
class Student {
    String name;
    double score;
    double age;

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public double getAge() {
        return age;
    }

    Student (String name, double score, double age)
    {
        this.name = name;
        this.score = score;
        this.age = age;

    }

    public String toString()
    {
        return "Student { Name = "+name+"\n Score = "+score +"\n Age = "+age+ " }\n\n ";
    }



    public static final Comparator<Student> ScoreandNameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            int flag = (int)(o1.getScore()- o2.getScore());

            if(flag == 0)
            {
                flag = o1.getName().compareTo( o2.getName());
            }

            return flag;
        }
    };
}

public class Exercise5 {
    public static void main(String[] args) {
        Student[] obj = new Student[5];
        obj[0] = new Student("Ram",480,15);
        obj[1] = new Student("Shyam",400,15);
        obj[2] = new Student("Geeta",400,14);
        obj[3] = new Student("Rahul",400,16);
        obj[4] = new Student("Kishan",425,17);

        List <Student> list = new ArrayList<Student>();
        list.add(obj[0]);
        list.add(obj[1]);
        list.add(obj[2]);
        list.add(obj[3]);
        list.add(obj[4]);
        System.out.println("Students Before Sorting: "+list);
        Collections.sort(list,Student.ScoreandNameComparator);
        System.out.println("After Sorting: "+list);
    }

}

