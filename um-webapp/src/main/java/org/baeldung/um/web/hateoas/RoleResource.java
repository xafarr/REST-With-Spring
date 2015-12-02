package org.baeldung.um.web.hateoas;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import org.baeldung.um.persistence.model.Role;
import org.springframework.hateoas.ResourceSupport;

public class RoleResource extends ResourceSupport {

    private final Role role;

    public RoleResource(final Role role) {
        this.role = role;

        this.add(linkTo(RoleHateoasController.class).withRel("roles"));
        // this.add(linkTo(methodOn(BookmarkRestController.class, username).readBookmark(username, bookmark.getId())).withSelfRel());
    }

    public Role getRole() {
        return role;
    }

}
