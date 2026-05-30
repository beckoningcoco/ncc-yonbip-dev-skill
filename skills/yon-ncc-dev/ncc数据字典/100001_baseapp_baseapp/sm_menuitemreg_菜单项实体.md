# |<<

**菜单项实体 (sm_menuitemreg / nc.vo.sm.funcreg.MenuItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5319.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_menuitem | 菜单项主键 | pk_menuitem | char(20) | √ | 主键 (UFID) |
| 2 | menuitemcode | 菜单项编码 | menuitemcode | varchar(50) |  | 字符串 (String) |
| 3 | menuitemname | 菜单项名称 | menuitemname | varchar(120) |  | 字符串 (String) |
| 4 | menudes | 菜单描述 | menudes | varchar(50) |  | 字符串 (String) |
| 5 | funcode | 关联功能编码 | funcode | varchar(20) |  | 功能实体 (functionEntity) |
| 6 | pk_menu | 所属菜单 | pk_menu | varchar(50) |  | 字符串 (String) |
| 7 | ismenutype | 是否虚菜单 | ismenutype | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | iconpath | 图标相对路径 | iconpath | varchar(100) |  | 字符串 (String) |
| 9 | resid | 多语字段 | resid | varchar(50) |  | 字符串 (String) |
| 10 | nodeorder | 节点顺序 | nodeorder | int |  | 整数 (Integer) |