# |<<

**现金流量项目 (bd_cashflow / nc.vo.bd.cashflow.CashflowVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/387.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashflow | 现金流量项目主键 | pk_cashflow | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 4 | code | 现金流量项目编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 现金流量项目名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | pk_parent | 上级项目 | pk_parent | varchar(20) |  | 现金流量项目 (cashflow) |
| 7 | itemtype | 现金流量项目类型 | itemtype | smallint |  | 现金流量项目类型 (itemtype) |  | 1=现金流入; |