import {MigrationInterface, QueryRunner} from "typeorm";

export class updateTable1578037746205 implements MigrationInterface {
    name = 'updateTable1578037746205'

    public async up(queryRunner: QueryRunner): Promise<any> {
        await queryRunner.query(`CREATE TABLE "users" ("user_id" int NOT NULL IDENTITY(1,1), "user_name" nvarchar(255) NOT NULL, "email_address" nvarchar(255) NOT NULL, "firstName" nvarchar(255) NOT NULL, "lastName" nvarchar(255) NOT NULL, "role" nvarchar(255) NOT NULL, CONSTRAINT "PK_96aac72f1574b88752e9fb00089" PRIMARY KEY ("user_id"))`, undefined);
        await queryRunner.query(`CREATE TABLE "knowledge_base" ("article_id" int NOT NULL IDENTITY(1,1), "title" nvarchar(255) NOT NULL, "knowledge_base" nvarchar(255) NOT NULL, "state" nvarchar(255) NOT NULL, "product" nvarchar(255) NOT NULL, "created_date" nvarchar(255) NOT NULL, "modified_by" int NOT NULL, "modified_date" nvarchar(255) NOT NULL, "published_date" nvarchar(255) NOT NULL, "rating" int NOT NULL, "content" nvarchar(255) NOT NULL, "user_id" int, CONSTRAINT "PK_c5b373d858b6e8866dec56ae313" PRIMARY KEY ("article_id"))`, undefined);
        await queryRunner.query(`ALTER TABLE "knowledge_base" ADD CONSTRAINT "FK_1295a40fecb5796634d4e164827" FOREIGN KEY ("user_id") REFERENCES "users"("user_id") ON DELETE NO ACTION ON UPDATE NO ACTION`, undefined);
    }

    public async down(queryRunner: QueryRunner): Promise<any> {
        await queryRunner.query(`ALTER TABLE "knowledge_base" DROP CONSTRAINT "FK_1295a40fecb5796634d4e164827"`, undefined);
        await queryRunner.query(`DROP TABLE "knowledge_base"`, undefined);
        await queryRunner.query(`DROP TABLE "users"`, undefined);
    }

}
