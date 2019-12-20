import {Entity, PrimaryGeneratedColumn, Column, ManyToOne, JoinColumn} from "typeorm";
import { User } from "./User";

@Entity()
export class Knowledge_Base {

    @PrimaryGeneratedColumn()
    article_id: number;

    @Column()
    title: string;

    @Column()
    knowledge_base: string;

    @Column()
    state: string;

    @Column()
    product: string;

    @Column()
    created_date: string;

    @Column()
    modified_by: number;

    @Column()
    modified_date: string;

    @Column()
    published_date: string;

    @Column()
    rating: number;

    @Column()
    content: string;

    @ManyToOne(type => User)
    @JoinColumn({ name: 'user_id' })
    user: User


}
