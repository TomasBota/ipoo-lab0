
/**
 * Write a description of class AppStart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AppStart
{
    public static void main(String[] args){
        Size size = Size.MEDIUM;
        
        System.out.println("toString(): " + size.toString());
        System.out.println("Ordem: " + size.ordinal());
        System.out.println("Valor máximo: " + size.getMaxValue());
        System.out.println("Valor mínimo: " + size.getMinValue());
        System.out.println("Código: " + size.getCode());
    }
}
