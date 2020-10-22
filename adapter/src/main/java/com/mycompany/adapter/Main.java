package com.mycompany.adapter;

/**
 * Адаптер - преобразует интерфейс класса к другому интерфейсу, на который рассчитан клиент.
 * Адаптер обспечивает совместную работу классов, невозможную в обычных условиях из-за 
 * несовместимости интерфейсов.
 * 
 * @author Vladimir
 */
public class Main {
    public static FigureTargetInterface figure;
    
    public static void main(String... args) {
        figure = new SquareAdapter(new Square(10));
        log(figure, Square.class);
        figure = new CircleAdapter(new Circle(10));
        log(figure, Circle.class);
        figure = new TriangleAdapter(new Triangle(5, 10, 15, 7));
        log(figure, Triangle.class);
    }
    
    /**
     * В данном примере, клиентский код использует вызовы метода log(), в котором 
     * задан параметр figure с типом целевого интерфейса FigureTargetInterface.
     * Клиент и адаптер отделены друга от друга и ничего друг о друге не знают. 
     * Классы адаптеров приводят адптируемые обьекты к целевому интерфейсу, в результате чего
     * не требуется изменять существующий клиентский код. Класс адаптера инкапсулирует 
     * логику приведения к целевому интерфейсу, поэтому в случае изменений в интерфейсе 
     * адаптируемых объектов все изменения потребуется внести толко в класс адаптера.
     * 
     * @param figure
     * @param clazz 
     */
    public static void log(FigureTargetInterface figure, Class clazz) {
        try {
            System.out.println(String.format("%s area = %.2f", clazz.getSimpleName(), figure.getFigureArea()));
            System.out.println(String.format("%s perimeter = %.2f", clazz.getSimpleName(), figure.getFigurePerimeter()));
        } catch(Exception err) {
            System.out.println(err.getMessage());
        }
    }
}
