package com.globant.bootcamp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserService userService = new UserService();
        userService.createUser("us00");
        userService.createUser("us01");
        userService.readUsers();
        userService.deleteUser("us00");
        userService.readUsers();
    }
}
