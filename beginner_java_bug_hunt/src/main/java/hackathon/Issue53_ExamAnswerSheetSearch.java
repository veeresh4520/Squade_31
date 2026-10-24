public class Issue53_ExamAnswerSheetSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {4, 10, 3, 131};
        int target = 131;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
