<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE tiles-definitions PUBLIC
"-//Apache Software Foundation//DTD Tiles Configuration 2.0//EN"
"http://tiles.apache.org/dtds/tiles-config_2_0.dtd">
<tiles-definitions>
   <definition name="baseLayout"  template="/WEB-INF/views/common/layout.jsp">
      <put-attribute name="title" value="" />
      <put-attribute name="header" value="/WEB-INF/views/common/header.jsp" />
      <put-attribute name="body" value="" />
      <put-attribute name="footer" value="/WEB-INF/views/common/footer.jsp" />
   </definition>
<!--  
   <definition name="main" extends="baseLayout">
      <put-attribute name="title" value="메인페이지" />
      <put-attribute name="body" value="/WEB-INF/views/main.jsp" />
   </definition>
-->
   <definition name="*/*" extends="baseLayout">
      <put-attribute name="title" value="금도끼은도끼" />
      <put-attribute name="body" value="/WEB-INF/views/{1}/{2}.jsp" />
   </definition>  
 <!--  
    <definition name="/hm/JoinForm" extends="baseLayout">
      <put-attribute name="title" value="금도끼은도끼|플리마켓 입점 신청창" />
      <put-attribute name="body" value="/WEB-INF/views/hm/JoinForm.jsp" />
   </definition>  
    
   <definition name="/member/loginForm" extends="baseLayout">
      <put-attribute name="title" value="로그인창" />
      <put-attribute name="body" value="/WEB-INF/views/member/loginForm.jsp" />
   </definition>

   <definition name="/board/listArticles" extends="baseLayout">
      <put-attribute name="title" value="글목록창" />
      <put-attribute name="body" value="/WEB-INF/views/board/listArticles.jsp" />
   </definition>
   
   <definition name="/board/articleForm" extends="baseLayout">
      <put-attribute name="title" value="글쓰기창" />
      <put-attribute name="body" value="/WEB-INF/views/board/articleForm.jsp" />
   </definition>   
   
   <definition name="/board/viewArticle" extends="baseLayout">
    <put-attribute name="title" value="글상세창" />
    <put-attribute name="body" value="/WEB-INF/views/board/viewArticle.jsp" />
  </definition>
 --> 
   
<!-- 
   <definition name="/member/memberForm" extends="baseLayout">
      <put-attribute name="title" value="회원등록창" />
      <put-attribute name="body" value="/WEB-INF/views/member/memberForm.jsp" />
   </definition>

   <definition name="/member/viewDetail" extends="baseLayout">
      <put-attribute name="title" value="회원상세창" />
      <put-attribute name="body" value="/WEB-INF/views/member/viewDetail.jsp" />
   </definition> -->
</tiles-definitions>
