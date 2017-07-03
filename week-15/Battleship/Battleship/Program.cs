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
        public enum Letters { A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T };
        public static readonly string[,] map = new string[mapSize, mapSize];

        static void Main(string[] args)
        {
            //GenerateRandomMap();
            PrintMap();
            Console.ReadLine();
        }

        private static void GenerateRandomMap()
        {
            for (int i = 0; i < mapSize; i++)
            {
                for (int j = 0; j < mapSize; j++)
                {
                    if (i == 0)
                    {
                        if (j == 0)
                        {
                            map[i, j] = "  ";
                        }
                        else
                        {
                            map[i, j] = string.Format(" {0} ", Enum.GetName(typeof(Letters), j - 1));
                        }

                    }
                    else if (j == 0)
                    {
                        map[i, j] = i.ToString("00");
                    }
                    else
                    {
                        map[i, j] = " . ";
                    }
                }
            }
        }

        private static void PrintMap()
        {
            for (int i = 0; i < mapSize; i++)
            {
                for (int j = 0; j < mapSize; j++)
                {
                    System.Console.Write(map[i, j]);
                }
                System.Console.WriteLine();
            }
        }
    }
}
