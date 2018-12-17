package com.chujian.sdk.framework.parameter;

public class PersonalCenterParams implements Params {

    private static PersonalCenterParams personalCenterParams;


    private PersonalCenterParams(){

    }


    public static PersonalCenterParams getInstance() {
       if(personalCenterParams==null){
           synchronized (PersonalCenterParams.class){
               personalCenterParams=new PersonalCenterParams();
           }
       }

        return personalCenterParams;
    }
    public static class Builder {
        private static Builder builder;
        private static PersonalCenterParams personalCenterParams;

        private Builder(){
            personalCenterParams=getInstance();
        }


        public static Builder bulider() {

            if (builder == null) {
                synchronized (Builder.class) {
                    builder = new Builder();
                }
            }
            return builder;
        }

        public PersonalCenterParams build() {
            return personalCenterParams;
        }


    }

}
