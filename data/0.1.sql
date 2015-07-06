DROP TABLE IF EXISTS `user_type`;

CREATE TABLE IF NOT EXISTS `user_type` (
`user_type_id` int(11) NOT NULL auto_increment,
`user_type_name` varchar(20) NOT NULL,
`sort` int(5) default 0,
PRIMARY KEY (`user_type_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;


INSERT into user_type (user_type_name) VALUES ('General');
INSERT into user_type (user_type_name) VALUES ('Forwarder');


DROP TABLE IF EXISTS `user`;

CREATE TABLE IF NOT EXISTS `user` (
`user_id` int(11) NOT NULL auto_increment,
`nickname` varchar(50),
`cellphone` varchar(50) NOT NULL,
`hash` varchar(300) NOT NULL, 
`user_type_id` int(11) NOT NULL,
`company_id` int(11) default 0,
`date_add` datetime NOT NULL,
PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;


DROP TABLE IF EXISTS `company`;

CREATE TABLE IF NOT EXISTS `company` (
`company_id` int(11) NOT NULL auto_increment,
`company_name` varchar(300) NOT NULL,
`phone` varchar(50) ,
`zipcode` varchar(30), 
`address` varchar(200),
`cellphone` varchar(50),
`QQ` varchar(20),
`email` varchar(50),
`description` text,
`latitude` varchar(20),
`longitude` varchar(20),
`date_add` datetime NOT NULL,
PRIMARY KEY (`company_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;


DROP TABLE IF EXISTS `ticket`;

CREATE TABLE IF NOT EXISTS `ticket` (
`ticket_id` int(11) NOT NULL auto_increment,
`topic` varchar(200) NOT NULL,
`content` text NOT NULL,
`user_id` int(11) NOT NULL,
`ticket_date` datetime NOT NULL,
PRIMARY KEY (`ticket_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;


DROP TABLE IF EXISTS `comment`;

CREATE TABLE IF NOT EXISTS `comment` (
`comment_id` int(11) NOT NULL auto_increment,
`content` text NOT NULL,
`user_id` int(11) NOT NULL,
`comment_date` datetime NOT NULL,
PRIMARY KEY (`comment_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
