package Prob.Ex16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex16 {

        public static void main(String[] args) {
            List<Student> studentList = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader("C:\\NDS\\java\\workspace\\Ex\\src\\Example2\\student.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] studentInfo = line.split("/");
                    int number = Integer.parseInt(studentInfo[0]);
                    String name = studentInfo[1];
                    int score = Integer.parseInt(studentInfo[2]);
                    String course = studentInfo[3];

                    Student student = new Student(number, name, score, course);
                    studentList.add(student);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // 성적을 내림차순으로 정렬
            Collections.sort(studentList, new Comparator<Student>() {
                @override
                public int compare(Student s1, Student s2) {
                    int scoreComparison = Integer.compare(s2.getScore(), s1.getScore());
                    if (scoreComparison == 0) {
                        return Integer.compare(s1.getNumber(), s2.getNumber());
                    }
                    return scoreComparison;
                }
            });

            // 결과 출력
            System.out.println("번호\t이름\t성적\t반");
            for (Student student : studentList) {
                System.out.println(student.getNumber() + "\t" + student.getName() + "\t" + student.getScore() + "\t" + student.getCourse());
            }
        }
    }

    class Student {
        private int number;
        private String name;
        private int score;
        private String course;

        public Student(int number, String name, int score, String course) {
            this.number = number;
            this.name = name;
            this.score = score;
            this.course = course;
        }

        public int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public String getCourse() {
            return course;
        }
    }