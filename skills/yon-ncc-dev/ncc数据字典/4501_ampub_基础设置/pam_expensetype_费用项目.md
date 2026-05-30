# |<<

**费用项目 (pam_expensetype / nc.vo.am.expensetype.ExpenseTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4252.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expensetype | 费用项目主键 | pk_expensetype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | expensetype_code | 费用项目编码 | expensetype_code | varchar(40) |  | 字符串 (String) |
| 6 | expensetype_name | 费用项目名称 | expensetype_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |