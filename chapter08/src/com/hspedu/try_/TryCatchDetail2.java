package com.hspedu.try_;

public class TryCatchDetail2 {
    public static void main(String[] args) {
        Person person = new Person();
        person = null;
        System.out.println(person.getName());
        try {
            int n1 = 10;
            int n2 = 0;
            int res = n1/n2;

        } catch (NullPointerException e ) {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        catch (Exception e) {
            throw new RuntimeException(e);
        }finally {

        }

    }
}

class  Person {
    private String name;
    public  String getName() {
        return  name;
    }

}
