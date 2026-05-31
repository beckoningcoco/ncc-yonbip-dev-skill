# |<<

**医疗成本 (org_hrpcost / nc.vo.org.HrpCostVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4084.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hrpcost | 主键 | pk_hrpcost | char(20) | √ | 主键 (UFID) |
| 2 | costcode | 编码 | costcode | varchar(50) |  | 字符串 (String) |
| 3 | costname | 名称 | costname | varchar(50) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |