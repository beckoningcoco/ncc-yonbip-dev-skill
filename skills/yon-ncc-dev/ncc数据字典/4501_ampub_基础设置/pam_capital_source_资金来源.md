# |<<

**资金来源 (pam_capital_source / nc.vo.am.capitalsource.CapitalSourceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4235.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_capital_source | 资金来源主键 | pk_capital_source | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | source_code | 资金来源编码 | source_code | varchar(40) |  | 字符串 (String) |
| 5 | source_name | 资金来源名称 | source_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 6 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |