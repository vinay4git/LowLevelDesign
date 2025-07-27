### ROLE BASED RESOURCE ACCESS
```text
1. There are some resources which can have multiple permission levels.
2. There are some user groups. Each user group has some set of access levels.
3. And there is heirarchy in the user group. Group which are higher in the hierarchy by default have all the access levels of the lower group.
4. Build a system if any user tries to access some resource with by some permission. Our system should validate the access and fulfill it or deny that.
```
