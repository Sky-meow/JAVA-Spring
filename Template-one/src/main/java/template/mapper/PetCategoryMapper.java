package template.mapper;

import java.util.List;

import org.springframework.stereotype.Service;
import template.entity.PetCategory;


@Service
public interface PetCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PetCategory record);

    PetCategory selectByPrimaryKey(Integer id);

    List<PetCategory> selectAll();

    int updateByPrimaryKey(PetCategory record);
}