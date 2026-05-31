/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.logging.Logger
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.bd.ref.RefInfoVO
 *  nc.vo.pub.BusinessException
 *  nccloud.pubitf.arap.arappub.IQueryObjsService
 */
package nccloud.pubimpl.arap.arappub;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.logging.Logger;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.bd.ref.RefInfoVO;
import nc.vo.pub.BusinessException;
import nccloud.pubitf.arap.arappub.IQueryObjsService;

public class QueryObjsServiceImpl
implements IQueryObjsService {
    public List<RefInfoVO> queryRefurl(String[] refName) throws BusinessException {
        String sql = "select name,refclass,refpath,istreelazyload,para1 from bd_refinfo where name in( ";
        StringBuffer st = new StringBuffer(sql);
        for (int i = 0; i < refName.length; ++i) {
            if (i == refName.length - 1) {
                st.append(" '" + refName[i] + "'");
                break;
            }
            st.append(" '" + refName[i] + "',");
        }
        st.append(")");
        BaseDAO dao = new BaseDAO();
        final ArrayList<RefInfoVO> result = new ArrayList<RefInfoVO>();
        final ArrayList namelist = new ArrayList();
        try {
            dao.executeQuery(st.toString(), new ResultSetProcessor(){
                private static final long serialVersionUID = 1L;

                public Object handleResultSet(ResultSet rs) throws SQLException {
                    while (rs.next()) {
                        if (namelist.contains(rs.getString("name")) && "Y".equals(rs.getString("istreelazyload"))) continue;
                        namelist.add(rs.getString("name"));
                        RefInfoVO refVo = new RefInfoVO();
                        refVo.setName(rs.getString("name"));
                        refVo.setRefclass(rs.getString("refclass"));
                        refVo.setRefpath(rs.getString("refpath"));
                        if (rs.getString("para1") != null) {
                            refVo.setPara1(rs.getString("para1"));
                        }
                        result.add(refVo);
                    }
                    return rs;
                }
            });
        }
        catch (DAOException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        return result;
    }
}

