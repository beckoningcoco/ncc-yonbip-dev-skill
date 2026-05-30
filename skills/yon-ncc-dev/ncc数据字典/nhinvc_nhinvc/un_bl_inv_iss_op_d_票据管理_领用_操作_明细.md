# |<<

**票据管理_领用_操作_明细 (un_bl_inv_iss_op_d / com.yonyou.yh.nhis.bl.invc.vo.BlinvctransDtailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6297.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invissd | 票据领用操作明细 | pk_invissd | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_invissop | 票据领用操作 | pk_invissop | varchar(20) |  | 票据管理_领用_操作 (BlinvctransVO) |
| 5 | pk_psn_inv | 领用人 | pk_psn_inv | varchar(20) |  | 人员基本信息 (psndoc) |
| 6 | pk_invisspk | 票据包领用 | pk_invisspk | varchar(20) |  | 票据管理_领用_票据包 (blinvcisspk) |
| 7 | date_iss | 领用日期 | date_iss | char(19) |  | 日期 (UFDate) |
| 8 | num_begin | 票据开始号 | num_begin | varchar(50) |  | 字符串 (String) |
| 9 | num_end | 票据结束号 | num_end | varchar(50) |  | 字符串 (String) |
| 10 | invcn | 票据张数 | invcn | int |  | 整数 (Integer) |
| 11 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 12 | pk_org_v | 所属组织版本信息 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 13 | pk_invcate | 票据分类 | pk_invcate | varchar(20) |  | 票据分类 (InvCateVO) |