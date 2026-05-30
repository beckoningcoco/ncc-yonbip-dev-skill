# |<<

**查询指标 (pub_guideline / nc.vo.uap.guideline.GuidelineVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4731.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_guideline | 主键 | pk_guideline | char(20) | √ | 主键 (UFID) |
| 2 | funcode | 所属节点号 | funcode | varchar(20) | √ | 字符串 (String) |
| 3 | code | 指标编码 | code | varchar(50) | √ | 字符串 (String) |
| 4 | name | 指标名称 | name | varchar(50) | √ | 字符串 (String) |
| 5 | detail | 指标描述 | detail | varchar(1024) |  | 字符串 (String) |
| 6 | defaultvalue | 默认值 | defaultvalue | varchar(50) | √ | 字符串 (String) |