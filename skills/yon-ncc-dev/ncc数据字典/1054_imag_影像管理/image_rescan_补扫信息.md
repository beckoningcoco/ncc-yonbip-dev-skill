# |<<

**补扫信息 (image_rescan / nc.vo.image.ImageRescanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3127.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rescan | 主键 | pk_rescan | varchar(20) | √ | 字符串 (String) |
| 2 | pk_bill | 单据主键 | pk_bill | varchar(20) |  | 字符串 (String) |
| 3 | billno | 单据编号 | billno | varchar(50) |  | 字符串 (String) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 5 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 6 | pk_tradetype | 交易类型 | pk_tradetype | varchar(50) |  | 字符串 (String) |
| 7 | billmaker | 制单人 | billmaker | varchar(20) |  | 字符串 (String) |
| 8 | billdate | 单据日期 | billdate | varchar(20) |  | 字符串 (String) |
| 9 | amount | 金额 | amount | varchar(50) |  | 字符串 (String) |
| 10 | rescanman | 补扫人 | rescanman | varchar(20) |  | 字符串 (String) |
| 11 | rescantime | 补扫时间 | rescantime | varchar(20) |  | 字符串 (String) |
| 12 | ts | 时间 | ts | char(19) |  | 日期时间 (UFDateTime) |