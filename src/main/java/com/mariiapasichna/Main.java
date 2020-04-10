package com.mariiapasichna;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        int count = userDao.clear();
        System.out.println("Deleted items count: " + count);

        userDao.addUser(new User("Ben", 22));
        userDao.addUser(new User("Bill", 33));
        userDao.addUser(new User("Carl", 34));
        userDao.addUser(new User("Roy", 21));
        userDao.addUser(new User("Anna", 19));
        userDao.addUser(new User("Alex", 18));
        userDao.addUser(new User("John", 36));
        System.out.println("Users: " + userDao.getAllUsers());

        System.out.println(userDao.getUser(129));

        User user = userDao.getUser(129);
        user.setAge(55);
        userDao.updateUser(user);
        System.out.println(userDao.getUser(129));
        System.out.println("Users: " + userDao.getAllUsers());

        userDao.removeUserByName("Anna");
        System.out.println("Users: " + userDao.getAllUsers());

        userDao.removeUser(130);
        System.out.println("Users: " + userDao.getAllUsers());

        userDao.removeAll();
        System.out.println("Users: " + userDao.getAllUsers());

        userDao.close();
    }
}