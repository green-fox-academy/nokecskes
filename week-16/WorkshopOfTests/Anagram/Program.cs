using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Anagram
{
    class Program
    {
        static void Main(string[] args)
        {
            string baseWord = AskUserInput();
            string wordToCheck = AskUserInput();
            bool result = AnagramChecker.checkIfAreAnagrams(baseWord, wordToCheck);
            System.Console.WriteLine(result);
            Console.ReadLine();
        }

        public static string AskUserInput()
        {
            System.Console.WriteLine("Please give  me a word!");
            return Console.ReadLine();
        }

    }
}

