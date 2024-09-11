/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author ???
 * @version ???
 */

public class Main {
	public static void main(String[] args) {

		String description = "America's first transcontinental railroad (known originally as the \"Pacific Railroad\" and later as the \"Overland Route\") was a 1,911-mile (3,075 km) continuous railroad line built between 1863 and 1869 that connected the existing eastern U.S. rail network at Council Bluffs, Iowa, with the Pacific coast at the Oakland Long Wharf on San Francisco Bay.";
		String revised = "From 1865-1869, 12,000 Chinese immigrants constructed the western section of the transcontinental railroad - one of the greatest engineering feats in American history. Their efforts, which connected the western United States to the eastern United States, laid the foundation for the extraordinary economic prosperity enjoyed by the United States in the years that followed. Many of these workers risked their lives and perished during the harsh winters and dangerous working conditions. They faced prejudice, low wages and social isolation. Despite these challenges, they courageously took a stand to organize for fairer wages and safer working conditions. Their efforts not only bridged our nation together, they advanced the cause of good, safe jobs for all workers, immigrant and native workers alike. ";
		String citation = "https://www.dol.gov/general/aboutdol/hallofhonor/2014_railroad#:~:text=The%20Chinese%20Railroad%20Workers%20(1865,engineering%20feats%20in%20American%20history.";
		Date date = new Date(5, 10, 1869);

		//HistoricalEvent[] array = new HistoricalEvent[3];
		//array[0] = 
		// array[1] = newRevisedEvent(description, newDate(9, 11, 2024), "Dior exploitation", citation);
		// //array[2] = newRevisedEvent(description, Date , citation);





		String tulsaDescription = "A black teenager, who was working as a shoe shiner in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white woman on a public elevator in broad daylight. A group of white vigilantes, intent on lynching him, and armed black men intent on protecting him gathered at the courthouse. A shot rang out, and the violence began. The riot resulted in 35 square blocks of destruction, including more than 1,250 homes, churches, schools, businesses, a hospital, and a library.";
		Date tulsaDay = new Date(5, 31, 1921);
		HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);

		// System.out.println("====================================================");
		// System.out.println("HISTORICAL EVENT EXAMPLE:");
		// System.out.println("====================================================");
		//System.out.println(tulsaRiot);
		tulsaRiot.teach();
		
		
		String tulsaRevised = "It started with newspaper reports that a black man had assaulted a white elevator operator. He was arrested, and black World War I vets rushed to the courthouse to prevent a lynching. Whites were deputized and handed weapons, the shooting started and then it got out of hand. It was mob rule for two days, and the result was the complete devastation of the entire black community. The white mobs looted the homes and businesses before they set fire to the community. Planes circled mid-air and bombed what was known as Black Wall Street. The National Guard was called out after the governor declared martial law, and imprisoned all blacks that were not already in jail. More than 35 blocks were destroyed, along with more than 1,200 homes, and some 300 people died, mostly Blacks.",
			tulsaCitation = "https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/";
		RevisedEvent tulsaMassacre = new RevisedEvent(tulsaDescription, tulsaDay,
		tulsaRevised, tulsaCitation);
		
		// System.out.println("\n====================================================");
		// System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		// System.out.println("====================================================");
		tulsaMassacre.teach();

	// 	int[] array = { 4, 5, 6, 3, 2, 7, 9 };
	// 	//bubble sort
	// 	for (int j = 0; j < array.length; j++) 
	// 	{
	// 		for (int i = 0; i < array.length - 1; i++) {
	// 			if (array[i] > array[i + 1]) {
	// 				int temp = array[i];
	// 				array[i] = array[i + 1];
	// 				array[i + 1] = temp;
	// 			}
	// 		}
	// 	}
		
	// 	for (int i = 0; i < array.length; i++)
	// 	{
	// 		System.out.print(array[i] + ", ");
	// 	}
	 }
}