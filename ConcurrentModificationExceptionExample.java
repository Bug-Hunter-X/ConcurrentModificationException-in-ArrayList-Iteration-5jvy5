public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("A", "B", "C"));

        for (String item : list) {
            if (item.equals("B")) {
                list.remove(item);
            }
        }
    }
}