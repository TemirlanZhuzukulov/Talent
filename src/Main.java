import model.Group;
import Service.imp.impl.GroupImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GroupImpl group = new GroupImpl();

        ArrayList<Group> groups = new ArrayList<>();

        boolean isTrue = true;
        while (isTrue) {
            System.out.println("""
                    1 New group
                    2 Get all group
                    """);
            int i = new Scanner(System.in).nextInt();
            switch (i) {
                case 1 -> {
                    System.out.println(group.addNewGroup(groups));

                }
                case 2 -> {
                    System.out.println(group.getAllGroups(groups));

                }
                case 3->{
                    group.updateGroup(groups);
                }
                case 0 ->isTrue = false;

            }


//            group.getGroupByName(groups);

        }
    }
}