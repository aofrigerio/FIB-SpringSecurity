INSERT INTO USER (ID,USERNAME, PASSWORD) VALUES (1,'admin','$2a$10$q3hdeK3.59jDwj8gWMpS8eBmjZrp0wUyZ9WyW31AqTBQexBbnjgvK');
INSERT INTO ROLE (ROLE, USER_ID) VALUES ('ROLE_ADMIN',1);
INSERT INTO ROLE (ROLE, USER_ID) VALUES ('ROLE_BASIC',1);