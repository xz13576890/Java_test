package Test_Generic.Generic03;

/**
 * 继承链
 *      Object
 *        |
 *      Fruit
 *     /   \
 *  Apple  Pear
 *   |
 * Fuji
 *
 */
public class Fruit {
}

class Apple extends Fruit{}

class Pear extends Fruit{}

class FujiApple extends Apple{}