package basic;

import java.sql.SQLException;
import java.util.ArrayList;

public interface SimpleDao {
	public ArrayList<SimpleDto> list(String searchWord) throws SQLException;
	public ArrayList<SimpleDto> list() throws SQLException;
	public SimpleDto detail(int col_id) throws SQLException;
	public int delete(SimpleDto dto) throws SQLException;
	public int update(SimpleDto dto) throws SQLException;
	public int insert(SimpleDto dto) throws SQLException;
	public int insertWithoutDefaultValue(SimpleDto dto) throws SQLException;
	public int insertDup(SimpleDto dto) throws SQLException;
	public int insert2(SimpleDto dto) throws SQLException;
}
