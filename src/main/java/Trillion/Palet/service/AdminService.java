package Trillion.Palet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Trillion.Palet.DAO.AdminDAO;
import Trillion.Palet.DTO.ExhibitionDTO;
import Trillion.Palet.DTO.GoodsDTO;
import Trillion.Palet.DTO.MemberDTO;
import Trillion.Palet.DTO.SalesDTO;

@Service
public class AdminService {
		
	@Autowired
	private AdminDAO adao;
	
	// Member Category
	
	public List<MemberDTO> memberSelectByPage(int cpage){
		return adao.memberSelectByPage(cpage);
	}
	
	public String getMemberPageNavi(int cpage) {
		return adao.getMemberPageNavi(cpage);
	}
	
	public int getMemberTotalCount() {
		return adao.getMemberTotalCount();
	}
	
	public void adminMemberModi(MemberDTO dto) {
		adao.adminMemberModi(dto);
	}
	
	public void adminMemberBan(String email) {
		adao.adminMemberBan(email);
	}
	
	public int memberCheckDelete(String email) {
		return adao.adminMemberBan(email);
	}
	
	public int memberCheckUpdate (String email, String grade) {
		return adao.memberCheckUpdate(email, grade);
	}
	
	// Exhibition Category
	
	public List<ExhibitionDTO> exhibitionSelectByPage(int cpage, String value){
		return adao.exhibitionSelectByPage(cpage, value);
	}
	
	public String getExhibitionPageNavi(int cpage) {
		return adao.getExhibitionPageNavi(cpage);
	}
	
	// Goods Category
	
	public List<GoodsDTO> goodsSelectByPage(int cpage){
		return adao.goodsSelectByPage(cpage);
	}
	
	public List<GoodsDTO> goodsJoinSelectByPage(int cpage, String value){
		return adao.goodsJoinSelectByPage(cpage, value);
	}
	
	public String getGoodsPageNavi(int cpage) {
		return adao.getGoodsPageNavi(cpage);
	}
	
	public int goodsCheckDelelte (int g_num) {
		return adao.goodsCheckDelete(g_num);
	}
	
	public int goodsCheckUpdate (String g_num, String e_num) {
		return adao.goodsCheckUpdate(g_num, e_num);
	}
	
	
	// etc..
	
	public List<SalesDTO> getWeekSales(){
		return adao.getWeekSales();
	}
	

}

