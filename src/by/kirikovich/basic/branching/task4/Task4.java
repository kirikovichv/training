package by.kirikovich.basic.branching.task4;
//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner readBuffer = new Scanner(System.in);
        System.out.print("Enter A, B and x,y,z: ");
        Float a, b, x, y, z;
        a = readBuffer.nextFloat();
        b = readBuffer.nextFloat();
        x = readBuffer.nextFloat();
        y = readBuffer.nextFloat();
        z = readBuffer.nextFloat();
        if ((x <= y) && (y <= z)) {
            if (a < b) {
                if ((x < a) && (y < b)) {
                    System.out.println("Yes");
                    return;
                }
            } else {
                if ((x < b) && (y < a)) {
                    System.out.println("Yes");
                    return;
                }
            }
        } else {
            if ((y <= x) && (x <= z)) {
                if (a < b) {
                    if ((y < a) && (x < b)) {
                        System.out.println("Yes");
                        return;
                    }
                } else {
                    if ((y < b) && (x < a)) {
                        System.out.println("Yes");
                        return;
                    }
                }
            } else {
                if ((x <= z) && (z <= y)) {
                    if (a < b) {
                        if ((x < a) && (z < b)) {
                            System.out.println("Yes");
                            return;
                        }
                    } else {
                        if ((x < b) && (z < a)) {
                            System.out.println("Yes");
                            return;
                        }
                    }
                } else {
                    if ((z <= x) && (x <= y)) {
                        if (a < b) {
                            if ((z < a) && (x < b)) {
                                System.out.println("Yes");
                                return;
                            }
                        } else {
                            if ((z < b) && (x < a)) {
                                System.out.println("Yes");
                                return;
                            }
                        }
                    } else {
                        if ((y <= z) && (z <= x)) {
                            if (a < b) {
                                if ((y < a) && (z < b)) {
                                    System.out.println("Yes");
                                    return;
                                }
                            } else {
                                if ((z < b) && (y < a)) {
                                    System.out.println("Yes");
                                    return;
                                }
                            }
                        } else {
                            if ((z <= y) && (y <= x)) {
                                if (a < b) {
                                    if ((z < a) && (y < b)) {
                                        System.out.println("Yes");
                                        return;
                                    }
                                } else {
                                    if ((y < b) && (z < a)) {
                                        System.out.println("Yes");
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("No");
    }
}
