# |<<

**接收规则 (adp_receiverrule / nc.vo.uap.distribution.syscatalog.ReceiverRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/19.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receiverrule | 主键 | pk_receiverrule | char(20) | √ | 主键 (UFID) |
| 2 | relationendid | 接收系统 | relationendid | varchar(20) |  | 分布系统目录 (syscatalog) |
| 3 | relationcode | 规则编码 | relationcode | varchar(50) |  | 字符串 (String) |
| 4 | relationname | 规则名称 | relationname | varchar(200) |  | 多语文本 (MultiLangText) |