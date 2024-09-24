package clean.code.structural.decorator;


import java.util.stream.IntStream;

public class PrivateStringBuilder {
    private final StringBuilder sb = new StringBuilder();

    public int compareTo(PrivateStringBuilder another) {
        return sb.compareTo(another.sb);
    }

    public PrivateStringBuilder insert(int offset, float f) {
        sb.insert(offset, f);
        return this;
    }

    public int codePointBefore(int index) {
        return sb.codePointBefore(index);
    }

    public IntStream chars() {
        return sb.chars();
    }

    public PrivateStringBuilder appendCodePoint(int codePoint) {
        sb.appendCodePoint(codePoint);
        return this;

    }

    public PrivateStringBuilder insert(int offset, char[] str) {
        sb.insert(offset, str);
        return this;

    }

    public PrivateStringBuilder append(CharSequence s, int start, int end) {
        sb.append(s, start, end);
        return this;

    }

    public PrivateStringBuilder repeat(int codePoint, int count) {
        sb.repeat(codePoint, count);
        return this;

    }

    public CharSequence subSequence(int start, int end) {
        return sb.subSequence(start, end);

    }

    public char charAt(int index) {
        return sb.charAt(index);

    }

    public boolean isEmpty() {
        return sb.isEmpty();
    }

    public PrivateStringBuilder insert(int dstOffset, CharSequence s, int start, int end) {
        sb.insert(dstOffset, s, start, end);
        return this;

    }

    public int offsetByCodePoints(int index, int codePointOffset) {
        return sb.offsetByCodePoints(index, codePointOffset);
    }

    public PrivateStringBuilder deleteCharAt(int index) {
        sb.deleteCharAt(index);
        return this;

    }

    public PrivateStringBuilder append(char[] str, int offset, int len) {
        sb.append(str, offset, len);
        return this;

    }

    public void trimToSize() {
        sb.trimToSize();
    }

    public PrivateStringBuilder append(String str) {
        sb.append(str);
        return this;

    }

    public PrivateStringBuilder insert(int offset, boolean b) {
        sb.insert(offset, b);
        return this;

    }

    public void setCharAt(int index, char ch) {
        sb.setCharAt(index, ch);
    }

    public int indexOf(String str, int fromIndex) {
        return sb.indexOf(str, fromIndex);
    }

    public PrivateStringBuilder replace(int start, int end, String str) {
        sb.replace(start, end, str);
        return this;

    }

    public PrivateStringBuilder append(float f) {
        sb.append(f);
        return this;

    }

    public PrivateStringBuilder insert(int offset, int i) {
        sb.insert(offset, i);
        return this;

    }

    public void ensureCapacity(int minimumCapacity) {
        sb.ensureCapacity(minimumCapacity);
    }

    public PrivateStringBuilder insert(int offset, Object obj) {
        sb.insert(offset, obj);
        return this;

    }

    public PrivateStringBuilder append(StringBuffer sb) {
        this.sb.append(sb);
        return this;

    }

    public int lastIndexOf(String str, int fromIndex) {
        return sb.lastIndexOf(str, fromIndex);
    }

    public int codePointAt(int index) {
        return sb.codePointAt(index);
    }

    public int length() {
        return sb.length();
    }

    public PrivateStringBuilder repeat(CharSequence cs, int count) {
        sb.repeat(cs, count);
        return this;

    }

    public String substring(int start) {
        return sb.substring(start);
    }

    public IntStream codePoints() {
        return sb.codePoints();
    }

    public PrivateStringBuilder append(char[] str) {
        sb.append(str);
        return this;

    }

    public int codePointCount(int beginIndex, int endIndex) {
        return sb.codePointCount(beginIndex, endIndex);
    }

    public PrivateStringBuilder insert(int offset, long l) {
        sb.insert(offset, l);
        return this;

    }

    public PrivateStringBuilder append(double d) {
        sb.append(d);
        return this;

    }

    public PrivateStringBuilder insert(int offset, String str) {
        sb.insert(offset, str);
        return this;

    }

    public PrivateStringBuilder reverse() {
        sb.reverse();
        return this;

    }

    public String substring(int start, int end) {
        return sb.substring(start, end);
    }

    public void setLength(int newLength) {
        sb.setLength(newLength);
    }

    public PrivateStringBuilder append(boolean b) {
        sb.append(b);
        return this;

    }

    public PrivateStringBuilder insert(int dstOffset, CharSequence s) {
        sb.insert(dstOffset, s);
        return this;

    }

    public PrivateStringBuilder insert(int offset, double d) {
        sb.insert(offset, d);
        return this;

    }

    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        sb.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    public PrivateStringBuilder delete(int start, int end) {
        sb.delete(start, end);
        return this;

    }

    public PrivateStringBuilder append(int i) {
        sb.append(i);
        return this;

    }

    public PrivateStringBuilder insert(int index, char[] str, int offset, int len) {
        sb.insert(index, str, offset, len);
        return this;

    }

    public PrivateStringBuilder append(char c) {
        sb.append(c);
        return this;

    }

    public int indexOf(String str) {
        return sb.indexOf(str);
    }

    public PrivateStringBuilder append(Object obj) {
        sb.append(obj);
        return this;

    }

    public PrivateStringBuilder append(CharSequence s) {
        sb.append(s);
        return this;

    }

    public int capacity() {
        return sb.capacity();
    }

    public PrivateStringBuilder append(long lng) {
        sb.append(lng);
        return this;

    }

    public PrivateStringBuilder insert(int offset, char c) {
        sb.insert(offset, c);
        return this;

    }

    public int lastIndexOf(String str) {
        return sb.lastIndexOf(str);
    }
}
