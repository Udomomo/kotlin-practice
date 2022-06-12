USE taskapp;
DROP TABLE IF EXISTS task;
CREATE TABLE task(
    id MEDIUMINT UNSIGNED NOT NULL AUTO_INCREMENT,
    contents VARCHAR(30) NOT NULL,
    is_done TINYINT(1) NOT NULL,
    PRIMARY KEY (id)
);