# |<<

**功能实体 (sm_funcregister / nc.vo.sm.funcreg.FuncRegisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5305.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | funcode | 功能编码 | funcode | varchar(50) | √ | 字符串 (String) |
| 2 | cfunid | 主键 | cfunid | char(20) |  | 主键 (UFID) |
| 3 | fun_name | 功能名称 | fun_name | varchar(200) |  | 字符串 (String) |
| 4 | fun_desc | 功能描述 | fun_desc | varchar(50) |  | 字符串 (String) |
| 5 | class_name | 功能类名 | class_name | varchar(200) |  | 字符串 (String) |
| 6 | isenable | 是否启用 | isenable | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | help_name | 帮助文件名 | help_name | varchar(50) |  | 字符串 (String) |
| 8 | own_module | 所属模块 | own_module | varchar(20) |  | 模块信息 (module) |
| 9 | fun_property | 功能性质 | fun_property | int |  | 功能性质 (functionPropertyEnum) |
| 10 | isbuttonpower | 是否启用业务活动权限 | isbuttonpower | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | orgtypecode | 组织类型 | orgtypecode | varchar(50) |  | 组织类型枚举 (orgtypeEnumx) |
| 12 | funtype | 功能点类型 | funtype | int |  | 功能类型枚举 (functiontypeenum) |
| 13 | parent_id | 外键 | parent_id | char(20) |  | 字符串 (String) |
| 14 | isfunctype | 是否功能分类 | isfunctype | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | mdid | 关联元数据ID | mdid | varchar(36) |  | 实体 (entity) |
| 16 | iscauserusable | 是否CA用户可用 | iscauserusable | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |