class Main
{
    // Функция для вывода простых чисел в диапазоне заданного числа `n`
    public static void sieveOfEratosthenes(int n)
    {
        int[] a = new int[n + 1];
 
        for (int i = 0; i <= n; i++) {      // инициализировать все числа как простые
            a[i] = 1;
        }
 
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (a[i] == 1)                  // проверяет, является ли `i` простым числом
            {
                for (int j = 2; i * j <= n; j++) {
                    a[i * j] = 0;           // числа, кратные `i`, не являются простыми
                }
            }
        }
 
        for (int i = 2; i <= n; i++)
        {
            if (a[i] == 1) {
                System.out.print(i + " ");  // печатает простые числа
            }
        }
    }
 
    public static void main(String[] args)
    {
        // вывести простые числа меньше 100
        sieveOfEratosthenes(100);
    }
}