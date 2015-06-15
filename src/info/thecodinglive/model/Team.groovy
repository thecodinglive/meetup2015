package info.thecodinglive.model

import groovy.transform.Canonical

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Table(name="teams")
@Entity
@Canonical
class Team {
    @Id
    @GeneratedValue
    Integer id
    Integer rating
    String teamName
}


