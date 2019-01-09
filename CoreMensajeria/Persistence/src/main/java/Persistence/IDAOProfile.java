package Persistence;

import Entities.M01_Login.Privilege;

import java.util.ArrayList;

public interface IDAOProfile extends IDAO {
    public ArrayList<Privilege> getPrivilegesByUserAndCompany(int user, int company);
    public String editProfile(int userId, String name, String lastname, int ci, int geographicalRegion, String address,
                              String birthdate, String gender, String email, String phone);
}