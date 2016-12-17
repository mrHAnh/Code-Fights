// a phone call function that takes param. and returns how many minutes you have remaining

int phoneCall(int min1, int min2_10, int min11, int s) {
    int p1 = 0, p2 = 0, p3 = 0;
    
    if (s >= min1) {
        s -= min1;
        
        p1++;
        
    } else {
        return 0;
    }
    
    while (s >= min2_10 && p2 < 9) {
        s -= min2_10;
        
        p2++;
    }
    
    while (s >= min11 && p2 == 9) {
        s -= min11;
        
        p3++;
    }
    
    return p1 + p2 + p3;
}
