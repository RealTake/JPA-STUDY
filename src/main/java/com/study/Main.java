package com.study;

import com.study.entity.Child;
import com.study.entity.Member;
import com.study.entity.Parent;
import com.study.entity.Team;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import javax.swing.text.html.parser.Entity;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        //code

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
/*
            Team team = new Team();
            team.setTeamNm("A팀");
            team.setTeamDesc("A팀 설명");
            em.persist(team);


            Member member = new Member();
            member.setName("최고급");
            member.setEmail("test@naver.com");
            member.setTeam(team);

            em.persist(member);*/

            Child child1 = new Child();
            Child child2 = new Child();

            Parent parent = new Parent();
            parent.addChild(child1);
            parent.addChild(child2);

            em.persist(parent);
            em.persist(child1);
            em.persist(child2);


            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}