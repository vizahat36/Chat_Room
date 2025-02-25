package com.chatboat.chat.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatboat.chat.model.chatmod;

public interface ChatMessageRepo extends JpaRepository<chatmod,Long>{

}
