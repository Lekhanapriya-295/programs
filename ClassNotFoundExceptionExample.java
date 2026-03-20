class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("TestClass");
        } catch(ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}