package uittesting.upb.org.learningenum;

/**
 * @autor Marcelo Garay
 */
public enum LearningEnum {
    DIEGO ("Diego Martinez", 123456, 72000111),
    YERI("Yeri Soruco", 654321, 60001111),
    ADRIANA ("Adrian Orellana", 789456, 6541111);

    private String name;

    private int ci;
    private int cell;
    LearningEnum(String name, int ci, int cell){
        this.name = name;
        this.ci = ci;
        this.cell = cell;
    }

    public String getName() {
        return name;
    }

    public int getCi() {
        return ci;
    }

    public int getCell() {
        return cell;
    }
}
