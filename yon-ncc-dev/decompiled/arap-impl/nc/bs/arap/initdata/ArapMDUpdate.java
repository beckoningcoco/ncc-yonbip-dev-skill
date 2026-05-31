/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.common.RuntimeEnv
 *  nc.bs.logging.Log
 *  nc.bs.logging.Logger
 *  nc.bs.sm.accountmanage.AbstractPatchInstall
 *  nc.bs.sm.accountmanage.PatchInstallContext
 *  nc.jdbc.framework.processor.ArrayListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.md.persist.designer.service.IPublishService
 *  nc.vo.arap.djlx.DjLXVO
 *  nc.vo.pf.change.ExchangeRuleVO
 *  nc.vo.pf.change.ExchangeVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 */
package nc.bs.arap.initdata;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.NCLocator;
import nc.bs.framework.common.RuntimeEnv;
import nc.bs.logging.Log;
import nc.bs.logging.Logger;
import nc.bs.sm.accountmanage.AbstractPatchInstall;
import nc.bs.sm.accountmanage.PatchInstallContext;
import nc.jdbc.framework.processor.ArrayListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.md.persist.designer.service.IPublishService;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.pf.change.ExchangeRuleVO;
import nc.vo.pf.change.ExchangeVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

public class ArapMDUpdate
extends AbstractPatchInstall {
    private IPublishService service;
    private String[] bmfpath = new String[]{"/modules/arap/METADATA/reminderbill.bmf", "/modules/arap/METADATA/arap_recstatement.bmf", "/modules/arap/METADATA/arapgoldentax.bmf", "/modules/arap/METADATA/payablebill.bmf", "/modules/arap/METADATA/gatheringbill.bmf", "/modules/arap/METADATA/paybill.bmf", "/modules/arap/METADATA/estireceivablebill.bmf", "/modules/arap/METADATA/arapbilltype.bmf"};
    private String[] bpfpath = new String[0];

    public void pulishMetaData(PatchInstallContext context) throws BusinessException {
        String[] ghzc;
        StringBuilder destPath;
        String[] delsqls = new String[]{"delete from md_property where classid in ('d510cc15-e6dc-4aab-8cd7-1f4527effc07','1d4de979-3123-49e5-8c6e-fb5593a04ad8')", "delete from md_property where classid in (select id from md_class where DEFAULTTABLENAME like 'arapgoldentax%')", "delete from md_column where id like 'arapgoldentax%'", "delete from md_ormap where tableid like 'arapgoldentax%'", "delete from md_class where DEFAULTTABLENAME like 'arapgoldentax%'", "delete from md_component where name like 'arapgoldentax%'", "delete from md_association where COMPONENTID in (select id from md_component where name like 'arapgoldentax%')", "delete from MD_ACCESSORPARA where paravalue like 'nc.vo.arap.goldentax%'", "delete from md_association where id='313d96bf-6fb3-4e0d-afea-151a69ac76d5'", "update pub_vochange_b set ruledata='21' where  ruledata='iif(\"Y\" == bitinbill,\"5801\",\"21\")'  and dest_attr='bodys.src_billtype'"};
        try {
            for (String sql : delsqls) {
                this.executeSql(sql);
            }
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        String nchome = RuntimeEnv.getInstance().getNCHome();
        for (String path : this.bmfpath) {
            destPath = new StringBuilder(nchome);
            destPath.append(path);
            try {
                Logger.info((Object)("\u53d1\u5e03\u5143\u6570\u636e\uff1a" + destPath.toString()));
                this.getPublishService().publishMetaDataForBMF(destPath.toString());
            }
            catch (Exception ex) {
                Logger.error((Object)ex.getMessage(), (Throwable)ex);
                throw new BusinessException(ex.getMessage(), (Throwable)ex);
            }
        }
        for (String path : this.bpfpath) {
            destPath = new StringBuilder(nchome);
            destPath.append(path);
            try {
                Logger.info((Object)("\u53d1\u5e03\u5143\u6570\u636e\u64cd\u4f5c\uff1a" + destPath.toString()));
                this.getPublishService().publishMetaDataForBPF(destPath.toString());
            }
            catch (Exception ex) {
                Logger.error((Object)ex.getMessage(), (Throwable)ex);
                throw new BusinessException(ex.getMessage(), (Throwable)ex);
            }
        }
        String sql1 = "update ar_gatheritem set pk_recpaytype=(case when isdiscount='Y' then 'GLOBZ300000000000002' else 'GLOBZ300000000000001' end) where dr=0";
        String sql2 = "update ap_payitem set pk_recpaytype=(case when isdiscount='Y' then 'GLOBZ300000000000002' else 'GLOBZ300000000000001' end) where dr=0";
        String sql3 = "update pub_billtemplet_b set listshowflag='Y',showflag=1 where pk_billtemplet in (select pk_billtemplet from pub_billtemplet where bill_templetname='SYSTEM' and modulecode in ('AR','AP') and (nodecode is null or nodecode in ('200605ERB','20060ARO','20060GBC','200805EPB','20080APO','20080EBM','ArapTerm22'))) and itemkey in ('pk_recpaytype')";
        String sql4 = "update pub_billtemplet_b set reftype='\u8d44\u4ea7\u5361\u7247' where itemkey='facard' and metadataproperty like 'arap%'";
        String sql5 = "update ap_payitem set top_itemid=top_billid where top_billtype like '36D1%'";
        this.executeSql(sql1);
        this.executeSql(sql2);
        this.executeSql(sql3);
        this.executeSql(sql4);
        this.executeSql(sql5);
        String[] faupdatesqls = new String[]{"DELETE FROM PUB_VOCHANGE_B WHERE PUB_VOCHANGE_B.PK_VOCHANGE IN (SELECT PK_VOCHANGE FROM PUB_VOCHANGE WHERE PUB_VOCHANGE.SRC_BILLTYPE in ('4A04','4A05' ,'4A25', '4A28', '4A27') and PUB_VOCHANGE.DEST_BILLTYPE in ('F0','F1') )", "DELETE from pub_billitfdef where  DEST_TRANSTYPE in ('F0','F1') and  SRC_BILLTYPE in ('4A04','4A05' ,'4A25', '4A28', '4A27') ", "DELETE from pub_vochange_s WHERE PK_VOCHANGE IN (SELECT PK_VOCHANGE FROM PUB_VOCHANGE WHERE  DEST_TRANSTYPE in ('FO','F1') and  SRC_BILLTYPE in ('4A04','4A05' ,'4A25', '4A28', '4A27') )", "DELETE from pub_vosplititem WHERE PK_VOSPLITITEM IN (select PK_VOSPLITITEM from pub_vochange_s WHERE PK_VOCHANGE IN (SELECT PK_VOCHANGE FROM PUB_VOCHANGE WHERE  DEST_TRANSTYPE in ('FO','F1') and  SRC_BILLTYPE in ('4A04','4A05' ,'4A25', '4A28', '4A27') ))", "delete FROM PUB_VOCHANGE WHERE PUB_VOCHANGE.SRC_BILLTYPE in ('4A04','4A05' ,'4A25', '4A28', '4A27') and PUB_VOCHANGE.DEST_BILLTYPE in ('F0','F1') "};
        try {
            for (String sql : faupdatesqls) {
                this.executeSql(sql);
            }
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        for (String sql : ghzc = new String[]{"insert into MD_ATTR_POWER (BEANID, DR, FULLPATH, ID, POWERTYPE, TS) values ('6c8584f4-21d4-4ec9-9eac-96ad472acf2f', 0, 'payablebill.bodys.cbs', '1002Z3100000000K6LU4', 'fip', '2014-04-17 16:25:01')", "insert into BD_REF_RELATION (CREFID, DR, ORGTYPE, REFERENCEDTABLEKEY, REFERENCEDTABLENAME, REFERENCINGKEYCOLUMN, REFERENCINGTABLECOLUMN, REFERENCINGTABLENAME, TS) values ('1002Z31000AA00009EQV', 0, null, 'pk_cbsnode', 'bd_cbsnode', null, 'cbs', 'ap_payableitem', '2012-11-13 22:36:10')", "insert into FIP_BILLITEM (ATTRCODE, ATTRNAME, ATTRNAME2, ATTRNAME3, ATTRNAME4, ATTRNAME5, ATTRNAME6, DOCTYPE, DR, PK_BILLITEM, PK_BILLTYPE, PK_GROUP, PK_ORG, POSITION, TS, EXPLANATION, EXPLANATION2, EXPLANATION3, EXPLANATION4, EXPLANATION5, EXPLANATION6) values ('prepay', '\u662f\u5426\u9884\u4ed8\u6b3e', null, null, null, null, null, 'BS000010000100001004', 0, '1003Z3BS000000008K8U', 'F1', '~', '~', 2, '2013-10-12 15:45:43', null, null, null, null, null, null)", "insert into FIP_BILLITEM (ATTRCODE, ATTRNAME, ATTRNAME2, ATTRNAME3, ATTRNAME4, ATTRNAME5, ATTRNAME6, DOCTYPE, DR, PK_BILLITEM, PK_BILLTYPE, PK_GROUP, PK_ORG, POSITION, TS, EXPLANATION, EXPLANATION2, EXPLANATION3, EXPLANATION4, EXPLANATION5, EXPLANATION6) values ('insurance', '\u662f\u5426\u8d28\u4fdd\u91d1', null, null, null, null, null, 'BS000010000100001032', 0, '1003Z3SB000000008K8U', 'F1', '~', '~', 2, '2013-10-12 15:45:43', null, null, null, null, null, null)", "delete from pub_vochange where pk_vochange in (select pk_vochange from pub_vochange where src_billtype in ('4D48','4D50','4D39','4D83','4D52','4D62','36D1') and dest_billtype in ('F1','F3','F2') and  pk_group='global00000000000000') and pk_vochange not in ('1001Z31000000005FFK1','1001Z31000000003WP11','1001Z31000000005Z9A8','1001Z31000000005FFOJ','1001Z310000000045HZL','0001Z310000000002XK8','1001Z310000000048GGL')", "delete from pub_vochange_b where pk_vochange in (select pk_vochange from pub_vochange where src_billtype in ('4D48','4D50','4D39','4D83','4D52','4D62','36D1') and dest_billtype in ('F1','F3','F2') and  pk_group<>'global00000000000000')", "delete from pub_vochange where src_billtype in ('4D48','4D50','4D39','4D83','4D52','4D62','36D1') and dest_billtype in ('F1','F3','F2') and  pk_group<>'global00000000000000'", "insert into MD_PROPERTY (ACCESSORCLASSNAME, ACCESSPOWER, ACCESSPOWERGROUP, ATTRLENGTH, ATTRMAXVALUE, ATTRMINVALUE, ATTRSEQUENCE, CALCULATION, CLASSID, CREATEINDUSTRY, CREATETIME, CREATOR, CUSTOMATTR, DATATYPE, DATATYPESTYLE, DEFAULTVALUE, DESCRIPTION, DISPLAYNAME, DR, DYNAMICATTR, DYNAMICTABLE, FIXEDLENGTH, HELP, HIDED, ID, INDUSTRY, ISACTIVE, ISAUTHEN, MODIFIER, MODIFYTIME, NAME, NOTSERIALIZE, NULLABLE, PRECISE, READONLY, REFMODELNAME, RESID, TS, VERSIONTYPE, VISIBILITY) values (null, 'N', null, 20, null, null, 145, 'N', '091a5f27-e8b7-4538-912d-221730d0ba1c', '0', null, null, 'N', '12d8cb92-64ee-468f-bdfd-5a2f3246ac33', 305, null, null, 'CBS', null, 'N', null, 'N', null, 'N', '8d16822c-2a63-4826-8677-BBBB11f2ae2e', '0', 'Y', null, null, null, 'cbs', 'N', 'Y', 0, 'N', '\u6210\u672c\u5206\u89e3\u7ed3\u6784\u6210\u5458(\u7ec4\u7ec7+\u9879\u76ee)', null, '2014-03-31 10:11:10', 0, 0)", "insert into MD_COLUMN (COLUMNLENGTH, COLUMNSEQUENCE, COLUMNTYPE, CREATETIME, CREATOR, DEFAULTVALUE, DESCRIPTION, DISPLAYNAME, DR, FORLOCALE, GROUPID, HELP, ID, IDENTITIED, INCREMENTSEED, INCREMENTSTEP, ISACTIVE, MODIFIER, MODIFYTIME, NAME, NULLABLE, PKEY, PRECISE, RESID, SQLDATETYPE, TABLEID, TS, VERSIONTYPE) values (20, 145, 0, null, null, '*~', null, 'CBS', null, 'N', null, null, 'ap_payableitem@@@cbs', null, null, null, 'Y', null, null, 'cbs', 'Y', 'N', 0, null, 'varchar', 'ap_payableitem', '2014-03-31 10:11:11', 0)", "insert into MD_ORMAP (ATTRIBUTEID, CLASSID, COLUMNID, DR, TABLEID, TS) values ('8d16822c-2a63-4826-8677-BBBB11f2ae2e', '091a5f27-e8b7-4538-912d-221730d0ba1c', 'ap_payableitem@@@cbs', null, 'ap_payableitem', '2014-03-31 10:11:11')", "update md_component set version=version+1 where id in (select COMPONENTID from md_class where id in ('091a5f27-e8b7-4538-912d-221730d0ba1c'))", "insert into PUB_BILLTEMPLET_B (CARDFLAG, DATATYPE, DEFAULTSHOWNAME, DEFAULTVALUE, DR, EDITFLAG, EDITFORMULA, FOREGROUND, HYPERLINKFLAG, IDCOLNAME, INPUTLENGTH, ITEMKEY, ITEMTYPE, LEAFFLAG, LISTFLAG, LISTHYPERLINKFLAG, LISTSHOWFLAG, LOADFORMULA, LOCKFLAG, METADATAPATH, METADATAPROPERTY, METADATARELATION, NEWLINEFLAG, NULLFLAG, OPTIONS, PK_BILLTEMPLET, PK_BILLTEMPLET_B, PK_CORP, POS, REFTYPE, RESID, RESID_TABNAME, REVISEFLAG, SHOWFLAG, SHOWORDER, TABLE_CODE, TABLE_NAME, TOTALFLAG, TS, USERDEFFLAG, USERDEFINE1, USERDEFINE2, USERDEFINE3, USEREDITFLAG, USERFLAG, USERREVISEFLAG, USERSHOWFLAG, VALIDATEFORMULA, WIDTH) values (1, -1, null, null, 0, 1, null, -1, 'N', null, -1, 'cbs', 0, 'N', 1, 'N', 'N', null, 0, 'cbs', 'arap.payableitem.cbs', null, 'N', 0, null, '1001Z310000000002RJM', '1002Z3100000000K4Z0K', '@@@@', 1, '\u6210\u672c\u5206\u89e3\u7ed3\u6784\u6210\u5458(\u7ec4\u7ec7+\u9879\u76ee),code=N', null, null, 'N', 0, 144, 'bodys', 'bodys', 0, '2014-04-16 20:26:57', 'N', null, null, null, 1, 1, 'N', 1, null, 100)", "INSERT INTO  PUB_BILLTEMPLET_B (CARDFLAG, DATATYPE, DEFAULTSHOWNAME, DEFAULTVALUE, DR, EDITFLAG, EDITFORMULA, FOREGROUND, HYPERLINKFLAG, IDCOLNAME, INPUTLENGTH, ITEMKEY, ITEMTYPE, LEAFFLAG, LISTFLAG, LISTHYPERLINKFLAG, LISTSHOWFLAG, LOADFORMULA, LOCKFLAG, METADATAPATH, METADATAPROPERTY, METADATARELATION, NEWLINEFLAG, NULLFLAG, OPTIONS, PK_BILLTEMPLET, PK_BILLTEMPLET_B, PK_CORP, POS, REFTYPE, RESID, RESID_TABNAME, REVISEFLAG, SHOWFLAG, SHOWORDER, TABLE_CODE, TABLE_NAME, TOTALFLAG, TS, USERDEFFLAG, USERDEFINE1, USERDEFINE2, USERDEFINE3, USEREDITFLAG, USERFLAG, USERREVISEFLAG, USERSHOWFLAG, VALIDATEFORMULA, WIDTH) SELECT CARDFLAG, DATATYPE, DEFAULTSHOWNAME, DEFAULTVALUE, DR, EDITFLAG, EDITFORMULA, FOREGROUND, HYPERLINKFLAG, IDCOLNAME, INPUTLENGTH, ITEMKEY, ITEMTYPE, LEAFFLAG, LISTFLAG, LISTHYPERLINKFLAG, LISTSHOWFLAG, LOADFORMULA, LOCKFLAG, METADATAPATH, METADATAPROPERTY, METADATARELATION, NEWLINEFLAG, NULLFLAG, OPTIONS, B.PK_BILLTEMPLET, substr(B.PK_BILLTEMPLET,4,17) ||substr(ITEMKEY,0,3) , PK_CORP, POS, REFTYPE, RESID, RESID_TABNAME, REVISEFLAG, SHOWFLAG, SHOWORDER, TABLE_CODE, TABLE_NAME, TOTALFLAG, TS, USERDEFFLAG, USERDEFINE1, USERDEFINE2, USERDEFINE3, USEREDITFLAG, USERFLAG, USERREVISEFLAG, USERSHOWFLAG, VALIDATEFORMULA, WIDTH FROM  (SELECT * FROM PUB_BILLTEMPLET_b WHERE PK_BILLTEMPLEt='1001Z310000000002RJM' AND ITEMKEY NOT IN (SELECT ITEMKEY FROM PUB_BILLTEMPLET_b WHERE PK_BILLTEMPLET IN (SELECT PK_BILLTEMPLET FROM PUB_BILLTEMPLET WHERE METADATACLASS='arap.payablebill' AND PK_BILLTEMPLET<>'1001Z310000000002RJM')))A INNER JOIN (SELECT PK_BILLTEMPLET FROM PUB_BILLTEMPLET WHERE METADATACLASS='arap.payablebill' AND PK_BILLTEMPLET<>'1001Z310000000002RJM') b ON 1=1", "insert into pub_vochange_b(PK_VOCHANGE_B,DEST_ATTR,DR,PK_VOCHANGE,RULEDATA,RULETYPE,TS) values('1002Z3AABC00000KADAW','bodys.src_itemid',0,'1001Z31000000003WP11','bodyvos.pk_feebalance_b',2,'2014-04-16 14:49:48')"}) {
            try {
                this.executeSql(sql);
            }
            catch (Exception ex) {
                Logger.error((Object)ex.getMessage(), (Throwable)ex);
            }
        }
        List groups = (List)new BaseDAO().executeQuery("select pk_group from org_group", new ResultSetProcessor(){
            private List<String> pks = new ArrayList<String>();

            public Object handleResultSet(ResultSet rs) throws SQLException {
                while (rs.next()) {
                    this.pks.add(rs.getString(1));
                }
                return this.pks;
            }
        });
        BaseDAO baseDAO = new BaseDAO();
        try {
            Collection vos = baseDAO.retrieveByClause(ExchangeVO.class, "src_billtype in ('4D48','4D50','4D39','4D83','4D52','4D62','36D1') and dest_billtype in ('F1','F3','F2') and  pk_group='global00000000000000'");
            for (String pkgroup : groups) {
                for (ExchangeVO vo : vos) {
                    Collection ssvos = new BaseDAO().retrieveByClause(ExchangeRuleVO.class, " pk_vochange='" + vo.getPk_vochange() + "' ");
                    ExchangeVO cvo = (ExchangeVO)vo.clone();
                    cvo.setPk_vochange(null);
                    cvo.setPk_group(pkgroup);
                    String pk_vochange = this.doInsert(baseDAO, cvo);
                    for (ExchangeRuleVO s : ssvos) {
                        s.setPk_vochange(pk_vochange);
                        s.setPk_vochange_b(null);
                        this.doInsert(baseDAO, s);
                    }
                }
            }
        }
        catch (Exception e) {
            Log.getInstance(((Object)((Object)this)).getClass()).error((Object)("twe:" + e.getMessage()), (Throwable)e);
        }
        try {
            Collection sourcevos = baseDAO.retrieveByClause(DjLXVO.class, " pk_group ='GLOBLE00000000000000' and djlxbm='D2' ");
            ArrayList pk_groupss = (ArrayList)baseDAO.executeQuery("select pk_group from arap_billtype where djlxbm='D0' and pk_group not in (select pk_group  from arap_billtype where djlxbm='D2')", (ResultSetProcessor)new ArrayListProcessor());
            ArrayList<DjLXVO> indbs = new ArrayList<DjLXVO>();
            Iterator iterator = pk_groupss.iterator();
            while (iterator.hasNext()) {
                Object[] pk_groups;
                for (Object pk_group : pk_groups = (Object[])iterator.next()) {
                    DjLXVO[] copyOf;
                    for (DjLXVO sysvo : copyOf = Arrays.copyOf(sourcevos.toArray(new DjLXVO[0]), sourcevos.size())) {
                        sysvo.setPk_group((String)pk_group);
                        sysvo.setPrimaryKey(null);
                    }
                    indbs.addAll(Arrays.asList(copyOf));
                }
            }
            baseDAO.insertVOArray((SuperVO[])indbs.toArray(new DjLXVO[0]));
        }
        catch (Exception e) {
            Log.getInstance(((Object)((Object)this)).getClass()).error((Object)("twe:" + e.getMessage()), (Throwable)e);
        }
    }

    private String doInsert(BaseDAO baseDAO, ExchangeVO cvo) throws DAOException {
        return baseDAO.insertVO((SuperVO)cvo);
    }

    private void doInsert(BaseDAO baseDAO, ExchangeRuleVO s) throws DAOException {
        baseDAO.insertVO((SuperVO)s);
    }

    private void executeSql(String sql) throws DAOException {
        new BaseDAO().executeUpdate(sql);
    }

    public IPublishService getPublishService() {
        if (this.service == null) {
            this.service = (IPublishService)NCLocator.getInstance().lookup(IPublishService.class);
        }
        return this.service;
    }
}

