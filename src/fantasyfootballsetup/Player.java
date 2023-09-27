/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fantasyfootballsetup;

/**
 *
 * @author joao
 */
public  abstract class Player {
    
        private String fname;
        private String lnamel;
        private String country;
        private int age;
        private String position;

    public Player(String fname, String lnamel, String country, int age, String position) {
        this.fname = fname;
        this.lnamel = lnamel;
        this.country = country;
        this.age = age;
        this.position = position;
    }
        

    public String getFname() {
        return fname;
    }

    public String getLnamel() {
        return lnamel;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLnamel(String lnamel) {
        this.lnamel = lnamel;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }
        





    
}
