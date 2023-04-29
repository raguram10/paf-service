package org.example.Service;

//import org.example.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service

public class Service {
    //@Autowired
    //Reposistry reposistry;

    public boolean getId(int id)
    {
        if(id%2==0)
        {
            return new Boolean(true);
        }
        else
        {
            return new Boolean(false);
        }

    }
    public String getName(String name)
    {
//        Student student=new Student();
//        student.setName(name);
        //reposistry.save(student);
        return name.charAt(0)+""+name.charAt(name.length()-1);
    }
}
