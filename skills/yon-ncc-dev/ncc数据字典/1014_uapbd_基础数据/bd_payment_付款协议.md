# |<<

**付款协议 (bd_payment / nc.vo.bd.payment.PaymentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/920.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payment | 付款协议主键 | pk_payment | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 协议号 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 协议名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | effectdate | 协议生效日期 | effectdate | char(19) | √ | 日期(开始) (UFDateBegin) |
| 7 | diseffectdate | 协议失效日期 | diseffectdate | char(19) |  | 日期(结束) (UFDateEnd) |
| 8 | meno | 备注 | meno | varchar(1024) |  | 备注 (Memo) |
| 9 | dataoriginflag | 数据来源 | dataoriginflag | smallint |  | 数据来源 (dataorigin) |  | 0=本级产生; |