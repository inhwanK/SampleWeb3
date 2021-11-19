select * from guestbook;

drop table sample;

create table sample(id int(12) auto_increment primary key,
					title varchar(200),
					reg_user varchar(20),
					content varchar(200),
					reg_date date default now()
					);
					
desc sample;
insert into sample value(1, 'Java Programming', '관리자', '자바 관련 글만 등록하세요.', now());
select * from sample;

insert into sample(id,title,reg_user,content, reg_date) values((select coalesce(max(id),0)+1),1,1,1, now());


-- (select ifnull()(max(id),0)+1)