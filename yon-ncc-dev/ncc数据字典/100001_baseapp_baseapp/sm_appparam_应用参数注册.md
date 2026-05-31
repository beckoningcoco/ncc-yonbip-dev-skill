# |<<

**应用参数注册 (sm_appparam / nc.vo.platform.workbench.AppParamVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5282.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_param | 主键 | pk_param | char(20) | √ | 主键 (UFID) |
| 2 | paramname | 参数名称 | paramname | varchar(100) |  | 字符串 (String) |
| 3 | paramvalue | 参数值 | paramvalue | varchar(100) |  | 字符串 (String) |
| 4 | parentid | 所属节点 | parentid | varchar(20) |  | 字符串 (String) |