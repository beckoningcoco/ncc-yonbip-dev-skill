# |<<

**预算任务向导 (tb_tasknavig / nc.vo.tb.ext.task.TbExtTaskNavigate)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5743.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | objname | 向导名称 | objname | varchar(50) |  | 字符串 (String) |
| 3 | paradim | 任务参数 | paradim | text(0) |  | BLOB (BLOB) |
| 4 | pk_org | 管控-创建组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_group | 管控-所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | busisystem | 管控-创建系统 | busisystem | varchar(50) |  | 字符串 (String) |
| 7 | avabusisystem | 管控-可用系统 | avabusisystem | varchar(50) |  | 字符串 (String) |
| 8 | checkvalue | 校验字段 | checkvalue | text(0) |  | BLOB (BLOB) |
| 9 | creator | 审计-创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 审计-创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 审计-修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 审计-最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |