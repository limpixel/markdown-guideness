import java.util.*;

public class StudentScoreApp {
    static class Student {
        String name;
        int id;
        int score;

        Student(String name, int id, int score) {
            this.name = name;
            this.id = id;
            this.score = score;
        }
    }

    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add student");
            System.out.println("2. Display all student names sorted by score (highest to lowest)");
            System.out.println("3. Search for a student's score by exact ID (binary search)");
            System.out.println("4. Display all student names sorted alphabetically");
            System.out.println("5. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    displayStudentsSortedByScore();
                    break;
                case 3:
                    searchStudentByExactID(scanner);
                    break;
                case 4:
                    displayStudentsSortedByName();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addStudent(Scanner scanner) {
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student ID:");
        int id = scanner.nextInt();
        System.out.println("Enter student score:");
        int score = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        students.add(new Student(name, id, score));
    }

    private static void displayStudentsSortedByScore() {
        int maxScore = findMaxScore();
        Student[] sortedStudents = countingSort(students, maxScore);

        System.out.println("Students sorted by score (highest to lowest):");
        for (int i = sortedStudents.length - 1; i >= 0; i--) {
            System.out.println(sortedStudents[i].name + " (ID: " + sortedStudents[i].id + "): " + sortedStudents[i].score);
        }
    }

    private static int findMaxScore() {
        int maxScore = 0;
        for (Student student : students) {
            if (student.score > maxScore) {
                maxScore = student.score;
            }
        }
        return maxScore;
    }

    private static Student[] countingSort(List<Student> students, int maxScore) {
        int[] count = new int[maxScore + 1];
        Student[] output = new Student[students.size()];

        for (Student student : students) {
            count[student.score]++;
        }

        for (int i = 1; i <= maxScore; i++) {
            count[i] += count[i - 1];
        }

        for (int i = students.size() - 1; i >= 0; i--) {
            Student student = students.get(i);
            output[count[student.score] - 1] = student;
            count[student.score]--;
        }

        return output;
    }

    private static void searchStudentByExactID(Scanner scanner) {
        System.out.println("Enter the exact student ID to search:");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        students.sort(Comparator.comparingInt(student -> student.id));

        int index = binarySearchByID(students, id);
        if (index != -1) {
            System.out.println("Found: " + students.get(index).name + " (ID: " + students.get(index).id + ") scored " + students.get(index).score);
        } else {
            System.out.println("Student not found.");
        }
    }

    private static int binarySearchByID(List<Student> students, int id) {
        int left = 0;
        int right = students.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = Integer.compare(students.get(mid).id, id);

            if (result == 0) {
                return mid;
            } else if (result < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    private static void displayStudentsSortedByName() {
        students.sort(Comparator.comparing(student -> student.name));

        System.out.println("Students sorted by name:");
        for (Student student : students) {
            System.out.println(student.name + " (ID: " + student.id + ")");
        }
    }
}