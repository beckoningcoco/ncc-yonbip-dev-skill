# |<<

**专业 (pam_specialty / nc.vo.am.specialty.SpecialtyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4325.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_specialty | 主键 | pk_specialty | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | special_code | 编码 | special_code | varchar(40) |  | 字符串 (String) |
| 6 | special_name | 名称 | special_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |