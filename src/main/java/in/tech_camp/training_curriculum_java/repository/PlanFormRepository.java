package in.tech_camp.training_curriculum_java.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import in.tech_camp.training_curriculum_java.entity.PlanEntity;

@Mapper
public interface  PlanFormRepository {
  @Select("SELECT * FROM plans")
  List<PlanEntity> findAll();

  @Insert("INSERT INTO plans (date, plan) VALUES (#{date}, #{plan}")
  void insert(PlanEntity plan);
}
