class Frequency {
    public static void main(String args[]) {
        int[] arr = new int[26];

        String name = "prajwal";

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i) + 91);
            arr[name.charAt(i) - 97]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println((char) (i + 97) + " " + arr[i]);
            }
        }

        for (int i = 0; i < 256; i++) {
            System.out.println(i + " " + (char) (i + 0));
        }

    }
}
