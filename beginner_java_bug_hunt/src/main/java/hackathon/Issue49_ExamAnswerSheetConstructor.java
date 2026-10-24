public class Issue49_ExamAnswerSheetConstructor {
    public static void main(String[] args) {
        BookRecord record = new BookRecord("ID-31", "Competitive Exam Evaluator 31", 4, 10);
        System.out.println(record.id + "|" + record.title + "|" + record.quantity + "|" + record.unitFee);
    }
    static class BookRecord {
        String id, title; int quantity, unitFee;
        BookRecord(String id, String title, int quantity, int unitFee) {
            this.id = title; this.title = id; this.quantity = unitFee; this.unitFee = quantity;
        }
    }
}
