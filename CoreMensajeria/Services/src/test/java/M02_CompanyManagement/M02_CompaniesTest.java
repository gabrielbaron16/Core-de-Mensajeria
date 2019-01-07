package M02_CompanyManagement;

import DTO.DTOFactory;
import DTO.M02_DTO.DTOFullCompany;
import DTO.M02_DTO.DTOIdStatusCompany;
import Entities.M02_Company.Company;
import Entities.M02_Company.CompanyDAO;
import Exceptions.CompanyDoesntExistsException;
import Exceptions.M07_Template.InvalidParameterException;
import com.google.gson.Gson;

import java.util.ArrayList;


import org.junit.jupiter.api.Test;
import webService.M02_CompanyManagement.M02_Companies;

import javax.ws.rs.core.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class M02_CompaniesTest {

    Gson gson = new Gson();
    private ArrayList<Company> _coList;
    private Company _co;
    private CompanyDAO _coMng = new CompanyDAO();



    @Test
    void  getAllCompaniesPPTest() {

        M02_Companies intance = new M02_Companies ();
        Response salida = intance.getAllCompaniesPP();
        assertEquals(200, salida.getStatus());
        assertNotNull( salida.getEntity());

    }

    @Test
    void getCompaniesByUserTest() {
        M02_Companies intance = new M02_Companies ();
        Response salida = intance.getCompaniesByUserPP (1) ;
        assertEquals(200, salida.getStatus());
        assertNotNull(salida);
    }



}
