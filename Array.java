class Array {
    public static void main(String[] args) {
        int[] arr1 = {66, 22, 77, 44, 11};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        int[] arr2 = new int[10];
        arr2[0] = 11;
        arr2[1] = 22;
        arr2[2] = 33;
        arr2[3] = 44;
        arr2[4] = 55;

        System.out.println("arr2[0] = " + arr2[0]);
        System.out.println("arr2[1] = " + arr2[1]);
        System.out.println("arr2[2] = " + arr2[2]);
        System.out.println("arr2[3] = " + arr2[3]);
        System.out.println("arr2[4] = " + arr2[4]);
    }
}
