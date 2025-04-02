public class MyClass {
        private String name;
        private int age;
        public String description;

        public MyClass(String name, int age, String description) {
            this.name = name;
            this.age = age;
            this.description = description;
        }

        public void printInfo() {
            System.out.println("Name: " + name + ", Age: " + age + ", Description: " + description);
        }
    }

