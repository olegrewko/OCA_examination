package comAV;

public class Quest {
    public static void main (String[] args) {
        for (SharedConstants scount : SharedConstants.values()) {
            System.out.println("Тип: " + scount.getDeclaringClass() +
                    "Числовое значение: " + scount.ordinal() + "Имя: " + scount.name());
        }
    }
}
