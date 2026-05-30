# |<<

**模块信息 (dap_dapsystem / nc.vo.sm.funcreg.ModuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1688.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | moduleid | 模块号 | moduleid | varchar(50) | √ | 字符串 (String) |
| 2 | systypecode | 模块编码 | systypecode | varchar(50) | √ | 字符串 (String) |
| 3 | systypename | 模块名称 | systypename | varchar(50) |  | 字符串 (String) |
| 4 | parentcode | 父模块编码 | parentcode | varchar(20) |  | 模块信息 (module) |
| 5 | devmodule | 对应模块号 | devmodule | varchar(50) |  | 字符串 (String) |
| 6 | orgtypecode | 组织类型 | orgtypecode | varchar(50) |  | 组织类型枚举 (orgtypeEnumx) |
| 7 | appscope | 应用范围 | appscope | int |  | 应用范围 (enumss) |  | 0=全局; |