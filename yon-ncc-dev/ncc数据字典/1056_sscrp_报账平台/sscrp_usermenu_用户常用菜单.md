# |<<

**用户常用菜单 (sscrp_usermenu / nc.vo.sscrp.rpbill.UserMenuVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5620.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_usermenu | 主键 | pk_usermenu | char(20) | √ | 主键 (UFID) |
| 2 | userid | 用户主键 | userid | varchar(50) | √ | 字符串 (String) |
| 3 | transtypecode | 交易类型编码 | transtypecode | varchar(50) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |