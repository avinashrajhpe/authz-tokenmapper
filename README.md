# Authz protocol token mapper

This is Authz token mapper for Keycloak using the OIDC protocol.

The mapper is built as jar files and then loaded in the keycloak.

![image](https://github.com/avinashrajhpe/authz-tokenmapper/assets/126825279/d13f6dc5-8932-4fc5-82a7-c39e1ef417f1)

Then the mapper connects with the authz to get the permissions and updates the claims before passing it to the user.

The Mock Authz Mountebank configured with the permissions as a test DSCC API being accessed but later to use (getUserAccessibleResources).

![image](https://github.com/avinashrajhpe/authz-tokenmapper/assets/126825279/68c9eb7a-d56e-45dc-819c-1dce8d0adb3f)

The snapshot of the token with the claims,

![image](https://github.com/avinashrajhpe/authz-tokenmapper/assets/126825279/01d18bf2-e355-40d8-9939-c91a682f2da3)
