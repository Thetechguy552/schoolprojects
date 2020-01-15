using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab3a3
{
    class Program
    {
        static void Main(string[] args)
        {
            string name = null;
            // The ?? (Null-coalescing operator) returns the left-hand if its not null; otherwise it returns the right operand 
            string myname = name ?? "Laxmi";
            // Shorthand syntax for nullable types intstead of using Nullable<int>
            int? x = null;
            double? y = null;

            //Prints nothing insted of crashing
            Console.WriteLine(x?.ToString());


            if (x.HasValue)
            {
                Console.WriteLine($"x is {x.Value}");
            }
            else
            {
                Console.WriteLine("x does not have a value");
            }

            if (y.HasValue)
            {
                Console.WriteLine($"y is {y.Value}");
            }
            else
            {
                Console.WriteLine("y does not have a value");
            }
            Console.WriteLine(myname);
            Console.ReadKey();
        }
    }
}
