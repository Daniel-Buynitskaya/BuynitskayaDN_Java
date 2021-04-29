package Decorator;

import hierarchy.Appliances;

public class Add_comment extends Decorator{
    Appliances appliances;
    private int Evaluation;
    public int getEvaluation(){return Evaluation;}
    private String Comment;
    public String getComment(){return Comment;}
    public Add_comment (Appliances appliances, int evaluation, String comment){
        super(appliances);
        this.appliances=appliances;
        Evaluation=evaluation;
        Comment=comment;
    }
    public void getDescription() {
        appliances.getDescription();
        System.out.printf("\n Оценка по пятибальной шкале: %s.\n" +
                " Комментарий: %s", getEvaluation(), getComment());
    }
}
