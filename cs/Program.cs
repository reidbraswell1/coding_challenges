using System;

class MainMethod
{
    private static void Main(string[] args)
    {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        int target = 13;
        int index = BinarySearch.PerformBinarySearch(arr, target);
        Console.WriteLine("Coding Challenge - Binary Search");
        Console.WriteLine($"Array = {String.Join(",", arr)}");
        Console.WriteLine($"Target = {target}");
        Console.WriteLine("Index of target " + target + " is: " + index);
    }
}