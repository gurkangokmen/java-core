    public class MySubClass extends MySuperClass{
        String subClassField;

        public MySubClass(String superClassField, String subClassField) {
            super(superClassField);
            this.subClassField = subClassField;
        }
    }
