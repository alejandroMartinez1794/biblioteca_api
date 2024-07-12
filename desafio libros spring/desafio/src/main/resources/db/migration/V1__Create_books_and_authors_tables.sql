CREATE TABLE IF NOT EXISTS autor (
                                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                     nombre VARCHAR(255) NOT NULL,
                                     fecha_de_nacimiento DATE NOT NULL
);
DELETE FROM flyway_schema_history WHERE version = '1';
