package Service.imp.impl;

import model.Group;
import Service.imp.GroupAble;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupImpl implements GroupAble {

Scanner scanner =new Scanner(System.in);


    @Override
    public String addNewGroup(ArrayList<Group> groups) {
        for (Group g : groups) {
            System.out.println("Enter name group: ");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Enter date of start: (yyyy-mm-dd)");
            String date = new Scanner(System.in).nextLine();
            String[] d = date.split("-");
            groups.add(new Group(name, LocalDate.of(Integer.parseInt(d[0]), Integer.parseInt(d[1]), Integer.parseInt(d[2]))));

            return "group with name: " + name + " successfully saved";
        }
        return null;
    }



    @Override
    public void getGroupByName(java.util.ArrayList<Group> groups) {
        System.out.println("Input name ");
        String name= scanner.next();
        for (Group g:groups) {
            if(name.equals(g.getName())){
                System.out.print(g);
            }else {
                System.out.println("This is not founded");
            }
        }
    }

    @Override
    public void updateGroup(java.util.ArrayList<Group> groups) {

    }

    @Override
    public List<Group> getAllGroups(List<Group> groups) {
        return null;
    }
}


//1  -> Add new group
//        2  -> Get group by name
//        3  -> Update group name

//        4  -> Get all groups
//        5  -> Add new student to group
//        6  -> Update student
//        7  -> Find student by first name
//        8  -> Get all students by group name
//        9  -> Get all student's lesson
//        10 -> Delete student
//        11 -> Add new lesson to group
//        12 -> Get lesson by name
//        13 -> Get all lesson by group name
//        14 -> Delete lesson
//        15 -> Delete group