
function User(firstName, lastName, username, password, email, id){
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
    this.email = email;
    this.id = id;

    //ADD QUIZ LIST?
}
//Getters & Setters
function getFirstName(){
    return this.firstName;
}
function setFirstName(firstName){
    this.firstName = firstName;
}
function getLastName(){
    return this.lastName;
}
function setLastName(lastName){
    this.lastName = lastName;
}
function getUsername(){
    return this.username;
}
function setUsername(username){
    this.username = username;
}
function getPassword(){
    return this.password = password;
}
function setPassword(password){
    this.password = password;
}
function getEmail(){
    return this.email;
}
function setEmail(email){
    this.email = email;
}
function getID(){
    return this.id;
}
function setID(id){
    this.id = id;
}
//Methods
function getFullName(){
    return this.firstName+" "+this.lastName;
}
