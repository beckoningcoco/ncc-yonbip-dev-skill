# |<<

**角色菜单关联 (uh_ui_rolemenu / com.yonyouhealth.uaph.framework.org.bizsys.web.personalconfig.vo.RoleMenuVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6290.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rolemenu | 主键 | pk_rolemenu | char(20) | √ | 主键 (UFID) |
| 2 | pk_role | 角色主键 | pk_role | varchar(20) |  | 角色 (Role) |
| 3 | menuitemcode | 菜单项编码 | menuitemcode | varchar(50) |  | 字符串 (String) |
| 4 | menuitemstr | 菜单项字符串 | menuitemstr | varchar(500) |  | 字符串 (String) |
| 5 | defopen | 是否默认打开 | defopen | char(1) |  | 字符串 (String) |
| 6 | menucolor | 菜单颜色 | menucolor | varchar(20) |  | 字符串 (String) |