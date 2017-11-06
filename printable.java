interface printable
{
int MIN=5;
void print();
}


/*inside the compiler it was executed by*/

interface printable
{
public static final int MIN=5;
public static abstract void print();
}
