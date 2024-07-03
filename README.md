# Authz protocol token mapper

This is Authz token mapper for Keycloak using the OIDC protocol.

The mapper is built as jar files and then loaded in the keycloak.

Then the mapper connects with the authz to get the permissions and updates the claims before passing it to the user.
