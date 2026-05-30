# |<<

**资金计划项目 (bd_fundplan / nc.vo.bd.fundplan.FundPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/851.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundplan | 资金计划项目主键 | pk_fundplan | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | code | 资金计划项目编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 资金计划项目名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 7 | pk_parent | 上级资金计划项目 | pk_parent | varchar(20) |  | 资金计划项目 (fundplan) |
| 8 | inoutdirect | 收支方向 | inoutdirect | int | √ | 收支方向 (inoutdirect) | 0 | 0=收入; |