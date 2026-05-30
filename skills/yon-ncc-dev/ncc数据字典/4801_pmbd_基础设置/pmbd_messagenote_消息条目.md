# |<<

**消息条目 (pmbd_messagenote / nc.vo.pmbd.pmmessagenote.MessageNoteVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4565.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_messgenote | 消息条目主键 | pk_messgenote | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 5 | src_pk_bill_b | 来源单据表体主键 | src_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 6 | src_billno | 来源单据号 | src_billno | varchar(40) |  | 字符串 (String) |
| 7 | src_billtype | 来源单据类型 | src_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | messagenote | 消息条目内容 | messagenote | varchar(500) |  | 字符串 (String) |
| 9 | senddate | 发送日期 | senddate | char(19) |  | 日期时间 (UFDateTime) |
| 10 | sender | 发送人 | sender | varchar(20) |  | 用户 (user) |
| 11 | userobject | 参数 | userobject | varchar(100) |  | 字符串 (String) |
| 12 | receiver | 接收人 | receiver | varchar(20) |  | 用户 (user) |