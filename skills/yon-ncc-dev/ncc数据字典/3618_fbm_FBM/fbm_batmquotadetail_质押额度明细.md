# |<<

**质押额度明细 (fbm_batmquotadetail / nc.vo.pfbm.batmquotadetail.BatmquotadetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2112.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batmquotadetail | 主键 | pk_batmquotadetail | char(50) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_fundorg | 资金组织 | pk_fundorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 5 | pk_fundorg_v | 资金组织版本 | pk_fundorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | pk_register | 票据编号 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 7 | billmoney | 票据金额 | billmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | issuedate | 签发日期 | issuedate | char(19) |  | 日期 (UFDate) |
| 9 | enddate | 到期日期 | enddate | char(19) |  | 日期 (UFDate) |
| 10 | businessdate | 业务日期 | businessdate | char(19) |  | 日期 (UFDate) |
| 11 | occunitquota | 占用单位质押额度 | occunitquota | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | releasunitquota | 释放单位质押额度 | releasunitquota | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | occusharequota | 占用共享质押额度 | occusharequota | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | releassharequota | 释放共享质押额度 | releassharequota | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 16 | pk_bill | 来源单据主键 | pk_bill | varchar(50) |  | 字符串 (String) |
| 17 | pk_billtype | 来源单位类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 18 | batmquotatype | 质押池类型 | batmquotatype | varchar(20) |  | 质押池类型 (batmquotatype) |  | BANK=银行质押池; |