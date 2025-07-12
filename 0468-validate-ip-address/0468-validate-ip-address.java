class Solution {
    public String validIPAddress(String s) {
        if(isIpv4(s)){
            return "IPv4";
        }
        else if(isIpv6(s)){
            return "IPv6";
        }
        return "Neither";
    }
    boolean isIpv4(String s){
        String[] s1=s.split("\\.",-1);
        if(s1.length!=4){
            return false;
        }
        for(String i: s1){
            if(i.length()==0 || ((i.length()>1) && i.startsWith("0"))){
                return false;
            }
            try{
                int num=Integer.parseInt(i);
                if(num<0 || num>255){
                    return false;
                }
            }
            catch (NumberFormatException e){
                return false;
            }
        }
        return true;
    }
    boolean isIpv6(String s){
        if(s.length()==0){
            return false;
        }
        String[] s1=s.split(":",-1);
        if(s1.length!=8){
            return false;
        }
        for(String i: s1){
            if(i.length()<1 || i.length()>4){
                return false;
            }
            for(char c: i.toCharArray()){
                if(!isHex(c)){
                    return false;
                }
            }
        }
        return true;
    }
    boolean isHex(char c){
        return (c>='0' && c<='9') || (c>='a' && c<='f') || (c>='A' && c<='F');
    }
}