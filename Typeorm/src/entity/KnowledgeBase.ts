import {Entity, PrimaryGeneratedColumn, Column, ManyToOne, JoinColumn} from "typeorm";
import { Users } from "./Users";

@Entity()
export class KnowledgeBase {

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

    @ManyToOne(type => Users)
    @JoinColumn({ name: 'user_id' })
    users: Users


}
