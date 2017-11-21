CREATE TABLE Chapters (
	chapter_ID int NOT NULL,
	number_questions int,
	PRIMARY KEY (chapter_ID)
);

CREATE TABLE Questions (
	question_ID int NOT NULL AUTO_INCREMENT,
	question_text varchar(512),
	number_choices int,
	chapter_ID int,
	PRIMARY KEY (question_ID)
);

CREATE TABLE Answers (
	answer_ID int NOT NULL AUTO_INCREMENT,
	answer_text varchar(512),
	fixed_slot int,
	is_correct int,
	question_ID int,
	PRIMARY KEY (answer_ID)
);
CREATE TABLE Quizzes (
	quiz_ID int NOT NULL AUTO_INCREMENT,
	quiz_param varchar(255),
	questions MEDIUMBLOB,
	PRIMARY KEY (quiz_ID)
);

alter table questions add times_taken int; 
alter table questions add times_captured int;
alter table answers modify is_correct int(1); 