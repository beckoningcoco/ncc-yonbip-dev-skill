# |<<

**审核执行结果 (ufoe_checkexeresult / nc.vo.iufo.checkexecute.CheckExeResultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5899.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_result | 主键 | pk_result | char(20) | √ | 主键 (UFID) |
| 2 | checkcontent | 审核内容 | checkcontent | varchar(50) |  | 字符串 (String) |
| 3 | checkstatus | 审核结果 | checkstatus | char(50) |  | 审核结果 (checkstatus) |  | 3=通过; |