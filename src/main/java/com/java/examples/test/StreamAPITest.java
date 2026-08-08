package com.java.examples.test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.groupingBy;

public class StreamAPITest {

	public static void main(String[] args) {
		
		List<List<String>> listOfLists = Arrays.asList(
	            Arrays.asList("Reflection", "Collection", "Stream"),
	            Arrays.asList("Structure", "State", "Flow"),
	            Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
	        );
		
		Set<String> middleResult = new HashSet<>();
		
		List<String> resultLlist = new ArrayList<>(listOfLists.stream()
                .flatMap(List::stream)
                .peek(s -> {
                    if (s.startsWith("R")) middleResult.add(s);
                })
                .filter(s -> s.startsWith("S"))
                .map(String::toUpperCase)
                .distinct()
                .toList());
       
		//resultLlist.sort((s1, s2) -> s1.compareTo(s2));
		
		resultLlist.sort(Comparator.naturalOrder());
		
		//Collections.sort(resultLlist, Comparator.reverseOrder());
		middleResult.forEach(System.out::println);
		
		resultLlist.forEach(System.out::println);
		
		String csvString = String.join(",", resultLlist);
		String csvString2 = resultLlist.stream().collect(Collectors.joining(","));

		
		Comparator<String> stringCompare1 = String::compareTo;
		
		List<String> synchronizedlist =  Collections.synchronizedList(resultLlist);
		 //below one equals to above one
		//Comparator<String> stringCompare2 = (str1, str2) -> str1.compareTo(str2);
		
		resultLlist.sort(stringCompare1);
		 List<String> names = Arrays.asList(
		            "Reflection", "Collection", "Stream",
		            "Structure", "Sorting", "State"
		        );
		 
		 //Collect all the elements that starts with 'S'
		 List<String> sNames = names.stream()
                 .filter(name -> name.startsWith("S"))
                 .toList();
		
		// reduce: Concatenate all names into a single string
	        String concatenatedNames = names.stream().reduce("", (partialString, element) -> partialString + " " + element);
	       System.out.println(" concatenatedNames: " + concatenatedNames);
	    
	     // findFirst: Find the first name
	        String firstName = names.stream().findFirst().orElse("No Name Found");
	        
	      
	     // allMatch: Check if all names start with 'S'
	        boolean allStartWithS = names.stream().allMatch(
	            name -> name.startsWith("S")
	        );
	        
	     // anyMatch: Check if any name starts with 'S'
	        boolean anyStartWithS = names.stream().anyMatch(
	            name -> name.startsWith("S")
	        );
	        
	     //Grouping By 
	        List<BlogPost> posts = List.of(new BlogPost("Spring", "Ram", BlogPostType.GUIDE, 10),new BlogPost("java", "Ram", BlogPostType.GUIDE, 10)
					           , new BlogPost("HR", "Mansi", BlogPostType.GUIDE, 10)
		                       ,new BlogPost("Marketing", "Meenu", BlogPostType.REVIEW, 10)
					          ,new BlogPost("Operations", "ITI", BlogPostType.NEWS, 10));
	        
	        Map<BlogPostType, List<BlogPost>> postsPerType = posts.stream()
	        		  .collect(groupingBy(BlogPost::getType));

		   System.out.println("Grouping By : " + postsPerType);

	        //Pair as Key
			/*
			 * Map<Pair<BlogPostType, String>, List<BlogPost>> postsPerTypeAndAuthor =
			 * posts.stream() .collect(Collectors.groupingBy(post -> new
			 * ImmutablePair<>(post.getType(), post.getAuthor())));
			 */
	      
	        // Tuple class as key
	        Map<Tuple, List<BlogPost>> postsPerTypeAndAuthor1 = posts.stream()
	        		  .collect(groupingBy(post -> new Tuple(post.getType(), post.getAuthor())));
		     System.out.println("Grouping By  Tuple class as key : " + postsPerType);


	        //Grouping by multiple fields
	        Map<String, Map<BlogPostType, List<BlogPost>>> map = (Map<String, Map<BlogPostType, List<BlogPost>>>) posts.stream()
	        		  .collect(Collectors.groupingBy(BlogPost::getAuthor, Collectors.groupingBy(BlogPost::getType)));

		     System.out.println("Grouping By multiple fields as key : " + postsPerType);

	        //Grouping By average
			 Map<BlogPostType, Double> averageLikesPerType = posts.stream()
			  .collect(groupingBy(BlogPost::getType, averagingInt(BlogPost::getLikes)));


		    System.out.println("Grouping By averagingInt multiple fields as key : " + postsPerType);

	        List<String> collect = posts.stream().map(BlogPost::getTitle).collect(Collectors.toList());
	        
	        Function<BlogPost, String> postMap = new Function<BlogPost, String>() {				
				@Override
				public String apply(BlogPost t) {					
					return t.getTitle();
				}
			};
			 //below one equals to above one
		     Function<BlogPost, String> postMap2 = t -> t.getTitle();
			
			
			List<String> collectFunction1 = posts.stream().map(postMap).collect(Collectors.toList());
			List<String> collectFunction2 = posts.stream().map(postMap2).collect(Collectors.toList());
			
	        Predicate<String> predicate1 = new Predicate<String>() {				
				@Override
				public boolean test(String t) {
					// TODO Auto-generated method stub
					return t.startsWith("S");
				}
			};
			//below one equals to above one
			Predicate<String> predicate2 = t -> t.startsWith("S");
			
			List<String> collectPredicate1 = names.stream().filter(predicate2).collect(Collectors.toList());
			List<String> collectPredicate2 = names.stream().filter(predicate2).collect(Collectors.toList());

		    Consumer<String> consumer = new Consumer<String>() {
				@Override
				public void accept(String s) {
					// operate on String " s "
				}
			};

			ConcurrentHashMap<Integer, String> mapC = new ConcurrentHashMap<>();
			mapC.put(1, "One");
			
			//map.put(null, "Null Key");
	}

}

class BlogPost {
    String title;
    String author;
    BlogPostType type;
    int likes;
    
    public BlogPost(String title, String author, BlogPostType type, int likes) {
		super();
		this.title = title;
		this.author = author;
		this.type = type;
		this.likes = likes;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BlogPostType getType() {
		return type;
	}

	public void setType(BlogPostType type) {
		this.type = type;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	@Override
	public String toString() {
		return "BlogPost{" +
				"title='" + title + '\'' +
				", author='" + author + '\'' +
				", type=" + type +
				", likes=" + likes +
				'}';
	}
}

enum BlogPostType {
    NEWS,
    REVIEW,
    GUIDE
}

class Tuple {
    BlogPostType type;
    String author;
	public Tuple(BlogPostType type, String author) {
		this.type = type;
		this.author = author;
	}
    
    
}


