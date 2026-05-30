# |<<

**个性化注册 (sm_individual_register / nc.individuation.register.vo.IndividualRegisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5309.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_register | 主键 | pk_register | varchar(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(100) | √ | 字符串 (String) |
| 3 | parentpk | 父节点 | parentpk | varchar(50) |  | 字符串 (String) |
| 4 | uiclass | 界面类 | uiclass | varchar(200) |  | 字符串 (String) |
| 5 | resourceid | 名称->资源id | resourceid | varchar(50) |  | 字符串 (String) |
| 6 | resourcepath | 名称->资源路径 | resourcepath | varchar(50) |  | 字符串 (String) |