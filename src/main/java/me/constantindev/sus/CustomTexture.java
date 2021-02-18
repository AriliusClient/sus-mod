package me.constantindev.sus;

public class CustomTexture {
    public String replaces;
    public String replacement;

    public CustomTexture(String replaces, String replacement) {
        this.replacement = replacement;
        this.replaces = replaces;
    }

    public CustomTexture(String replaces) {
        this.replaces = replaces;
        this.replacement = "amogusCharacter.png";
    }
}
