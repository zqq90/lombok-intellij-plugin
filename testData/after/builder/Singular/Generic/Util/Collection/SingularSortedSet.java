// Generated by delombok at Sat Jun 11 16:42:02 CEST 2016

import java.util.SortedSet;

public class SingularSortedSet<T> {
	private SortedSet rawTypes;
	private SortedSet<Integer> integers;
	private SortedSet<T> generics;
	private SortedSet<? extends Number> extendsGenerics;

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	SingularSortedSet(final SortedSet rawTypes, final SortedSet<Integer> integers, final SortedSet<T> generics, final SortedSet<? extends Number> extendsGenerics) {
		this.rawTypes = rawTypes;
		this.integers = integers;
		this.generics = generics;
		this.extendsGenerics = extendsGenerics;
	}


	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public static class SingularSortedSetBuilder<T> {
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		private java.util.ArrayList<java.lang.Object> rawTypes;
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		private java.util.ArrayList<Integer> integers;
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		private java.util.ArrayList<T> generics;
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		private java.util.ArrayList<Number> extendsGenerics;

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		SingularSortedSetBuilder() {
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSortedSetBuilder<T> rawType(final java.lang.Object rawType) {
			if (this.rawTypes == null) this.rawTypes = new java.util.ArrayList<java.lang.Object>();
			this.rawTypes.add(rawType);
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSortedSetBuilder<T> rawTypes(final java.util.Collection<?> rawTypes) {
			if (this.rawTypes == null) this.rawTypes = new java.util.ArrayList<java.lang.Object>();
			this.rawTypes.addAll(rawTypes);
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSortedSetBuilder<T> clearRawTypes() {
			if (this.rawTypes != null) this.rawTypes.clear();
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSortedSetBuilder<T> integer(final Integer integer) {
			if (this.integers == null) this.integers = new java.util.ArrayList<Integer>();
			this.integers.add(integer);
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSortedSetBuilder<T> integers(final java.util.Collection<? extends Integer> integers) {
			if (this.integers == null) this.integers = new java.util.ArrayList<Integer>();
			this.integers.addAll(integers);
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSortedSetBuilder<T> clearIntegers() {
			if (this.integers != null) this.integers.clear();
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSortedSetBuilder<T> generic(final T generic) {
			if (this.generics == null) this.generics = new java.util.ArrayList<T>();
			this.generics.add(generic);
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSortedSetBuilder<T> generics(final java.util.Collection<? extends T> generics) {
			if (this.generics == null) this.generics = new java.util.ArrayList<T>();
			this.generics.addAll(generics);
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSortedSetBuilder<T> clearGenerics() {
			if (this.generics != null) this.generics.clear();
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSortedSetBuilder<T> extendsGeneric(final Number extendsGeneric) {
			if (this.extendsGenerics == null) this.extendsGenerics = new java.util.ArrayList<Number>();
			this.extendsGenerics.add(extendsGeneric);
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSortedSetBuilder<T> extendsGenerics(final java.util.Collection<? extends Number> extendsGenerics) {
			if (this.extendsGenerics == null) this.extendsGenerics = new java.util.ArrayList<Number>();
			this.extendsGenerics.addAll(extendsGenerics);
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSortedSetBuilder<T> clearExtendsGenerics() {
			if (this.extendsGenerics != null) this.extendsGenerics.clear();
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSortedSet<T> build() {
			java.util.SortedSet<java.lang.Object> rawTypes = new java.util.TreeSet<java.lang.Object>();
			if (this.rawTypes != null) rawTypes.addAll(this.rawTypes);
			rawTypes = java.util.Collections.unmodifiableSortedSet(rawTypes);
			java.util.SortedSet<Integer> integers = new java.util.TreeSet<Integer>();
			if (this.integers != null) integers.addAll(this.integers);
			integers = java.util.Collections.unmodifiableSortedSet(integers);
			java.util.SortedSet<T> generics = new java.util.TreeSet<T>();
			if (this.generics != null) generics.addAll(this.generics);
			generics = java.util.Collections.unmodifiableSortedSet(generics);
			java.util.SortedSet<Number> extendsGenerics = new java.util.TreeSet<Number>();
			if (this.extendsGenerics != null) extendsGenerics.addAll(this.extendsGenerics);
			extendsGenerics = java.util.Collections.unmodifiableSortedSet(extendsGenerics);
			return new SingularSortedSet<T>(rawTypes, integers, generics, extendsGenerics);
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public java.lang.String toString() {
			return "SingularSortedSet.SingularSortedSetBuilder(rawTypes=" + this.rawTypes + ", integers=" + this.integers + ", generics=" + this.generics + ", extendsGenerics=" + this.extendsGenerics + ")";
		}
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public static <T> SingularSortedSetBuilder<T> builder() {
		return new SingularSortedSetBuilder<T>();
	}
}
