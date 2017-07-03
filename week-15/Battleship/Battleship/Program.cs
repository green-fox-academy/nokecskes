using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Battleship
{
    class Program
    {
        public static string[,] map = new string[mapSize, mapSize];
        public static int hit;
        public static int miss;
        public static int total;
        private const int mapSize = 21;
        private const string unseenMapField = " . ";
        private const string hitMapField = " X ";
        private const string missMapField = " O ";
        private const string corner = "  ";
        private const int hitMax = 37;
        private const int missMax = 363;
        private const int totalMax = 400;
        public enum Letters { A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T };

        static void Main(string[] args)
        {
            string userInput = "";
            do
            {
                GenerateRandomMap();
                PrintMap();
                ValidUserInput(Console.ReadLine());
                
            } while (!EndOfGame());
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
                            map[i, j] = corner;
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
                        map[i, j] = unseenMapField;
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

        private static bool EndOfGame()
        {
            if (hit == hitMax || miss == missMax)
            {
                return true;
            }
            return false;
        }

        private static void ValidUserInput(string userInput)
        {
            string[] substring = userInput.Split('-');
            foreach (string part in substring)
            {
                System.Console.WriteLine(part);

            }


        }
    }
}
