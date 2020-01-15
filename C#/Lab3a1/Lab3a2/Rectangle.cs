using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab3a2
{
    // Creates generic class rectangle
    class Rectangle<T>
    {
        T length;
        T width;

        // Getter and setter for length
        public T Length
        {
            get { return length; }
            set { length = value; }
        }

        // Getter and setter for width
        public T Width
        {
            get { return width; }
            set { width = value; }
        }

        // Getter for area, dynamic escapes type checking at compile time instead resolves type at run time
        public T Area
        {
            get { return (dynamic) length * width; }
        }
    }
}



