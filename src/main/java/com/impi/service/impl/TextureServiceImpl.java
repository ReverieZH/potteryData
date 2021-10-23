/*    */ package com.impi.service.impl;

/*    */
/*    */ import com.github.pagehelper.PageHelper;
/*    */ import com.impi.domain.Texture;
/*    */ import com.impi.mapper.TextureMapper;
/*    */ import com.impi.service.TextureService;
/*    */ import java.util.List;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ @Service
/*    */ public class TextureServiceImpl
/*    */   implements TextureService
/*    */ {
/*    */   @Autowired
/*    */   private TextureMapper textureMapper;
/*    */   
/*    */   public List<Texture> selectAll() {
/* 19 */     return this.textureMapper.selectAll();
/*    */   }
/*    */ 
/*    */   
/*    */   public List<Texture> findAllByPage(int pageNum, int pageSize) {
/* 24 */     PageHelper.startPage(pageNum, pageSize);
/* 25 */     return this.textureMapper.selectAll();
/*    */   }
/*    */ 
/*    */   
/*    */   public Texture selectByKey(Integer code) {
/* 30 */     return (Texture)this.textureMapper.selectByPrimaryKey(code);
/*    */   }
/*    */ 
/*    */   
/*    */   public int insert(Texture texture) {
/* 35 */     return this.textureMapper.insert(texture);
/*    */   }
/*    */ 
/*    */   
/*    */   public int update(Texture texture) {
/* 40 */     return this.textureMapper.updateByPrimaryKeySelective(texture);
/*    */   }
/*    */ 
/*    */   
/*    */   public int delete(Integer code) {
/* 45 */     return this.textureMapper.deleteByPrimaryKey(code);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCount() {
/* 50 */     return this.textureMapper.getCount();
/*    */   }
/*    */ }


/* Location:              E:\pottery-0.0.1-SNAPSHOT.jar!\BOOT-INF\classes\com\impi\service\impl\TextureServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */