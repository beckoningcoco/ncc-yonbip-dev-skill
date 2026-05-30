# |<<

**应用菜单项注册 (sm_appmenuitem / nc.vo.platform.workbench.AppMenuItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5279.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_menuitem | 菜单项主键 | pk_menuitem | char(20) | √ | 主键 (UFID) |
| 2 | menuitemcode | 菜单项编码 | menuitemcode | varchar(50) |  | 字符串 (String) |
| 3 | menuitemname | 菜单项名称 | menuitemname | varchar(120) |  | 字符串 (String) |
| 4 | menudes | 菜单描述 | menudes | varchar(200) |  | 字符串 (String) |
| 5 | appcode | 关联应用编码 | appcode | varchar(20) |  | 应用注册 (appregister) |
| 6 | appid | 应用id | appid | varchar(50) |  | 字符串 (String) |
| 7 | pk_menu | 所属菜单 | pk_menu | varchar(50) |  | 字符串 (String) |
| 8 | parentcode | 父菜单项编码 | parentcode | varchar(50) |  | 字符串 (String) |
| 9 | resid | 多语字段 | resid | varchar(50) |  | 字符串 (String) |
| 10 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | image_src | 菜单图标 | image_src | varchar(200) |  | 字符串 (String) |