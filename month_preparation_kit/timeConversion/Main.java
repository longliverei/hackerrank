class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String hour = s.substring(0, 2);
        String minutes = s.substring(3, 5);
        String seconds = s.substring(6, 8);
        String amOrPm = s.substring(8, 10);
        Integer convertedHour = Integer.valueOf(hour);

        if (amOrPm.contains("PM") && convertedHour < 12) {
            convertedHour += 12;
            convertedHour.toString();
        } else if (amOrPm.contains("AM") && convertedHour.equals(12)) {
            convertedHour -= 12;
            convertedHour.toString();

            return convertedHour + "0" + ":" + minutes + ":" + seconds;
        } else if (amOrPm.contains("AM") && convertedHour < 10) {
            convertedHour.toString();

            return "0" + convertedHour + ":" + minutes + ":" + seconds;
        }

        return convertedHour + ":" + minutes + ":" + seconds;
    }

}