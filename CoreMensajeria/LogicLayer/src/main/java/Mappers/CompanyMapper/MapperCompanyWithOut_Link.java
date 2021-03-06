package Mappers.CompanyMapper;

import DTO.M02_DTO.DTOCompanyWithOut_Link;

import Entities.Entity;
import Entities.EntityFactory;
import Entities.M02_Company.Company;
import DTO.DTOFactory;
import Mappers.GenericMapper;

import java.util.ArrayList;
import java.util.List;

public class MapperCompanyWithOut_Link extends GenericMapper<DTOCompanyWithOut_Link> {

    /**
     * Metodo con el cual se transforma una entidad en un DTOCompanyWithOut_Link
     * @param entity Entidad que recibe para hacer el mapeo
     * @return un objeto del tipo DTOCompanyWithOut_Link
     */
    @Override
    public DTOCompanyWithOut_Link CreateDto(Entity entity) {
        try {
            DTOCompanyWithOut_Link dto = null;
            Company _com = (Company) entity;
            dto = DTOFactory.CreateDtoCompanyWithOut_Link(_com.get_idCompany(), _com.get_name(), _com.get_desc(),
                                                          _com.get_status() );
            return dto;
        }
        catch (Exception e) {

            throw e;
        }
    }


    /**
     * Metodo con el cual se transforma de una lista de entidades a una lista de dto
     * @param entities Entidad que recibe para hacer el mapeo
     * @return una lista de objetos del tipo DTOCompanyWithOut_Link
     */
    @Override
    public List<DTOCompanyWithOut_Link> CreateDtoList(List<Entity> entities) {
        try
        {
            ArrayList<DTOCompanyWithOut_Link> dtos = new ArrayList<>();

            for (Entity _com : entities) {
                dtos.add( CreateDto( _com ) );
            }

            return dtos;

        }
        catch (Exception e)
        {
            throw e;
        }
    }


    /**
     * Metodo con el cual se transforma de una lista de dtos a una lista de entidades
     * @param dtos Entidad que recibe para hacer el mapeo
     * @return una lista de Entidades del tipo Company
     */
    @Override
    public List<Entity> CreateEntityList(List<DTOCompanyWithOut_Link> dtos) {
        try
        {
            ArrayList<Entity> Company = new ArrayList<>();

            for (DTOCompanyWithOut_Link _dtocom : dtos) {
                Company.add ( CreateEntity ( _dtocom ) );
            }

            return Company ;

        }
        catch (Exception e)
        {
            throw e;
        }
    }


    /**
     * Metodo con el cual se transforma un DTOCompanyWithOut_Link a una Entidad Company
     * @param dto Entidad que recibe para hacer el mapeo
     * @return una lista de Entidades del tipo Company
     */
    @Override
    public Entity CreateEntity(DTOCompanyWithOut_Link dto) {

        try {
            Company _com = EntityFactory.CreateCompanyWithOutLink(dto.get_idCompany(), dto.get_name(),
                                                                   dto.get_desc(),  dto.get_status() );
            return _com ;

        }
        catch (Exception e){
            throw e;
        }
    }
}
