package com.gitlab.thamvannguyen.dockertutorial.domain;

import com.gitlab.thamvannguyen.dockertutorial.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "users")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User
        implements Serializable {

    private static final long serialVersionUID = -7565260311695255065L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_slug", length = 25)
    private String userSlug;

    @Column(length = 50)
    private String nickname;

    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String avatar;

    @Builder.Default
    private boolean activated = false;
}
