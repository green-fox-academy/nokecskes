using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Battleship
{
    class Program
    {
        private const int mapSize = 21;
        public static readonly string[] letters = { "  ", " A ", " B ", " C ", " D ", " E ", " F ", " G ", " H ", " I ", " J ", " K ", " L ", " M ", " N ", " O ", " P ", " Q ", " R ", " S ", " T " };
        public enum Letters { A, B, C };

        static void Main(string[] args)
        {
            PrintMap();
            Console.WriteLine(Enum.GetName(typeof(Letters), 1));

            Console.ReadLine();
            

        }

        private static void PrintMap()
        {
            for (int i = 0; i < mapSize; i++)
            {
                for (int j = 0; j < mapSize; j++)
                {
                    if (i == 0)
                    {
                        System.Console.Write(letters[j]);
                    }
                    else if (j == 0)
                    {
                        System.Console.Write(i.ToString("00"));
                    }
                    else
                    {
                        System.Console.Write(" . ");
                    }
                }
                System.Console.WriteLine();
            }
        }
    }
}
