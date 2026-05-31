# |<<

**海鹚支付交易记录 (uh_bd_payrecord / com.yonyou.yh.nhis.bd.payer.vo.HcPayRecordVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5915.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payrecord | 主键 | pk_payrecord | char(20) | √ | 主键 (UFID) |
| 2 | receive | 接收xml串 | receive | varchar(50) |  | 字符串 (String) |
| 3 | send | 发送xml串 | send | varchar(50) |  | 字符串 (String) |
| 4 | pk_paypv | 住院就诊收付款主键 | pk_paypv | varchar(50) |  | 字符串 (String) |
| 5 | pk_paypati | 门诊就诊收付款主键 | pk_paypati | varchar(50) |  | 字符串 (String) |
| 6 | eu_status | 交易状态 | eu_status | varchar(50) |  | 字符串 (String) |
| 7 | eu_pvtype | 就诊类型 | eu_pvtype | varchar(50) |  | 字符串 (String) |
| 8 | eu_direct | 收退方向 | eu_direct | varchar(50) |  | 字符串 (String) |
| 9 | tradetype | 交易类型 | tradetype | varchar(50) |  | 字符串 (String) |
| 10 | flag_inner | 内外部系统 | flag_inner | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | note | 交易说明 | note | varchar(50) |  | 字符串 (String) |
| 12 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 15 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |