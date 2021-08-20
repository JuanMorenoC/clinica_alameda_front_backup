package com.clinicaAlameda.clinicaBack.entidades;

import javax.persistence.*;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name="tablaemail")
public class EmailModel implements Serializable{
	
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
    
    @ManyToOne
    @JoinColumn(name = "secretaria", nullable = true)
    private Persona secretaria;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
