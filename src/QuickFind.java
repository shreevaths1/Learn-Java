public class QuickFind {
    int[] id;

    public static void main(String[] args) {
        QuickFind a = new QuickFind(10);
        boolean p = a.connected(0, 1);
        System.out.println(p);

        a.union(0, 1);

        a.printarray();

    }

    public QuickFind(int N) {
        // n array accesses
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        // 2 array accesses
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        // 2(n + 1) + 2 array accesses in total

        // 2 array accesses below
        int pid = id[p];
        int qid = id[q];

        // 2(n + 1) array accesses below
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    public void printarray() {
        for (int element : id) {
            System.out.print(element + " ");
        }
    }
}