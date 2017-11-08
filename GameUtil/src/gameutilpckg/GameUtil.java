/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameutilpckg;

/**
 *
 * @author i15019
 */
public abstract class GameUtil {

    private static Singleton singleton = new Singleton();
    public GameUtil instance;
    public byte QUAD;
    public byte SPHERE;
    public byte BOX;
    public byte CYLINDER;

    public GameUtil() {
        this.QUAD = 3;
        this.SPHERE = 4;
        this.BOX = 1;
        this.CYLINDER = 2;
        this.instance = instance;
    }

    public abstract GameUtil getInstance();

    public int randomInt(int start, int end) {
        int random = (int) (Math.random() * end + start);
        return random;
    }
    
    public byte randomByte(byte start, byte end) {
        byte random = (byte) (Math.random() * end + start);
        return random;
    }
    
    public float randomByte(float start, float end) {
        float random = (float) (Math.random() * end + start);
        return random;
    }
}
