
class nested3 {

    public static void main(String[] args) {
        char gender = 'g';
        int age = 1;

        if (gender == 'm') {
            if (age >= 21) {
                System.out.println("boy eligible");
            } else {
                System.err.println("boy not eligible");
            }
        } else if (gender == 'f') {
            if (age >= 18) {
                System.out.println("girl eliglble");
            } else {
                System.out.println("not eligible");
            }
        } else {
            System.out.println("invalid");
        }
    }
}
