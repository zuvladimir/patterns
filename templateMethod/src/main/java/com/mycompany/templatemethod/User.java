package com.mycompany.templatemethod;

/**
 * Обьект User содержит данные пользователя.
 *
 * @author Vladimir
 */
public class User implements Comparable<User> {

    private String login;

    public User(String login) {
        this.login = login;
    }
    
    /**
     * Сортировать будем по первой букве в логине
     *
     * @param user
     * @return
     */
    @Override
    public int compareTo(User user) {
        return getLogin().substring(0, 1).compareTo(user.getLogin().substring(0, 1));
    }

    public String getLogin() {
        return login;
    }
}
