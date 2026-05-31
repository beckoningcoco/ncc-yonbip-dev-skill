# |<<

**作业组任务规则 (ssctp_allotrule / nc.vo.ssctp.sscbd.AllotRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5631.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allotrule | 唯一标识 | pk_allotrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_workinggroup | 共享作业组 | pk_workinggroup | char(20) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_sscnode | 共享环节 | pk_sscnode | varchar(20) |  | 作业任务定义 (ssctp_node) |
| 5 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |