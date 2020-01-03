import "reflect-metadata";
import {createConnection} from "typeorm";
import {User} from "./entity/User";

createConnection().then(async connection => {

    console.log("Inserting a new user into the database...");
    const user = new User();
    user.user_name = "Timber_Saw";
    user.email_address = "Timber_Saw@gmail.com";
    user.firstName = "Timber";
    user.lastName = "Saw";
    user.role= "KB Admin";
    await connection.manager.save(user);
    console.log("Saved a new user with id: " + user.user_id);

    console.log("Loading users from the database...");
    const users = await connection.manager.find(User);
    console.log("Loaded users: ", users);

    console.log("Here you can setup and run express/koa/any other framework.");

}).catch(error => console.log(error));
