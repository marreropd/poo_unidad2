public class AddObjsToMultimediaList {


    public static void main(String[] args) {
        Gallery gallery = new Gallery(20);

        Movie movie1 = new Movie("movie1", "author1", "duration1", "main actor1");
        Movie movie2 = new Movie("movie2", "author2", "duration2", "main actor2");
        Movie movie3 = new Movie("movie3", "author3", "duration3", "main actor3");
        Movie movie4 = new Movie("movie4", "author4", "duration4", "main actor4");
        Movie movie5 = new Movie("movie5", "author5", "duration5", "main actor5");

        gallery.add(movie1);
        gallery.add(movie2);
        gallery.add(movie3);
        gallery.add(movie4);
        gallery.add(movie5);

        Disc disc1 = new Disc("disc1", "author1", "duration1", "genre1");
        Disc disc2 = new Disc("disc2", "author2", "duration2", "genre2");
        Disc disc3 = new Disc("disc3", "author3", "duration3", "genre3");
        Disc disc4 = new Disc("disc4", "author4", "duration4", "genre4");
        Disc disc5 = new Disc("disc5", "author5", "duration5", "genre5");

        gallery.add(disc1);
        gallery.add(disc2);
        gallery.add(disc3);
        gallery.add(disc4);
        gallery.add(disc5);

        CD_Pictures cd_pictures1 = new CD_Pictures("cd_pictures1", "author1", "duration1", 10);
        CD_Pictures cd_pictures2 = new CD_Pictures("cd_pictures2", "author2", "duration2", 10);
        CD_Pictures cd_pictures3 = new CD_Pictures("cd_pictures3", "author3", "duration3", 10);
        CD_Pictures cd_pictures4 = new CD_Pictures("cd_pictures4", "author4", "duration4", 10);
        CD_Pictures cd_pictures5 = new CD_Pictures("cd_pictures5", "author5", "duration5", 10);

        gallery.add(cd_pictures1);
        gallery.add(cd_pictures2);
        gallery.add(cd_pictures3);
        gallery.add(cd_pictures4);
        gallery.add(cd_pictures5);

        CD_Videos cd_videos1 = new CD_Videos("cd_videos1", "author1", "duration1", 4);
        CD_Videos cd_videos2 = new CD_Videos("cd_videos2", "author2", "duration2", 4);
        CD_Videos cd_videos3 = new CD_Videos("cd_videos3", "author3", "duration3", 4);
        CD_Videos cd_videos4 = new CD_Videos("cd_videos4", "author4", "duration4", 4);
        CD_Videos cd_videos5 = new CD_Videos("cd_videos5", "author5", "duration5", 4);

        gallery.add(cd_videos1);
        gallery.add(cd_videos2);
        gallery.add(cd_videos3);
        gallery.add(cd_videos4);
        gallery.add(cd_videos5);

        String galleryString = gallery.toString();
        System.out.println(galleryString);


        Multimedia item2 = gallery.get(1);

        Movie movie = new Movie(item2.getTitle(), item2.getAuthor(), item2.getDuration(), "Mainactor");

        int movieIndexAtGallery = gallery.indexOf(item2);

        System.out.println(gallery.get(movieIndexAtGallery) + " at position: " + movieIndexAtGallery);

    }


}
