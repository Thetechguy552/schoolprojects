using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab3a2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Rectangle 1");
            Rectangle<int> rect1 = new Rectangle<int>();
            Rectangle<double> rect2 = new Rectangle<double>();
            rect1.Length = 6;
            rect1.Width = 6;
            rect2.Length = 7.5;
            rect2.Width = 7.5;

            // Prints Lenght, width, area for rect1 , and rect2
            Console.WriteLine("Lenght:" + rect1.Length); 
            Console.WriteLine("Width:" + rect1.Width);
            Console.WriteLine("Area:" + rect1.Area);
            Console.WriteLine("Lenght:" + rect2.Length);
            Console.WriteLine("Width:" + rect2.Width);
            Console.WriteLine("Area:" + rect2.Area);
            Console.ReadKey();
        }
    }
}
