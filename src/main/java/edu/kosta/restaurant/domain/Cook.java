package edu.kosta.restaurant.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@Builder
@Data
@Entity
@EqualsAndHashCode
@NoArgsConstructor
@Table(name = "cook")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name", length = 45)
    private String firstName; // 이름

    // TODO: 2023-07-15
    // TODO nikim

    @Column(name = "last_name", length = 45)
    private String lastName; // 성
}