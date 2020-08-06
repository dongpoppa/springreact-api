package com.vn.springreact.dto;


import com.vn.springreact.entity.Game;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
public class CategoryDto {

    private int id;

    private String name;

    private String decription;

    private Set<GameInfo> games;

}
