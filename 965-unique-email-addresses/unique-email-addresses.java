class Solution {
    public int numUniqueEmails(String[] emails) {
         Set<String> hs = new HashSet<>();
        for (String email : emails) {
            StringBuilder local = new StringBuilder();
            String domain = "";
            boolean plusSeen = false;
            boolean domainPart = false;

            for (char c : email.toCharArray()) {
                if (domainPart) {
                    domain += c; // domain is short, fine to use +=
                } else if (c == '@') {
                    domainPart = true;
                } else if (c == '+') {
                    plusSeen = true;
                } else if (!plusSeen && c != '.') {
                    local.append(c);
                }
            }
            hs.add(local + "@" + domain);
        }
        return hs.size();
    }
}