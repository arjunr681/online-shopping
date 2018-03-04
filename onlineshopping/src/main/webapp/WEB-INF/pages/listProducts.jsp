<div class="container">
  <div class="row">
  <!-- to display the side bar -->
       <div class="col-md-3">
          <%@include file="./commonApp/sidebar.jsp" %>
        </div>
        
        <!-- to display the list of products -->
        <div class="col-md-9">
            <div class="row">
               <div class="col-lg-12">
                  <c:if test="${userClickProducts == true}">
                     <ol class="breadcrumb">
                        <li><a href="${contextRoot}/home">Home</a></li>
                        <li class="active">All Products</li>
                     </ol>
                  </c:if>
                  
                      <c:if test="${userClickCategoryProducts==true}">
                     <ol class="breadcrumb">
                        <li><a href="${contextRoot}/home">Home</a></li>
                         <li class="active">Category</li>
                        <li class="active">${category.name}</li>
                     </ol>
                  </c:if>
               </div>
            </div>
        </div>
   </div>
</div>