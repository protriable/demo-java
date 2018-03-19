package com.protry.pattern.observer.weather;

/**
 * @author bshao
 * 主题
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
