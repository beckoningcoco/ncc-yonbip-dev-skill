# |<<

**离职业务转交日志 (sscrp_billtransmit_log / nc.vo.sscrp.rpbill.RPBillTransmitLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5610.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_log | 主键 | pk_log | char(20) | √ | 主键 (UFID) |
| 2 | billid | 单据主键 | billid | varchar(20) |  | 字符串 (String) |
| 3 | billno | 单据编号 | billno | varchar(30) |  | 字符串 (String) |
| 4 | billtype | 单据类型 | billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | tradetype | 交易类型 | tradetype | varchar(20) |  | 交易类型 (transtype) |
| 6 | oldbillmaker | 单据转出人 | oldbillmaker | varchar(20) |  | 用户 (user) |
| 7 | newbillmaker | 单据接收人 | newbillmaker | varchar(20) |  | 用户 (user) |
| 8 | operator | 操作人 | operator | varchar(20) |  | 用户 (user) |
| 9 | def1 | def1 | def1 | varchar(20) |  | 字符串 (String) |
| 10 | def2 | def2 | def2 | varchar(20) |  | 字符串 (String) |
| 11 | def3 | def3 | def3 | varchar(20) |  | 字符串 (String) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |