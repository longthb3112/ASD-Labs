package lab6.asd;

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.Objects;

public class CustomImage {
    int imageId;

    public CustomImage(int imageId) {
        this.imageId = imageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomImage that = (CustomImage) o;
        return imageId == that.imageId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId);
    }
}
