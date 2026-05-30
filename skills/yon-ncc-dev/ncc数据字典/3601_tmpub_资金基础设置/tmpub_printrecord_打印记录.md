# |<<

**打印记录 (tmpub_printrecord / nc.vo.pub.PrintrecordVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5770.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printrecord | 主键 | pk_printrecord | char(20) | √ | 主键 (UFID) |
| 2 | ifformal | 是否正式打印 | ifformal | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | pk_corp | 组织集团主键 | pk_corp | varchar(20) |  | 字符串 (String) |
| 4 | pk_sourcepk | 来源主键 | pk_sourcepk | varchar(20) |  | 字符串 (String) |
| 5 | printtime | 打印时间 | printtime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | voperator | 操作人员 | voperator | varchar(20) |  | 用户 (user) |