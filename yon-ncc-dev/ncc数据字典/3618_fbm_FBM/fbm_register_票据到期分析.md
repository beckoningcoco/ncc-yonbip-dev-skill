# |<<

**票据到期分析 (fbm_register / nc.vo.fbm.billacc.EndAnalysisRptHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2153.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_register | 主键 | pk_register | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 4 | pk_curr | 币种 | pk_curr | varchar(50) |  | 字符串 (String) |
| 5 | totalmoney | 合计金额 | totalmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | pk_register_b | 字表主键 | pk_register_b | char(0) |  | 票据到期分析子表 (fbm_endanalysisb) |
| 7 | enddate | 到期日期 | enddate | char(19) |  | 日期 (UFDate) |
| 8 | money | 票据金额 | money | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | olcmoney | 票据金额组织本币 | olcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | glcmoney | 票据金额集团本币 | glcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | gllcmoney | 票据金额全局本币 | gllcmoney | decimal(28, 8) |  | 金额 (UFMoney) |