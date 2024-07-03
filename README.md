# Authz protocol token mapper

This is Authz token mapper for Keycloak using the OIDC protocol.

The mapper is built as jar files and then loaded in the keycloak.

![image](https://github.com/avinashrajhpe/authz-tokenmapper/assets/126825279/d13f6dc5-8932-4fc5-82a7-c39e1ef417f1)

Then the mapper connects with the authz to get the permissions and updates the claims before passing it to the user.
