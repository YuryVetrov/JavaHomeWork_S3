public class Task1 {
class GFG {
    static void towerOfHanoi(int n, char from_rod,
                             char to_rod, char aux_rod)
    {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Переместитe диск " + n + " из стержня "
                           + from_rod + " на стержень "
                           + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }
    public static void main(String args[])
    {
        int N = 3;
        // А, В и С — названия стержней
        towerOfHanoi(N, 'A', 'C', 'B');
    }
}
}
