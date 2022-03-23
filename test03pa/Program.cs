using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace test03pa
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int age = Console.ReadLine();

            if (age < 18)
                Console.WriteLine("该生已成年");
            else
                Console.WriteLine("该生未成年");
        }
    }
}
