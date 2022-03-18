package nl.novi.javaprogrammeren.three;

public class Phone {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInternationalPhoneNumber() {
        String phoneNumber = "+31" + getPhoneNumber();

        return phoneNumber;
    }
}

//    Phone.java geeft nu het telefoonnummer terug via de getter-methode. Voor internationale bellers is een extra methode aangemaakt (getInternationalPhoneNumber()). Deze geeft nu alleen +31 terug. Beantwoord voor jezelf de vraag waarom dit zo is. We roepen toch phoneNumber aan? Hoe heet dit in de cursus op EdHub?
//
//        Pas vervolgens de code aan, zodat het telefoonnnummer met +31 ervoor wordt teruggegeven.