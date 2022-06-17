package net.cqwu.charity_commons.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * (PersonalData)实体类
 *
 * @author makejava
 * @since 2022-06-09 11:11:42
 */
@Data
public class EndPersonalDataUntil extends PersonalData {
  private String name;
  private String password;
  private Integer uid;
  private PersonalData personalData;
}