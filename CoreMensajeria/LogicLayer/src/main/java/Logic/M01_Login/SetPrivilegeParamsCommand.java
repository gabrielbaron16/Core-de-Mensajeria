package Logic.M01_Login;

import Entities.Entity;
import Entities.M01_Login.Privilege;
import Entities.M01_Login.PrivilegeDao;
import Logic.Command;
import Persistence.M01_Login.DAOPrivilege;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SetPrivilegeParamsCommand extends Command {
    private static ResultSet _result;
    private static Privilege _privilege;
    private static Entity _us;

    public SetPrivilegeParamsCommand(ResultSet result, Privilege privilege){
        this._result = result;
        this._privilege = privilege;
    }
    @Override
    public void execute() throws SQLException {
        try{
            DAOPrivilege dao = new DAOPrivilege();
            dao.setPrivilegeParams(_result,_privilege);
        }
        catch (Exception e){

        }
    }
    @Override
    public Entity Return() { return _us;}
}


