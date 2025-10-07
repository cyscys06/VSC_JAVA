package section5.practice5;

import section5.myclass5.MemberConstruct;

public class practice5_2 
{
    public static void main(String[] args) 
    {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16);
        
        MemberConstruct[] members = {member1, member2};
        
        for (MemberConstruct s : members) 
        {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}