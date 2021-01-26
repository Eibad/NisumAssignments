USE studentmanagement;

-- create table student(
-- stdId int PRIMARY KEY AUTO_INCREMENT NOT NULL,
-- stdRollNumber varchar(255) NOT NULL UNIQUE,
-- stdName varchar(255) NOT NULL,
-- stdClass varchar(255) NOT NULL
-- )


-- INSERT INTO student (stdRollNumber,stdName,stdClass)
-- VALUES ("00002","Rahim","I");

update student set stdRollNumber ='00002',
stdName='Rahim update',stdClass='II' 
WHERE stdId = 3