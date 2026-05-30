# |<<

**医疗资金来源 (bd_fundsource / nc.vo.uapbd.funsource.FundSourceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/853.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundsource | 资金来源主键 | pk_fundsource | char(20) | √ | 主键 (UFID) |
| 2 | name | 资金来源名称 | name | varchar(120) |  | 字符串 (String) |
| 3 | code | 资金来源编码 | code | varchar(60) |  | 字符串 (String) |
| 4 | vmnemonic | 助记码 | vmnemonic | varchar(60) |  | 字符串 (String) |
| 5 | vmemo | 备注 | vmemo | varchar(300) |  | 字符串 (String) |
| 6 | bispreset | 是否预置 | bispreset | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 10 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |