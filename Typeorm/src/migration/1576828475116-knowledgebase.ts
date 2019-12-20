import {MigrationInterface, QueryRunner} from "typeorm";

export class knowledgebase1576828475116 implements MigrationInterface {
    name = 'knowledgebase1576828475116'

    public async up(queryRunner: QueryRunner): Promise<any> {
        await queryRunner.query(`CREATE TABLE "user" ("id" int NOT NULL IDENTITY(1,1), "user_name" nvarchar(255) NOT NULL, "email_address" nvarchar(255) NOT NULL, "firstName" nvarchar(255) NOT NULL, "lastName" nvarchar(255) NOT NULL, "role" nvarchar(255) NOT NULL, CONSTRAINT "PK_cace4a159ff9f2512dd42373760" PRIMARY KEY ("id"))`, undefined);
        await queryRunner.query(`CREATE TABLE "knowledge__base" ("article_id" int NOT NULL IDENTITY(1,1), "title" nvarchar(255) NOT NULL, "knowledge_base" nvarchar(255) NOT NULL, "state" nvarchar(255) NOT NULL, "product" nvarchar(255) NOT NULL, "created_date" nvarchar(255) NOT NULL, "modified_by" int NOT NULL, "modified_date" nvarchar(255) NOT NULL, "published_date" nvarchar(255) NOT NULL, "rating" int NOT NULL, "content" nvarchar(255) NOT NULL, "user_id" int, CONSTRAINT "PK_64730ab7e32387fcd613de02a8e" PRIMARY KEY ("article_id"))`, undefined);
        await queryRunner.query(`ALTER TABLE "knowledge__base" ADD CONSTRAINT "FK_94ae55616df33d74c0093d9edd7" FOREIGN KEY ("user_id") REFERENCES "user"("id") ON DELETE NO ACTION ON UPDATE NO ACTION`, undefined);
    }

    public async down(queryRunner: QueryRunner): Promise<any> {
        await queryRunner.query(`ALTER TABLE "knowledge__base" DROP CONSTRAINT "FK_94ae55616df33d74c0093d9edd7"`, undefined);
        await queryRunner.query(`DROP TABLE "knowledge__base"`, undefined);
        await queryRunner.query(`DROP TABLE "user"`, undefined);
    }

}
