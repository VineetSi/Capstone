package com.niit.ArchiveTasks.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class 
Task {
    private int taskId;
    private String taskTitle;
    private String taskStatus;
    private String taskDescription;

    @Enumerated(EnumType.STRING)
    private BasedOnPriority taskPriority;

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'hh:mm")
    private Date taskDeadline;
}

