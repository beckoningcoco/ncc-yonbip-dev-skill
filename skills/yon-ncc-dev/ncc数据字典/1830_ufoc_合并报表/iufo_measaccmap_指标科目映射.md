# |<<

**指标科目映射 (iufo_measaccmap / nc.vo.hbbb.account.MeasureAccountMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3475.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_measuremap | 主键 | pk_measuremap | char(20) | √ | 主键 (UFID) |
| 2 | repname | 报表名称 | repname | varchar(50) |  | 字符串 (String) |
| 3 | measurename | 指标名称 | measurename | varchar(50) |  | 字符串 (String) |
| 4 | measurepos | 指标位置 | measurepos | varchar(50) |  | 字符串 (String) |
| 5 | keyname | 关键字名称 | keyname | varchar(50) |  | 字符串 (String) |
| 6 | pk_measure | 指标主键 | pk_measure | varchar(50) |  | 字符串 (String) |
| 7 | pk_report | 报表主键 | pk_report | varchar(20) |  | 采集表信息 (reportinfo) |
| 8 | pk_hbaccount | 合并科目金额属性 | pk_hbaccount | varchar(50) |  | 字符串 (String) |
| 9 | isquantity | 数量核算 | isquantity | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | amounttype | 金额性质 | amounttype | int |  | 金额性质类型 (amoutpropenum) |  | 1=年初余额; |