/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.azure.core.serializer.avro.apache.generatedtestsources;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class HandOfCards extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2204772210172278016L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HandOfCards\",\"namespace\":\"com.azure.core.serializer.avro.apache.generatedtestsources\",\"fields\":[{\"name\":\"cards\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"PlayingCard\",\"fields\":[{\"name\":\"isFaceCard\",\"type\":\"boolean\"},{\"name\":\"cardValue\",\"type\":\"int\"},{\"name\":\"playingCardSuit\",\"type\":{\"type\":\"enum\",\"name\":\"PlayingCardSuit\",\"symbols\":[\"SPADES\",\"HEARTS\",\"DIAMONDS\",\"CLUBS\"]}}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<HandOfCards> ENCODER =
      new BinaryMessageEncoder<HandOfCards>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<HandOfCards> DECODER =
      new BinaryMessageDecoder<HandOfCards>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<HandOfCards> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<HandOfCards> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<HandOfCards> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<HandOfCards>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this HandOfCards to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a HandOfCards from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a HandOfCards instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static HandOfCards fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.List<com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard> cards;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public HandOfCards() {}

  /**
   * All-args constructor.
   * @param cards The new value for cards
   */
  public HandOfCards(java.util.List<com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard> cards) {
    this.cards = cards;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return cards;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: cards = (java.util.List<com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'cards' field.
   * @return The value of the 'cards' field.
   */
  public java.util.List<com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard> getCards() {
    return cards;
  }


  /**
   * Sets the value of the 'cards' field.
   * @param value the value to set.
   */
  public void setCards(java.util.List<com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard> value) {
    this.cards = value;
  }

  /**
   * Creates a new HandOfCards RecordBuilder.
   * @return A new HandOfCards RecordBuilder
   */
  public static com.azure.core.serializer.avro.apache.generatedtestsources.HandOfCards.Builder newBuilder() {
    return new com.azure.core.serializer.avro.apache.generatedtestsources.HandOfCards.Builder();
  }

  /**
   * Creates a new HandOfCards RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new HandOfCards RecordBuilder
   */
  public static com.azure.core.serializer.avro.apache.generatedtestsources.HandOfCards.Builder newBuilder(com.azure.core.serializer.avro.apache.generatedtestsources.HandOfCards.Builder other) {
    if (other == null) {
      return new com.azure.core.serializer.avro.apache.generatedtestsources.HandOfCards.Builder();
    } else {
      return new com.azure.core.serializer.avro.apache.generatedtestsources.HandOfCards.Builder(other);
    }
  }

  /**
   * Creates a new HandOfCards RecordBuilder by copying an existing HandOfCards instance.
   * @param other The existing instance to copy.
   * @return A new HandOfCards RecordBuilder
   */
  public static com.azure.core.serializer.avro.apache.generatedtestsources.HandOfCards.Builder newBuilder(com.azure.core.serializer.avro.apache.generatedtestsources.HandOfCards other) {
    if (other == null) {
      return new com.azure.core.serializer.avro.apache.generatedtestsources.HandOfCards.Builder();
    } else {
      return new com.azure.core.serializer.avro.apache.generatedtestsources.HandOfCards.Builder(other);
    }
  }

  /**
   * RecordBuilder for HandOfCards instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HandOfCards>
    implements org.apache.avro.data.RecordBuilder<HandOfCards> {

    private java.util.List<com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard> cards;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.azure.core.serializer.avro.apache.generatedtestsources.HandOfCards.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.cards)) {
        this.cards = data().deepCopy(fields()[0].schema(), other.cards);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing HandOfCards instance
     * @param other The existing instance to copy.
     */
    private Builder(com.azure.core.serializer.avro.apache.generatedtestsources.HandOfCards other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.cards)) {
        this.cards = data().deepCopy(fields()[0].schema(), other.cards);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'cards' field.
      * @return The value.
      */
    public java.util.List<com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard> getCards() {
      return cards;
    }


    /**
      * Sets the value of the 'cards' field.
      * @param value The value of 'cards'.
      * @return This builder.
      */
    public com.azure.core.serializer.avro.apache.generatedtestsources.HandOfCards.Builder setCards(java.util.List<com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard> value) {
      validate(fields()[0], value);
      this.cards = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'cards' field has been set.
      * @return True if the 'cards' field has been set, false otherwise.
      */
    public boolean hasCards() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'cards' field.
      * @return This builder.
      */
    public com.azure.core.serializer.avro.apache.generatedtestsources.HandOfCards.Builder clearCards() {
      cards = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public HandOfCards build() {
      try {
        HandOfCards record = new HandOfCards();
        record.cards = fieldSetFlags()[0] ? this.cards : (java.util.List<com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard>) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<HandOfCards>
    WRITER$ = (org.apache.avro.io.DatumWriter<HandOfCards>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<HandOfCards>
    READER$ = (org.apache.avro.io.DatumReader<HandOfCards>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    long size0 = this.cards.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard e0: this.cards) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      long size0 = in.readArrayStart();
      java.util.List<com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard> a0 = this.cards;
      if (a0 == null) {
        a0 = new SpecificData.Array<com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard>((int)size0, SCHEMA$.getField("cards").schema());
        this.cards = a0;
      } else a0.clear();
      SpecificData.Array<com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          long size0 = in.readArrayStart();
          java.util.List<com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard> a0 = this.cards;
          if (a0 == null) {
            a0 = new SpecificData.Array<com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard>((int)size0, SCHEMA$.getField("cards").schema());
            this.cards = a0;
          } else a0.clear();
          SpecificData.Array<com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










