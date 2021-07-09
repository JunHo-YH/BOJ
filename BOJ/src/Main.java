class Main {
    public String solution(String phone_number) {
        String answer = "";
        answer =  phone_number.substring(0,phone_number.length()-4).replaceAll("[0-9]", "*");
        String str = phone_number.substring(phone_number.length()-4);
        return answer + str;
    }
}