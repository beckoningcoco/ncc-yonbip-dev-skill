# |<<

**查询模板系统函数 (pub_query_sysfunc / nc.vo.querytemplate.sysfunc.SysFuncVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4768.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sysfunc | 主键 | pk_sysfunc | char(20) | √ | 主键 (UFID) |
| 2 | sysfunc_code | 系统函数编码 | sysfunc_code | varchar(50) |  | 字符串 (String) |
| 3 | classname | 系统函数类名 | classname | varchar(200) | √ | 备注 (Memo) |
| 4 | layer | 研发层次 | layer | int |  | 整数 (Integer) |
| 5 | moduleid | 所属模块 | moduleid | varchar(50) |  | 字符串 (String) |