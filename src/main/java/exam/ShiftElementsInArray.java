
void printArray(int arr[], int n)

    {

        for (int i = 0; i < n; i++)

            System.out.print(arr[i] + " ");

    }
 

    // Driver program to test above functions

    public static void main(String[] args)

    {

        RotateArray rotate = new RotateArray();

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        rotate.leftRotate(arr, 2, 7);

        rotate.printArray(arr, 7);

    }
}
}
