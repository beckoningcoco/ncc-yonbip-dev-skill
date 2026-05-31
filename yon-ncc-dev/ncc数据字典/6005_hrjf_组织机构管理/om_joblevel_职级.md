# |<<

**职级 (om_joblevel / nc.vo.om.joblevelsys.JobLevelVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3937.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_joblevel | 职级主键 | pk_joblevel | char(20) | √ | 主键 (UFID) |
| 2 | code | 职级编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 职级名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | dataoriginflag | 分布式 | dataoriginflag | varchar(50) |  | 字符串 (String) |
| 5 | pk_joblevelsys | 职级体系主键 | pk_joblevelsys | varchar(20) |  | 职级类别 (om_joblevelsys) |