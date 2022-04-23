package com.zang.desigin.creatation.chain;

/**
 * @author 臧臧 on 2022/4/23
 */
public class MainTest {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        EncodingFilter encodingFilter = new EncodingFilter();
        CharacterFilter characterFilter = new CharacterFilter();
        HttpFilter httpFilter = new HttpFilter();
        filterChain.addFilter(encodingFilter);
        filterChain.addFilter(characterFilter);
        filterChain.addFilter(httpFilter);
    }
}