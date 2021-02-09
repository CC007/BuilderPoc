public class ExampleThing
{
	private final String foo;
	private final String bar;
	private final String nullableBaz;

	private ExampleThing(String foo, String bar, String nullableBaz)
	{
		this.foo = foo;
		this.bar = bar;
		this.nullableBaz = nullableBaz;
	}

	public static ExampleThingBuilder builder(){
		return new ExampleThingBuilder();
	}

	static class ExampleThingBuilder
	{
		private String nullableBaz;

		public ExampleThingBuilder nullableBaz(String nullableBaz)
		{
			this.nullableBaz = nullableBaz;
			return this;
		}

		public FooExampleThingBuilder foo(String foo)
		{
			return new FooExampleThingBuilder(foo, nullableBaz);
		}

		public BarExampleThingBuilder bar(String bar)
		{
			return new BarExampleThingBuilder(bar, nullableBaz);
		}
	}

	static class BarExampleThingBuilder
	{
		private final String bar;
		private String nullableBaz;

		private BarExampleThingBuilder(String bar, String nullableBaz)
		{
			this.bar = bar;
			this.nullableBaz = nullableBaz;
		}

		public BarExampleThingBuilder nullableBaz(String nullableBaz)
		{
			this.nullableBaz = nullableBaz;
			return this;
		}

		public FooBarExampleThingBuilder foo(String foo)
		{
			return new FooBarExampleThingBuilder(foo, bar, nullableBaz);
		}
	}

	static class FooExampleThingBuilder
	{
		private final String foo;
		private String nullableBaz;

		private FooExampleThingBuilder(String foo, String nullableBaz)
		{
			this.foo = foo;
			this.nullableBaz = nullableBaz;
		}

		public FooExampleThingBuilder nullableBaz(String nullableBaz)
		{
			this.nullableBaz = nullableBaz;
			return this;
		}

		public FooBarExampleThingBuilder bar(String bar)
		{
			return new FooBarExampleThingBuilder(foo, bar, nullableBaz);
		}
	}

	static class FooBarExampleThingBuilder {
		private final String foo;
		private final String bar;
		private String nullableBaz;

		private FooBarExampleThingBuilder(String foo, String bar, String nullableBaz)
		{
			this.foo = foo;
			this.bar = bar;
			this.nullableBaz = nullableBaz;
		}

		public FooBarExampleThingBuilder nullableBaz(String nullableBaz)
		{
			this.nullableBaz = nullableBaz;
			return this;
		}

		public ExampleThing build()
		{
			return new ExampleThing(foo, bar, nullableBaz);
		}
	}
}
