
package com.game.Springbootlearning.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Builder
@AttributeOverrides({@AttributeOverride(
        name="name",
        column = @Column(name="guradian_name")
),
        @AttributeOverride(
                name= "email",
               column= @Column(name="guradian_email")
        ),
        @AttributeOverride(
                name="ContactNumber",
                column = @Column(name="guradian_ContactNumber")
        )

})
public class Guardian {

    private String Name;
    private String Email;
    private String ContactNumber;
}

