public class Employee {

        private String surname;
        private String name;


        public Employee(String surname, String name) {
            this.surname = surname;
            this.name = name;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }






        @Override
        public String toString() {
            return "ФИО сотрудника : " + surname + " " + name + " " + " " + " " +  " " + " ";
        }

        public String toStringFIO() {
            return surname + " " + name + " ";
        }

    }

