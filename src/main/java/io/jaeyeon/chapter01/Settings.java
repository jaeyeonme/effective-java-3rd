package io.jaeyeon.chapter01;

/**
 * 이 클래스의 인스터는 #getInstacen()를 통해 사용한다.
 * @see #getInstance()
 */
public class Settings {

    private boolean useAutoSteering;
    private boolean useABS;
    private Difficulty difficulty;

    private Settings() {}

    private static final Settings SETTINGS = new Settings();

    public static Settings getInstance() {
        return SETTINGS;
    }
}
