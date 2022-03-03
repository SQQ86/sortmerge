public class merge {
    public static void main(String[] args) {
        int [] A = {5,2,4,6,1,3,2,6};
        int p = 1;
        int r = A.length;
        int q = (p+r)/2;
        System.out.print("Сортируем массив А - ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\nПоловина массива");
        sort(A,p,q);
        for (int i = p-1; i <q ; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\nВторая половина массива");
        sort(A,q+1,r);
        for (int i = q; i <r ; i++) {
            System.out.print(A[i] + " ");
        }
        merge(A,p,q,r);
        System.out.print("\nОтсортированный массив - ");
        for (int i = 0; i <A.length; i++) {
            System.out.print(A[i] + " ");
        }



    }
    public static void sort (int A[], int start, int end ) {
        for (int i = start-1; i < end-1; i++) {
            if (A[i] > A[i+1]){
                int buf = A[i+1];
                A[i+1]= A[i];
                A[i]= buf;

            }
        }

    }//осортировываем массив A с индекса start до индекса end
    public static void merge (int A [], int start, int half, int end ){
        for (int i = start-1; i < half ; i++) {
            for (int j = half; j <end ; j++) {
                if (A[i] > A[j]){
                    int buf = A[j];
                    A[j]= A[i];
                    A[i]=buf;
                }
            }
        }//упорядочим при слиянии первую половину массива
        for (int j = half; j <end-1 ; j++) {

            for (int i = j+1 ; i < end ; i++) {
                if (A[j] > A[i]) {
                    int buf = A[i];
                    A[i] = A[j];
                    A[j] = buf;
                    buf=0;
                }
            }
        }//упорядочим оставшуюся часть массива

    }
}
