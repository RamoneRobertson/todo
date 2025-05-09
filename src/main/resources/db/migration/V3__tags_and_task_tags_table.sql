create table tags
(
    id   bigint auto_increment
        primary key,
    name varchar(255) not null
);

create table task_tags
(
    task_id bigint not null,
    tag_id  bigint not null,
    constraint task_tags_tags_id_fk
        foreign key (tag_id) references tags (id),
    constraint task_tags_tasks_id_fk
        foreign key (task_id) references tasks (id)
);