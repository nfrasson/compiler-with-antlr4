package io.compiler.types;

public class Var {
    private String id;
    private Types type;
    private boolean isInitialized;
    private boolean isUsed;

    public Var(String id) {
        this.id = id;
        this.isInitialized = false;
        this.isUsed = false;
    }

    public String getId() {
        return id;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public boolean isInitialized() {
        return isInitialized;
    }

    public void setInitialized(boolean isInitialized) {
        this.isInitialized = isInitialized;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }
}
