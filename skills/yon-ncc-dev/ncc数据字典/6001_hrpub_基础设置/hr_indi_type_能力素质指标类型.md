# |<<

**能力素质指标类型 (hr_indi_type / nc.vo.cp.cpinditype.CPIndiTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2678.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indi_type | 考核指标类型主键 | pk_indi_type | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 4 | pk_parent | 所属分类 | pk_parent | varchar(20) |  | 能力素质指标类型 (cpinditype) |
| 5 | innercode | 内部码 | innercode | varchar(50) |  | 字符串 (String) |
| 6 | inditypecode | 指标类型编码 | inditypecode | varchar(80) |  | 字符串 (String) |
| 7 | inditypename | 指标类型名称 | inditypename | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | indityperule | 指标类型规则 | indityperule | int |  | 整数 (Integer) |
| 9 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |