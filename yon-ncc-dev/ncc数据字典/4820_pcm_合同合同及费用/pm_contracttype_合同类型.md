# |<<

**合同类型 (pm_contracttype / nc.vo.pcm.contracttype.ContractTypeHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4445.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contracttype | 合同类型主键 | pk_contracttype | char(20) | √ | 主键 (UFID) |
| 2 | type_code | 合同类型编码 | type_code | varchar(40) |  | 字符串 (String) |
| 3 | type_name | 合同类型名称 | type_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | innercode | 内码 | innercode | varchar(50) |  | 字符串 (String) |
| 5 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_parent | 上级合同类型 | pk_parent | varchar(20) |  | 合同类型 (pmcontracttype) |
| 8 | enablestate | 启用状态 | enablestate | int |  | 启用状态2(项目管理) (pmEnablestate2) |  | 2=已启用; |