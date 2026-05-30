# |<<

**内部池额度明细 (fbm_innerbillpooldetail / nc.vo.pfbm.innerbillpooldetail.InnerbillpooldetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2138.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billpooldetail | 主键 | pk_billpooldetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 3 | pk_org_v | 资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 4 | pk_finorg | 财务组织 | pk_finorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_finorg_v | 财务组织版本 | pk_finorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | note_no | 票据编号 | note_no | varchar(50) |  | 字符串 (String) |
| 7 | pk_register | 票据主键 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 8 | billmoney | 票据金额 | billmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | pooldate | 出入池日期 | pooldate | char(19) |  | 日期 (UFDate) |
| 10 | enddate | 到期日期 | enddate | char(19) |  | 日期 (UFDate) |
| 11 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 12 | pk_banktype | 银行类别 | pk_banktype | varchar(20) |  | 银行类别 (banktype) |
| 13 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 14 | pk_bill | 来源单据主键 | pk_bill | varchar(20) |  | 字符串 (String) |
| 15 | pk_billtype | 来源单据类型 | pk_billtype | varchar(20) |  | 字符串 (String) |
| 16 | billpooltype | 票据池类型 | billpooltype | varchar(20) |  | 票据池类型 (billpooltype) |  | pledge=质押; |