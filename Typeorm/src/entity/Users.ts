import {Entity, PrimaryGeneratedColumn, Column} from "typeorm";

@Entity()
export class Users {

    @PrimaryGeneratedColumn()
    user_id: number;

    @Column()
    user_name: string;

    @Column()
    email_address: string;

    @Column()
    firstName: string;

    @Column()
    lastName: string;

    @Column()
    role: string;


}
