 if(strs.length <=0) return "";
        if(strs.length == 1) return strs[0];
        String result = "";
        String prev = strs[0];
        for(int i=1;i<strs.length;i++){
            String tempResult = "";
            for(int j=0;j<strs[i].length();j++){
                char c = strs[i].charAt(j);
                if(j < prev.length() && c == prev.charAt(j)){
                    tempResult += prev.charAt(j);
                }else{
                    break;
                }
            }
            if(tempResult.length() < result.length() || i == 1){
                result = tempResult;
            }
            prev = strs[i];
        }
        return result;
    }
