create table tasks
(
    id              bigint auto_increment
        primary key,
    title           varchar(255)          not null,
    complete_status boolean default false null,
    due_date        datetime              null,
    user_id         bigint                not null,
    constraint tasks_users_id_fk
        foreign key (user_id) references users (id)
);
