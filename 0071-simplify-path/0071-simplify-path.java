class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String[] components = path.split("/"); 

        for(String component : components){
            if(component.isEmpty() || component.equals(".")){
                continue;
            } else if(component.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            } else {
                s.push(component);
            }
        }

        StringBuilder res = new StringBuilder();
        for(String dir : s){
            res.append("/").append(dir);
        } 

        return res.length() > 0 ? res.toString() : "/";
    }

}