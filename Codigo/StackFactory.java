public class StackFactory {
    public Stack getStack(String tipo) {
        switch (tipo) {
            case "ArrayList":
                return new StackArrayList<>();
            case "List":
                return new StackList<>();
            case "Vector":
                return new StackVector<>();
            default:
                return new StackArrayList<>();
        }
    }
}
