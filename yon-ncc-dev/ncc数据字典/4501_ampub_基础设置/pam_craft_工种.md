# |<<

**工种 (pam_craft / nc.vo.am.craft.CraftVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4240.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_craft | 工种主键 | pk_craft | char(20) | √ | 主键 (UFID) |
| 2 | craft_code | 编码 | craft_code | varchar(40) |  | 字符串 (String) |
| 3 | craft_name | 名称 | craft_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 4 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 5 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |