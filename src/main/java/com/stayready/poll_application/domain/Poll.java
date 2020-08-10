package com.stayready.poll_application.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@NotEmpty
@Size
@Valid
public class Poll {

    @Id
    @GeneratedValue
    @Column(name = "POLL_ID")
    Long id;

    @Column(name = "QUESTION")
    @NotEmpty
    String question;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "POLL_ID")
    @OrderBy
    @Size(min=2, max = 6)
    Set<Option> options;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }
}
