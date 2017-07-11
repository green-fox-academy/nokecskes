using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Anagram
{
    public class AnagramChecker
    {

        public static bool checkIfAreAnagrams(string baseWord, string wordToCheck)
        {
            if (baseWord.Length != wordToCheck.Length || !areAnagrams(baseWord, wordToCheck))
            {
                return false;
            }
            return true;
        }

        public static bool areAnagrams(string baseWord, string wordToCheck)
        {
            char[] baseWordSorted = transformToSortedArray(baseWord);
            char[] wordToCheckSorted = transformToSortedArray(wordToCheck);

            if (!baseWordSorted.SequenceEqual(wordToCheckSorted))
            {
                return false;
            }
            return true;
        }

        public static char[] transformToSortedArray(string word)
        {
            string wordInLowerCase = word.ToLower();
            char[] wordAsArray = wordInLowerCase.ToCharArray();
            Array.Sort(wordAsArray);
            return wordAsArray;
        }
    }
}

