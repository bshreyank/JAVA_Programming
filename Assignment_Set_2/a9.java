package Assignment_Set_2;

public class a9 {
    
    int[] array = {10, 5, 20, 15, 25, 30};

    int highestValue = findHighestValue(array);

    System.out.println("The highest value in the array is: " + highestValue);
}

public static int findHighestValue(int[] array) {
    if (array.length == 0) {
        throw new IllegalArgumentException("Array cannot be empty");
    }

    int highest = array[0];

    for (int i = 1; i < array.length; i++) {
        if (array[i] > highest) {
            highest = array[i];
        }
    }

    return highest;
}
}
