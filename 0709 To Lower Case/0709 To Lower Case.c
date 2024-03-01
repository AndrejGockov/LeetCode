char* toLowerCase(char* s) {
    for(int i = 0; i < strlen(s); i++){
        if((int)s[i] < (int)'a'){
            s[i] = tolower(s[i]);
        }
    }
    return s;
}