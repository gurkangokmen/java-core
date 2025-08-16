
public class javaOperators
{
    // Operators are used to perform operations on variables and values.

    // Arithmetic Operators
    // Operator	Name	        Description	                         Example
    // +	Addition	Adds together two values	                 x + y	
    // -	Subtraction	Subtracts one value from anothe              x - y
    // *	Multiplication	Multiplies two values	                 x * y	
    // /	Division	Divides one value by another	             x / y
    // %	Modulus	Returns the division remainder	                 x % y	
    // ++	Increment	Increases the value of a variable by 1	     ++x
    // --	Decrement	Decreases the value of a variable by 1	     --x


    // Java Assignment Operators
    // Operator	Example	     Same As
    // =	x = 5	         x = 5
    // +=	x += 3	         x = x + 3
    // -=	x -= 3	         x = x - 3
    // *=	x *= 3	         x = x * 3
    // /=	x /= 3	         x = x / 3
    // %=	x %= 3	         x = x % 3
    // &=	x &= 3	         x = x & 3 (and operator in bitwise)
    // |=	x |= 3	         x = x | 3 (or operator in bitwise)
    // ^=	x ^= 3	         x = x ^ 3 (xor operator in bitwise)
    // >>=	x >>= 3	         x = x >> 3 (shift right)
    // <<=	x <<= 3	         x = x << 3 (shift left)

    // Java Comparison Operators
    // Operator	Name	                    Example
    // ==	Equal to	                    x == y
    // !=	Not equal	                    x != y
    // >	Greater than	                x > y
    // <	Less than	                    x < y
    // >=	Greater than or equal to        x >= y
    // <=	Less than or equal to	        x <= y

    // Java Logical Operators
    // Operator	Name	        Description	                                            Example
    // && 	Logical and	Returns true if both statements are true	                    x < 5 &&  x < 10
    // || 	Logical or	Returns true if one of the statements is true	                x < 5 || x < 4
    // !	Logical not	Reverse the result, returns false if the result is true	        !(x < 5 && x < 10)
    public static void main(String[] args)
    {
        System.out.println(100/9); //11
        System.out.println((double)100/9); //11.11111111111111
        System.out.println(100%9); //1
        System.out.println((double)100%9); //1.0

    }




}
