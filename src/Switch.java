public class Switch {
    public static void main(String args[]){
        String grade = "E";
        switch(grade) {
            case "A+":
            case "A":
            case "A-":
                System.out.println("Great student");
                break;
            case "B+":
            case "B":
            case "B-":
                System.out.println("Good student");
                break;
            case "C+":
            case "C":
            case "C-":
                System.out.println("Poor student");
                break;
            case "D+":
            case "D":
            case "D-":
                System.out.println("Very Poor student");
                break;
            default:
                System.out.println("Failed");
                break;
        }
    }
}
