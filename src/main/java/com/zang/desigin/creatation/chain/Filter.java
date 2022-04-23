package com.zang.desigin.creatation.chain;

public interface Filter {
    void doFilter(Request request,Response response,FilterChain filterChain);
}
