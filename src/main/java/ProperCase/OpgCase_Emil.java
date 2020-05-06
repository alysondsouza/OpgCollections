package ProperCase;
//@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)

public class OpgCase_Emil {
    public static void main(String[] args) {


        System.out.println("\"capitan NEmO eR ULTRA POP\"");
        System.out.println(ensureCasing("capitan NEmO eR ULTRA POP"));
        System.out.println();

        System.out.println("HEJ med DiG SMuKKE fiskemand");
        System.out.println(ensureCasing("HEJ med DiG SMuKKE fiskemand"));
        System.out.println("\nExpected Exception: IllegalArgument.");
        System.out.println(ensureCasing(""));

    }

    public static String ensureCasing (String str){
        StringBuilder casedStr = new StringBuilder();
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Strengen må ikke være null eller tom!");
        }

        String[] words = str.split("\\W+");

        for (String w : words) {
            if (w.equals(w.toUpperCase())) {
                casedStr.append(w);
            } else {
                String st = w.toLowerCase();
                char[] chars = st.toCharArray();
                if (st.length() > 3) {
                    chars[0] = Character.toUpperCase(chars[0]);
                    casedStr.append(String.copyValueOf(chars));
                } else if (w.length() >= 3) {
                    casedStr.append(w.toLowerCase());
                }
            }
            casedStr.append(" ");
        }
        return casedStr.toString().trim();
    }
}