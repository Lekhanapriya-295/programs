 class PublicClass {
 public void display() {
 System.out.println("Public method accessed!");
 }
}

 class Testpublic {
 public static void main(String[] args) {
 PublicClass obj = new PublicClass();
 obj.display(); 
}
}