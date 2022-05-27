# A Tutorial on Using MyBatis

## Set up a PostgresSQL Container

Initialize a container with `postgres` image.

```bash
docker run --name dockerPostgresSQL -e POSTGRES_PASSWORD=t83k2D -p 5432:5432 -d postgres
```

Add a few records to the database.

```postgresql
CREATE TABLE "User"
(
    id       INT PRIMARY KEY,
    name     VARCHAR NOT NULL,
    password VARCHAR NOT NULL
);

INSERT INTO "User"
VALUES (1, 'zsh', 'cs2322'),
       (2, 'csh', '3451so'),
       (3, 'bsh', '0i9h3d');
```

## Run the Test

Open the project in IntelliJ IDEA, and run the `UserMapperTeset.java`.

You can also run the test in the shell but more tedious.

```plain
.
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── mapper
│   │   │   │   ├── UserMapper.java
│   │   │   │   └── UserMapping.xml
│   │   │   ├── pojo
│   │   │   │   └── User.java
│   │   │   └── utils
│   │   │       └── MyBatisUtil.java
│   │   └── resources
│   │       └── mybatis-config.xml
│   └── test
│       └── java
│           └── mapper
│               └── UserMapperTest.java
└── target
```