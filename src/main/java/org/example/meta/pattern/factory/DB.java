package org.example.meta.pattern.factory;

public interface DB {
    public int execute(String sql);

    public void setUrl(String url);

}
