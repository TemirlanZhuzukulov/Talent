package Service.imp;

import model.Group;

import java.util.ArrayList;
import java.util.List;

public interface GroupAble {

    String addNewGroup(ArrayList<Group>groups);
    void getGroupByName(ArrayList<Group>groups);
    void updateGroup(ArrayList<Group>groups);
    List<Group> getAllGroups(List<Group>groups);
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