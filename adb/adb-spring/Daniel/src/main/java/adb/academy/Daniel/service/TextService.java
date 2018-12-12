package adb.academy.Daniel.service;

import adb.academy.Daniel.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
{
        "firstName" : "string",
        "secondName" : "string",
        "birthay" : 1544605646,
        "footSize": 41
        }
*/


@Service
public class TextService {

    private static List<String> firstNames;
    private static List<String> secondNames;
    private static List<Integer> birthdays;
    private static List<Integer> footSizes;

    static {
        firstNames = new ArrayList<>();
        secondNames = new ArrayList<>();
        birthdays = new ArrayList<>();
        footSizes = new ArrayList<>();

        firstNames.add("Jan");
        secondNames.add("Kowalski");
        birthdays.add(11091990);
        footSizes.add(44);
    }

    public String addFirstName(Person firstName) {
        final String first = firstName.getFirstName();
        firstNames.add(first);
        return first;
    }


    public String addSecondName(Person secondName) {
        final String second = secondName.getSecondName();
        secondNames.add(second);
        return second;
    }


    public int addBirthday(Person birthday) {
        final int birth = birthday.getBirthday();
        birthdays.add(birth);
        return birth;
    }


    public int addFootSize(Person footSize) {
        final int foot = footSize.getFootSize();
        footSizes.add(foot);
        return foot;
    }

    public ArrayList<ArrayList> getInfo() {
        ArrayList<ArrayList> tmp = new ArrayList<>();
        tmp.add((ArrayList) firstNames);
        tmp.add((ArrayList) secondNames);
        tmp.add((ArrayList) birthdays);
        tmp.add((ArrayList) footSizes);

        return tmp;
    }

}
