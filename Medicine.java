public class Medicine implements MedicineOperations {

    public String name;
    public String id;
    public double price;

    public Medicine() {

    }

    public Medicine(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    List<Medicine> medicines = new ArrayList<>();

    @Override
    public void insertMedicine(Medicine m) {
        medicines.add(m);
    }

    @Override
    public void deleteMedicine(String m) {
        for (int i = 0; i < medicines.size(); i++) {
            if (medicines.get(i).getID() == m) {
                medicines.remove(i);
                System.out.println("Medicine Deleted!");
                break;
            }
        }
    }

    public void showAllMedicine() {
        if (medicines.isEmpty()) {
            System.out.println("No capsule found!");
        }
        for (int i = 0; i < medicines.size(); i++) {
            if (medicines.size() > 0) {
                System.out.println("Capsule Name: " + medicines.get(i).getName());
                System.out.println("Capsule ID: " + medicines.get(i).getID());
                System.out.println("Capsule Price: " + medicines.get(i).getPrice());
            }
        }
    }
}
