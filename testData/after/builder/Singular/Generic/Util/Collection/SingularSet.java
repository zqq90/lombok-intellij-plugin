// Generated by delombok at Sat Jun 11 16:42:02 CEST 2016

import java.util.Set;

public class SingularSet<T> {
	private Set rawTypes;
	private Set<Integer> integers;
	private Set<T> generics;
	private Set<? extends Number> extendsGenerics;

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	SingularSet(final Set rawTypes, final Set<Integer> integers, final Set<T> generics, final Set<? extends Number> extendsGenerics) {
		this.rawTypes = rawTypes;
		this.integers = integers;
		this.generics = generics;
		this.extendsGenerics = extendsGenerics;
	}


	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public static class SingularSetBuilder<T> {
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
		SingularSetBuilder() {
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSetBuilder<T> rawType(final java.lang.Object rawType) {
			if (this.rawTypes == null) this.rawTypes = new java.util.ArrayList<java.lang.Object>();
			this.rawTypes.add(rawType);
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSetBuilder<T> rawTypes(final java.util.Collection<?> rawTypes) {
			if (this.rawTypes == null) this.rawTypes = new java.util.ArrayList<java.lang.Object>();
			this.rawTypes.addAll(rawTypes);
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSetBuilder<T> clearRawTypes() {
			if (this.rawTypes != null) this.rawTypes.clear();
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSetBuilder<T> integer(final Integer integer) {
			if (this.integers == null) this.integers = new java.util.ArrayList<Integer>();
			this.integers.add(integer);
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSetBuilder<T> integers(final java.util.Collection<? extends Integer> integers) {
			if (this.integers == null) this.integers = new java.util.ArrayList<Integer>();
			this.integers.addAll(integers);
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSetBuilder<T> clearIntegers() {
			if (this.integers != null) this.integers.clear();
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSetBuilder<T> generic(final T generic) {
			if (this.generics == null) this.generics = new java.util.ArrayList<T>();
			this.generics.add(generic);
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSetBuilder<T> generics(final java.util.Collection<? extends T> generics) {
			if (this.generics == null) this.generics = new java.util.ArrayList<T>();
			this.generics.addAll(generics);
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSetBuilder<T> clearGenerics() {
			if (this.generics != null) this.generics.clear();
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSetBuilder<T> extendsGeneric(final Number extendsGeneric) {
			if (this.extendsGenerics == null) this.extendsGenerics = new java.util.ArrayList<Number>();
			this.extendsGenerics.add(extendsGeneric);
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSetBuilder<T> extendsGenerics(final java.util.Collection<? extends Number> extendsGenerics) {
			if (this.extendsGenerics == null) this.extendsGenerics = new java.util.ArrayList<Number>();
			this.extendsGenerics.addAll(extendsGenerics);
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSetBuilder<T> clearExtendsGenerics() {
			if (this.extendsGenerics != null) this.extendsGenerics.clear();
			return this;
		}

		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public SingularSet<T> build() {
			java.util.Set<java.lang.Object> rawTypes;
			switch (this.rawTypes == null ? 0 : this.rawTypes.size()) {
			case 0: 
				rawTypes = java.util.Collections.emptySet();
				break;

			case 1: 
				rawTypes = java.util.Collections.singleton(this.rawTypes.get(0));
				break;

			default: 
				rawTypes = new java.util.LinkedHashSet<java.lang.Object>(this.rawTypes.size() < 1073741824 ? 1 + this.rawTypes.size() + (this.rawTypes.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
				rawTypes.addAll(this.rawTypes);
				rawTypes = java.util.Collections.unmodifiableSet(rawTypes);
			}
			java.util.Set<Integer> integers;
			switch (this.integers == null ? 0 : this.integers.size()) {
			case 0: 
				integers = java.util.Collections.emptySet();
				break;

			case 1: 
				integers = java.util.Collections.singleton(this.integers.get(0));
				break;

			default: 
				integers = new java.util.LinkedHashSet<Integer>(this.integers.size() < 1073741824 ? 1 + this.integers.size() + (this.integers.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
				integers.addAll(this.integers);
				integers = java.util.Collections.unmodifiableSet(integers);
			}
			java.util.Set<T> generics;
			switch (this.generics == null ? 0 : this.generics.size()) {
			case 0: 
				generics = java.util.Collections.emptySet();
				break;

			case 1: 
				generics = java.util.Collections.singleton(this.generics.get(0));
				break;

			default: 
				generics = new java.util.LinkedHashSet<T>(this.generics.size() < 1073741824 ? 1 + this.generics.size() + (this.generics.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
				generics.addAll(this.generics);
				generics = java.util.Collections.unmodifiableSet(generics);
			}
			java.util.Set<Number> extendsGenerics;
			switch (this.extendsGenerics == null ? 0 : this.extendsGenerics.size()) {
			case 0: 
				extendsGenerics = java.util.Collections.emptySet();
				break;

			case 1: 
				extendsGenerics = java.util.Collections.singleton(this.extendsGenerics.get(0));
				break;

			default: 
				extendsGenerics = new java.util.LinkedHashSet<Number>(this.extendsGenerics.size() < 1073741824 ? 1 + this.extendsGenerics.size() + (this.extendsGenerics.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
				extendsGenerics.addAll(this.extendsGenerics);
				extendsGenerics = java.util.Collections.unmodifiableSet(extendsGenerics);
			}
			return new SingularSet<T>(rawTypes, integers, generics, extendsGenerics);
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@javax.annotation.Generated("lombok")
		public java.lang.String toString() {
			return "SingularSet.SingularSetBuilder(rawTypes=" + this.rawTypes + ", integers=" + this.integers + ", generics=" + this.generics + ", extendsGenerics=" + this.extendsGenerics + ")";
		}
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public static <T> SingularSetBuilder<T> builder() {
		return new SingularSetBuilder<T>();
	}
}
