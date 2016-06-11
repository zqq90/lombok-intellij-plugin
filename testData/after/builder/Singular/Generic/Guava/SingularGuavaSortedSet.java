// Generated by delombok at Sat Jun 11 16:42:02 CEST 2016

import com.google.common.collect.ImmutableSortedSet;

public class SingularGuavaSortedSet<T> {
  private ImmutableSortedSet rawTypes;
  private ImmutableSortedSet<Integer> integers;
  private ImmutableSortedSet<T> generics;
  private ImmutableSortedSet<? extends Number> extendsGenerics;

  public static void main(String[] args) {
  }

  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  SingularGuavaSortedSet(final ImmutableSortedSet rawTypes, final ImmutableSortedSet<Integer> integers, final ImmutableSortedSet<T> generics, final ImmutableSortedSet<? extends Number> extendsGenerics) {
    this.rawTypes = rawTypes;
    this.integers = integers;
    this.generics = generics;
    this.extendsGenerics = extendsGenerics;
  }


  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public static class SingularGuavaSortedSetBuilder<T> {
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private com.google.common.collect.ImmutableSortedSet.Builder<java.lang.Object> rawTypes;
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private com.google.common.collect.ImmutableSortedSet.Builder<Integer> integers;
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private com.google.common.collect.ImmutableSortedSet.Builder<T> generics;
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private com.google.common.collect.ImmutableSortedSet.Builder<Number> extendsGenerics;

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    SingularGuavaSortedSetBuilder() {
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedSetBuilder<T> rawType(final java.lang.Object rawType) {
      if (this.rawTypes == null) this.rawTypes = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.rawTypes.add(rawType);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedSetBuilder<T> rawTypes(final java.lang.Iterable<?> rawTypes) {
      if (this.rawTypes == null) this.rawTypes = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.rawTypes.addAll(rawTypes);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedSetBuilder<T> clearRawTypes() {
      this.rawTypes = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedSetBuilder<T> integer(final Integer integer) {
      if (this.integers == null) this.integers = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.integers.add(integer);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedSetBuilder<T> integers(final java.lang.Iterable<? extends Integer> integers) {
      if (this.integers == null) this.integers = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.integers.addAll(integers);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedSetBuilder<T> clearIntegers() {
      this.integers = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedSetBuilder<T> generic(final T generic) {
      if (this.generics == null) this.generics = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.generics.add(generic);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedSetBuilder<T> generics(final java.lang.Iterable<? extends T> generics) {
      if (this.generics == null) this.generics = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.generics.addAll(generics);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedSetBuilder<T> clearGenerics() {
      this.generics = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedSetBuilder<T> extendsGeneric(final Number extendsGeneric) {
      if (this.extendsGenerics == null) this.extendsGenerics = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.extendsGenerics.add(extendsGeneric);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedSetBuilder<T> extendsGenerics(final java.lang.Iterable<? extends Number> extendsGenerics) {
      if (this.extendsGenerics == null) this.extendsGenerics = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.extendsGenerics.addAll(extendsGenerics);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedSetBuilder<T> clearExtendsGenerics() {
      this.extendsGenerics = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSortedSet<T> build() {
      com.google.common.collect.ImmutableSortedSet<java.lang.Object> rawTypes = this.rawTypes == null ? com.google.common.collect.ImmutableSortedSet.<java.lang.Object>of() : this.rawTypes.build();
      com.google.common.collect.ImmutableSortedSet<Integer> integers = this.integers == null ? com.google.common.collect.ImmutableSortedSet.<Integer>of() : this.integers.build();
      com.google.common.collect.ImmutableSortedSet<T> generics = this.generics == null ? com.google.common.collect.ImmutableSortedSet.<T>of() : this.generics.build();
      com.google.common.collect.ImmutableSortedSet<Number> extendsGenerics = this.extendsGenerics == null ? com.google.common.collect.ImmutableSortedSet.<Number>of() : this.extendsGenerics.build();
      return new SingularGuavaSortedSet<T>(rawTypes, integers, generics, extendsGenerics);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public java.lang.String toString() {
      return "SingularGuavaSortedSet.SingularGuavaSortedSetBuilder(rawTypes=" + this.rawTypes + ", integers=" + this.integers + ", generics=" + this.generics + ", extendsGenerics=" + this.extendsGenerics + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public static <T> SingularGuavaSortedSetBuilder<T> builder() {
    return new SingularGuavaSortedSetBuilder<T>();
  }
}
