public class Main
{
	public static void main(String[] args)
	{
		ExampleThing exampleThing1 = ExampleThing.builder()
			.foo("Hello")
			.bar("World")
			.build();

		ExampleThing exampleThing2 = ExampleThing.builder()
			.bar("World")
			.foo("Hello")
			.build();

		ExampleThing exampleThing3 = ExampleThing.builder()
			.foo("Hello")
			.bar("World")
			.nullableBaz("and everyone else")
			.build();

		ExampleThing exampleThing4 = ExampleThing.builder()
			.nullableBaz("and everyone else")
			.bar("World")
			.foo("Hello")
			.build();

		ExampleThing exampleThing5 = ExampleThing.builder()
			.bar("World")
			.nullableBaz("and everyone else")
			.foo("Hello")
			.build();

//		COMPILER ERROR
//		ExampleThing exampleThing5 = ExampleThing.builder()
//			.bar("World")
//			.build();
	}
}
