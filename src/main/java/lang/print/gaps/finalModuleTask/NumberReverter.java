package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int last = number / 100;
        int middle = (number - last * 100) / 10;
        int first = (number - last * 100 - middle * 10);

        int result = first * 100 + middle * 10 + last;
        System.out.println(result);
    }
}
