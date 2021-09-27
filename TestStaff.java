public class TestStaff {
    public static void main(String[] args) {
        Staff staf = new Staff("Moraes", "Rua Liberdade", "John Hopkins University", 5000);
        System.out.println(staf.toString());

        staf.setAddress("Avenida Paris");
        staf.setSchool("Imperial College");
        staf.setPay(10000);

        System.out.println("Name: "+staf.getName());
        System.out.println("Address: "+staf.getAddress());
        System.out.println("School: "+staf.getSchool());
        System.out.println("Pay= "+staf.getPay());
    }
}
