# |<<

**费用类型 (resa_costtype / nc.vo.resa.costtype.CostTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4895.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costtype | 费用类型标识 | pk_costtype | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 字符串 (String) |
| 4 | name2 | 名称2 | name2 | varchar(200) |  | 字符串 (String) |
| 5 | name3 | 名称3 | name3 | varchar(200) |  | 字符串 (String) |
| 6 | name4 | 名称4 | name4 | varchar(200) |  | 字符串 (String) |
| 7 | name5 | 名称5 | name5 | varchar(200) |  | 字符串 (String) |
| 8 | name6 | 名称6 | name6 | varchar(200) |  | 字符串 (String) |
| 9 | remark | 备注 | remark | varchar(250) |  | 字符串 (String) |
| 10 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enum) |  | 1=未启用; |