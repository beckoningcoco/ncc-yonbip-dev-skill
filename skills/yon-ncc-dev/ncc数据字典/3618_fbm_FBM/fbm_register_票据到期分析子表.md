# |<<

**票据到期分析子表 (fbm_register / nc.vo.fbm.billacc.EndAnalysisRptBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2150.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_register_b | 主键 | pk_register_b | char(20) | √ | 主键 (UFID) |
| 2 | money | 票据金额 | money | decimal(28, 8) |  | 金额 (UFMoney) |
| 3 | daterange | 日期区间 | daterange | varchar(50) |  | 字符串 (String) |
| 4 | olcmoney | 票据金额组织本币 | olcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | glcmoney | 票据金额集团本币 | glcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | gllcmoney | 票据金额全局本币 | gllcmoney | decimal(28, 8) |  | 金额 (UFMoney) |