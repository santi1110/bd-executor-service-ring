package com.amazon.ata.executorservice.classroom.coralgenerated.devicecommunication;

import com.amazon.coral.annotation.HttpLabel;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.coral.annotation.*;
import java.util.Arrays;
import java.util.Objects;

@Shape
  @XmlName(value="GetDeviceSystemInfoRequest")
  @XmlNamespace(value="http://internal.amazon.com/coral/com.amazon.ata.executorservice.classroom.devicecommunication/")
  @Wrapper(value={com.amazon.coral.annotation.WrapperType.INPUT,com.amazon.coral.annotation.WrapperType.OUTPUT})
@com.amazon.coral.annotation.Generated
@com.amazon.coral.annotation.CoralSuppressWarnings
public class GetDeviceSystemInfoRequest extends Object  {

  /**
   * Statically creates a builder instance for GetDeviceSystemInfoRequest.
   */
  public static Builder builder() {
    return new Builder();
  }

  /**
   * Fluent builder for instances of GetDeviceSystemInfoRequest.
   */
  @com.amazon.coral.annotation.Generated
  public static class Builder {

    protected String deviceId;
    /**
     * Sets the value of the field "deviceId" to be used for the constructed object.
     * @param deviceId
     *   The value of the "deviceId" field.
     * @return
     *   This builder.
     */
    public Builder withDeviceId(String deviceId) {
      this.deviceId = deviceId;
      return this;
    }

    /**
     * Sets the fields of the given instances to the corresponding values recorded when calling the "with*" methods.
     * @param instance
     *   The instance to be populated.
     */
    protected void populate(GetDeviceSystemInfoRequest instance) {
      instance.setDeviceId(this.deviceId);
    }

    /**
     * Builds an instance of GetDeviceSystemInfoRequest.
     * <p>
     * The built object has its fields set to the values given when calling the "with*" methods of this builder.
     * </p>
     */
    public GetDeviceSystemInfoRequest build() {
      GetDeviceSystemInfoRequest instance = new GetDeviceSystemInfoRequest();

      populate(instance);

      return instance;
    }
  };

  private String deviceId;

  @HttpLabel(value="deviceId")
  @Required()
  public String getDeviceId() {
    return this.deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  private static final int classNameHashCode =
      internalHashCodeCompute("com.amazon.ata.executorservice.classroom.devicecommunication.GetDeviceSystemInfoRequest");

  /**
   * HashCode implementation for GetDeviceSystemInfoRequest
   * based on java.util.Arrays.hashCode
   */
  @Override
  public int hashCode() {
    return internalHashCodeCompute(
        classNameHashCode,
        getDeviceId());
  }

  private static int internalHashCodeCompute(Object... objects) {
    return Arrays.hashCode(objects);
  }

  /**
   * Equals implementation for GetDeviceSystemInfoRequest
   * based on instanceof and Object.equals().
   */
  @Override
  public boolean equals(final Object other) {
    if (!(other instanceof GetDeviceSystemInfoRequest)) {
      return false;
    }

    GetDeviceSystemInfoRequest that = (GetDeviceSystemInfoRequest) other;

    return
        Objects.equals(getDeviceId(), that.getDeviceId());
  }

  /**
   * Returns a string representation of this object. The content of any types marked with the
   * <a href="https://w.amazon.com/index.php/Coral/Model/XML/Traits#Sensitive">sensitive</a>
   * trait will be redacted.
   * <p/>
   * <b>Do not attempt to parse the string returned by this method.</b> Coral's <tt>toString</tt>
   * format is undefined and subject to change. To obtain a proper machine-readable representation
   * of this object, use Coral Serialize directly.
   * @see <a href="https://w.amazon.com/index.php/Coral/Serialize/Manual">Coral Serialize Manual</a>
   * @see <a href="https://w.amazon.com/index.php/Coral/Serialize/FAQ">Coral Serialize FAQ</a>
   */
  @Override
  public String toString() {
    StringBuilder ret = new StringBuilder();
    ret.append("GetDeviceSystemInfoRequest(");

    ret.append("deviceId=");
    ret.append(String.valueOf(deviceId));
    ret.append(")");

    return ret.toString();
  }

}