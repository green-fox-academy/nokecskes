using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;


namespace AnagramTests
{
    [TestClass]
    public class UnitTest1
    {
        string baseWord;

        [TestInitialize]
        public void Initialize()
        {
            baseWord = "dog";
        }

        [TestMethod]
        public void NotAnagramsInLowerCase()
        {
            string wordToCheck = "cat";
            Assert.IsFalse(Anagram.AnagramChecker.checkIfAreAnagrams(baseWord, wordToCheck));
        }

        [TestMethod]
        public void AnagramsInLowerCase()
        {
            string wordToCheck = "ogd";
            Assert.IsTrue(Anagram.AnagramChecker.checkIfAreAnagrams(baseWord, wordToCheck));
        }

        [TestMethod]
        public void AnagramsInLowerAndUpperCase()
        {
            string wordToCheck = "oGD";
            Assert.IsTrue(Anagram.AnagramChecker.checkIfAreAnagrams(baseWord, wordToCheck));
        }
    }
}
