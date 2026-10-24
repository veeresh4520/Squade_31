public class Issue55_ExamAnswerSheetStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A31", "B31", "C31"};
        String target = new String("B31");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
