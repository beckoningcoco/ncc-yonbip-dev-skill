# |<<

**权限资源 (sm_permission_res / nc.vo.uap.rbac.permissionresource.PermissionResourceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5331.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_permission_res | 主键 | pk_permission_res | char(20) | √ | 主键 (UFID) |
| 2 | resourcecode | 资源编码 | resourcecode | varchar(50) |  | 字符串 (String) |
| 3 | resourcename | 资源名称 | resourcename | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | isabstract | 是否抽象类型 | isabstract | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | parentid | 上级ID | parentid | varchar(20) |  | 权限资源 (PermissionResource) |
| 6 | mdid | 关联元数据 | mdid | varchar(36) |  | 实体 (entity) |
| 7 | maintablename | 权限资源表名 | maintablename | varchar(50) |  | 字符串 (String) |
| 8 | keycolumnname | 权限资源主键列名 | keycolumnname | varchar(50) |  | 字符串 (String) |
| 9 | ownmodule | 所属模块 | ownmodule | varchar(20) |  | 模块信息 (module) |
| 10 | isenablespecialperm | 启用特殊权限 | isenablespecialperm | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | dpjudgerclassname | 数据权限判定插件 | dpjudgerclassname | varchar(200) |  | 字符串 (String) |
| 12 | innercode | 内部码 | innercode | char(4) |  | 字符串 (String) |
| 13 | dpgenclassname | 权限分表生成器接口 | dpgenclassname | varchar(200) |  | 字符串 (String) |
| 14 | issptapproverperm | 支持审核者权限设置 | issptapproverperm | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | isimmediately | 启用立即计算 | isimmediately | char(1) |  | 布尔类型 (UFBoolean) |