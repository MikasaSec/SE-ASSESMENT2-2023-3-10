public class Login {
    public boolean validate (String ID, String password){
        Boolean IDExists = false;
        Boolean successLogin = false;

        for (int i = 0; i < UserAction.userData.size(); i++) {
            String[] content = UserAction.userData.get(i).split(" ");
            if(content[0].equals(ID)){
                IDExists = true;
                if(content[1].equals(password)){
                    successLogin = true;
                } else {
                    System.out.println("Sorry, your ID or password is incorrect!");
                }
            }

        }
        if(!IDExists){
            System.out.println("Sorry, the input ID doesn't exist!");
        }

        return successLogin;
    }
}
