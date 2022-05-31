package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Выберите фигуру: Паралеллепипед   Сфера  Конус  Цилиндр");
while (true) {
    switch (sc.nextLine()) {
        case "Паралеллепипед":
            try {
                System.out.println("Узундугун жазыныз: ");
                int length = sc.nextInt();
                if (length < 0) {
                    throw new MyException("Фигуранын узундугу терс сан боло албайт!");
                }
                if (length > 20) {
                    throw new MyException("Фигуранын узундугу 20 дан жогору болбоосу керек!");
                }

                System.out.println("туурасын жазыныз: ");
                int width = sc.nextInt();
                if (width < 0) {
                    throw new MyException("Фигуранын туурасы терс сан боло албайт!");
                }
                if (width > 20) {
                    throw new MyException("Фигуранын туурасы 20 дан жогору болбоосу керек!");
                }

                System.out.println("бийиктигин жазыныз: ");
                int height = sc.nextInt();
                if (height < 0) {
                    throw new MyException("Фигуранын бийктиги терс сан боло албайт!");
                }
                if (height > 20) {
                    throw new MyException("Фигуранын бийиктиги 20 дан жогору болбоосу керек!");
                }
                Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
                parallelepiped.area();
                parallelepiped.volume();
            } catch (MyException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Данные должны состоять из цифр!!!");
            }
            break;

        case "Сфера":
            try {
                System.out.println("Введите радиус сферы:");
                int radiuos = sc.nextInt();
                if (radiuos < 0) {
                    throw new MyException("Радиус не должна быть ниже нуля");
                }
                if (radiuos > 30) {
                    throw new MyException("Радиус не должна быть выше 30ти");
                }
                Sphere sphere = new Sphere(radiuos);
                sphere.area();
                sphere.volume();
            } catch (MyException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Данные должны состоять из цифр!!!");
            }
            break;

        case "Цилиндр":
            try {
                System.out.println("Введите радиус цилиндра:");
                int radious = sc.nextInt();

                if (radious < 0) {
                    throw new MyException("Радиус не должна быть ниже нуля");
                }
                if (radious > 30) {
                    throw new MyException("Радиус не должна быть выше 30ти");

                }
                System.out.println("Введите  высоту цилиндра:");
                int height = sc.nextInt();
                if (height < 0) {
                    throw new MyException("Высота не должна быть ниже нуля");
                }
                if (height > 30) {
                    throw new MyException("Высота не должна быть выше 30ти");
                }
                Silindr silindr = new Silindr(radious, height);
                silindr.area();
                silindr.volume();
            } catch (MyException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Данные должны состоять из цифр!!!");
            }
            break;
        case "Конус":

            try {
                System.out.println("Введите радиус конуса:");
                int radious = sc.nextInt();
                if (radious < 0) {
                    throw new MyException("Радиус не должна быть ниже нуля");
                }
                if (radious > 30) {
                    throw new MyException("Радиус не должна быть выше 30ти");

                }
                System.out.println("Введите  высоту конуса:");
                int height = sc.nextInt();
                if (height < 0) {
                    throw new MyException("Высота не должна быть ниже нуля");
                }
                if (height > 30) {
                    throw new MyException("Высота не должна быть выше 30ти");
                }

                Konus konus = new Konus(radious, height);
                konus.area();
                konus.volume();
            } catch (MyException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Данные должны состоять из цифр!!!");
            }
            break;
        default:
            System.out.println("Выберите фигуру: Паралеллепипед   Сфера  Конус  Цилиндр");

    }

}
    }
}


