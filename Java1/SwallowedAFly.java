// Joe Sutliff
// 1/8/16
// CPW 142
// Assignment #1 
//
// This program will print the words to "Swallowed a Fly"
public class SwallowedAFly {

    // sing all the verses.
    public static void main( String[] args ) {
    
    
        singFlyVerse();
         
        singSpiderVerse();
         
        singBirdVerse();

        singCatVerse();

        singDogVerse();
        
        singGoatVerse();
         
        singCowVerse();
         
        singHorseVerse();

        
        
    }

    // prints the fly verse.
    public static void singFlyVerse() {
        System.out.println( "There was an old lady who swallowed a fly." );
        idunnowhyVerse();
        dieVerse();
    }

    // prints the spider verse.
    public static void singSpiderVerse() {
        System.out.println( "There was an old lady who swallowed a spider," );
        wiggledVerse();
        swallowedspiderVerse();
        idunnowhyVerse();
        dieVerse();
    }
    
    // prints the bird verse.
    public static void singBirdVerse() {
        System.out.println( "There was an old lady who swallowed a bird" );
        System.out.println( "How absurd to swallow a bird!" );
        swallowedbirdVerse();
        wiggledVerse();
        swallowedspiderVerse();
        idunnowhyVerse();
        dieVerse();
    }

    // prints the cat verse.
    public static void singCatVerse() {
        System.out.println( "There was an old lady who swallowed a cat" );
        System.out.println( "Imagine that, she swallowed a cat." );
        swallowedcatVerse();
        swallowedbirdVerse();
        wiggledVerse();
        swallowedspiderVerse();
        idunnowhyVerse();
        dieVerse();
    }

    // prints the dog verse.
    public static void singDogVerse() {
        System.out.println( "There was an old lady who swallowed a dog." );
        System.out.println( "What a hog! To swallow a dog!" );
        swalloweddogVerse();
        swallowedcatVerse();
        swallowedbirdVerse();
        wiggledVerse();
        swallowedspiderVerse();
        idunnowhyVerse();
        dieVerse();
        
    }
     // prints the goat verse.
    public static void singGoatVerse() {
        System.out.println( "There was an old lady who swallowed a goat." );
        System.out.println( "Just opened her throat and swallowed a goat!" );
        swallowedgoatVerse();
        swalloweddogVerse();
        swallowedcatVerse();
        swallowedbirdVerse();
        wiggledVerse();
        swallowedspiderVerse();
        idunnowhyVerse();
        dieVerse();
    }

    // prints the cow verse.
    public static void singCowVerse() {
        System.out.println( "There was an old lady who swallowed a cow." );
        System.out.println( "I don't know how she swallowed a cow!" );
        swallowedcowVerse();
        swallowedgoatVerse();
        swalloweddogVerse();
        swallowedcatVerse();
        swallowedbirdVerse();
        wiggledVerse();
        swallowedspiderVerse();
        idunnowhyVerse();
        dieVerse();

    }
    
    // prints the horse verse.
    public static void singHorseVerse() {
        System.out.println( "There was an old lady who swallowed a horse -" );
        System.out.println( "She's dead, of course." );
    
    }

    // prints the swallowed spider verse.
    public static void swallowedspiderVerse() {
        System.out.println( "She swallowed the spider to catch the fly." );
    }

    // prints the swallowed bird verse.
    public static void swallowedbirdVerse() {
        System.out.println( "She swallowed the bird to catch the spider." );
    }

    // prints the swallowed cat verse.
    public static void swallowedcatVerse() {
        System.out.println( "She swallowed the cat to catch the bird." );
    }
    // prints the swallowed dog verse.
    public static void swalloweddogVerse() {
        System.out.println( "She swallowed the dog to catch the cat." );
    }
    // prints the swallowed goat verse.
    public static void swallowedgoatVerse() {
        System.out.println( "She swallowed the goat to catch the dog." );
    }    
     // prints the swallowed cow verse.
    public static void swallowedcowVerse() {
        System.out.println( "She swallowed the cow to catch the goat." );
    }
    
    // prints the die verse.
    public static void dieVerse() {
        System.out.println( "Perhaps she'll die." );
    }
    
    // prints the wiggled verse.
    public static void wiggledVerse() {
        System.out.println( "That wiggled and wiggled and tickled inside her." );
        
    }
    
    // prints the idunnowhy verse.
    public static void idunnowhyVerse() {
        System.out.println( "I dunno why she swallowed that fly,");
    }
}