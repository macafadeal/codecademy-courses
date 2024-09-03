public class MadLibs {
	/*
	 * Your description here
	 */
	public static void main(String[] args) {
		String adjective1 = "a sharp pain and still tired";
		String adjective2 = "long";
		String adjective3 = "annoyed";

		String name1 = "Mateus";
		String name2 = "Eduardo";

		String noun1 = "weirdoes";
		String noun2 = "weed";
		String noun3 = "Macarena";
		String noun4 = "store-keeper";
		String noun5 = "water";
		String noun6 = "roache";

		String place1 = "Antartica";

		String verb1 = "riot";

		int number = 3000;

		// The template for the story
		String story = "This morning " + name1 + " w;oke up feeling " + adjective1 + ". 'It is going to be a " + adjective2
				+ " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores. They began to "
				+ verb1 + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3
				+ ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1 + " to " + place1 + " and dropped "
				+ name1 + " in a puddle of frozen " + noun5 + ". " + name1 + " woke up in the year " + number
				+ ", in a world where " + noun6 + "s ruled the world.";

		System.out.println(story);
	}
}
