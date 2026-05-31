# |<<

**任务引用方案 (iufo_taskscheme / nc.vo.iufo.task.TaskSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3524.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskscheme | 主键 | pk_taskscheme | char(20) | √ | 主键 (UFID) |
| 2 | pk_task | 任务主键 | pk_task | varchar(50) |  | 字符串 (String) |
| 3 | pk_scheme | 审核方案主键 | pk_scheme | varchar(20) |  | 审核方案 (CheckSchemaVO) |
| 4 | scheme_type | 方案类型 | scheme_type | int |  | 整数 (Integer) |
| 5 | scheme_order | 方案序号 | scheme_order | int |  | 整数 (Integer) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |