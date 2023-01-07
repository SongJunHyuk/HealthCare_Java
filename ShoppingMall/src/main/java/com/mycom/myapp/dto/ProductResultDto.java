package com.mycom.myapp.dto;

import java.util.List;

public class ProductResultDto {
   private int result; // 등록, 수정, 삭제 의 결과
   
   private ProductDto dto; // 상품 1건 상세의 결과
   
   private List<ProductDto> list; // 상품 목록의 결과
   
   public int getResult() {
      return result;
   }
   public void setResult(int result) {
      this.result = result;
   }
   public ProductDto getDto() {
      return dto;
   }
   public void setDto(ProductDto dto) {
      this.dto = dto;
   }
   public List<ProductDto> getList() {
      return list;
   }
   public void setList(List<ProductDto> list) {
      this.list = list;
   }
   
   public ProductResultDto() {}
   public ProductResultDto(int result, ProductDto dto, List<ProductDto> list) {
      super();
      this.result = result;
      this.dto = dto;
      this.list = list;
   }
   
   @Override
   public String toString() {
      return "ProductResultDto [result=" + result + ", dto=" + dto + ", list=" + list + "]";
   }   
}