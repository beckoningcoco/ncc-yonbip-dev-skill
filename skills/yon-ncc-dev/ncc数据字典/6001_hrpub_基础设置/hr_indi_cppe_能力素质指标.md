# |<<

**能力素质指标 (hr_indi_cppe / nc.vo.cp.cpindi.CPIndiVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2676.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indi_cppe | 考核指标主键 | pk_indi_cppe | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | pk_indi_type | 能力素质指标类型 | pk_indi_type | varchar(20) |  | 能力素质指标类型 (cpinditype) |
| 5 | indicode | 指标编码 | indicode | varchar(80) | √ | 字符串 (String) |
| 6 | indiname | 指标名称 | indiname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 7 | indiprop | 指标性质 | indiprop | int |  | 指标性质 (indiparam) |  | 0=定性; |