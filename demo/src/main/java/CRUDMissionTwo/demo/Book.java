package CRUDMissionTwo.demo;

import lombok.*;


@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor

public class Book {

    private Integer bookID;
    private String bookName;
    private Integer bookPrice;
    private String bookAuthor;
    private String bookGenre;

} 
