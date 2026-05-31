# |<<

**票据管理_领用_明细 (uh_bl_inv_iss_dt / com.yonyou.yh.nhis.bl.invc.vo.BlInvcissDtDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5934.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invissdt | 票据领用明细主键 | pk_invissdt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_inviss | 票据领用 | pk_inviss | varchar(20) |  | 票据领用 (BlInvcissDtVO) |
| 5 | pk_invcate | 票据分类 | pk_invcate | varchar(20) |  | 票据分类 (InvCateVO) |
| 6 | pk_psn_iss | 领用人员 | pk_psn_iss | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | date_iss | 领用日期 | date_iss | char(19) |  | 日期 (UFDate) |
| 8 | pk_invregpk | 登记票据包 | pk_invregpk | varchar(20) |  | 票据管理_登记_票据包 (blinvcregpkg) |
| 9 | num_begin | 领用票据开始号 | num_begin | varchar(50) |  | 字符串 (String) |
| 10 | num_end | 领用票据结束号 | num_end | varchar(50) |  | 字符串 (String) |
| 11 | invcn | 领用票据张数 | invcn | int |  | 整数 (Integer) |
| 12 | pk_invissd_trans | 对应转移操作时明细 | pk_invissd_trans | varchar(20) |  | 字符串 (String) |
| 13 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 14 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |