# |<<

**费用调整单关联 (er_adjustassociate / nc.vo.erm.adjustassociate.AdjustAssociateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1875.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_associate | 主键 | pk_associate | varchar(50) | √ | 字符串 (String) |
| 2 | tzd_billid | 费用调整单主键 | tzd_billid | varchar(50) |  | 字符串 (String) |
| 3 | tzd_billno | 费用调整单单据号 | tzd_billno | varchar(50) |  | 字符串 (String) |
| 4 | tzd_tradetype | 费用调整单交易类型 | tzd_tradetype | varchar(50) |  | 字符串 (String) |
| 5 | ass_billid | 关联单据主键 | ass_billid | varchar(50) |  | 字符串 (String) |
| 6 | ass_billno | 关联单据号 | ass_billno | varchar(50) |  | 字符串 (String) |
| 7 | ass_billtype | 关联单据类型 | ass_billtype | varchar(50) |  | 字符串 (String) |
| 8 | ass_tradetype | 关联交易类型 | ass_tradetype | varchar(50) |  | 字符串 (String) |
| 9 | ass_rpbillid | 关联单据rp主键 | ass_rpbillid | varchar(50) |  | 字符串 (String) |
| 10 | ts | 时间 | ts | char(19) |  | 日期时间 (UFDateTime) |