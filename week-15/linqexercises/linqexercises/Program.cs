using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace linqexercises
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };

            IEnumerable<int> evenNumbers = n.Where(i => i % 2 == 0);
            System.Console.WriteLine("Even numbers from the list: ");
            foreach (int i in evenNumbers)
            {
                System.Console.WriteLine(i);
            }

            double averageOfOddNumbers = n.Where(i => i % 2 != 0).Average();
            System.Console.WriteLine("Average of the odd numbers: {0}", averageOfOddNumbers);

            IEnumerable<int> squaredValueOfPositiveNumbers = n.Where(i => i > 0);
            System.Console.WriteLine("Squared positive numbers from the list: ");
            foreach (int i in squaredValueOfPositiveNumbers)
            {
                System.Console.WriteLine(Math.Pow(i, 2));
            }

            Console.ReadLine();

        }
    }
}
