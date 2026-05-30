# |<<

**应用菜单注册 (sm_appmenureg / nc.vo.platform.workbench.AppMenuVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5280.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_menu | 菜单主键 | pk_menu | char(20) | √ | 主键 (UFID) |
| 2 | menucode | 菜单编码 | menucode | varchar(50) |  | 字符串 (String) |
| 3 | menuname | 菜单名称 | menuname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | menudesc | 菜单描述 | menudesc | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | isenable | 是否启用 | isenable | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | isdefault | 是否系统内置 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |