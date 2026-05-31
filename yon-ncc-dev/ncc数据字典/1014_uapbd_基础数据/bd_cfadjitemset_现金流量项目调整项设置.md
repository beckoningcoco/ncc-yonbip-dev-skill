# |<<

**现金流量项目调整项设置 (bd_cfadjitemset / nc.vo.bd.cashflow.CfAdjItemSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/392.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cfadjitemset | 主键 | pk_cfadjitemset | char(20) | √ | 主键 (UFID) |
| 2 | mainitem | 主表项 | mainitem | varchar(20) |  | 现金流量项目 (cashflow) |
| 3 | additionalitem | 附表项 | additionalitem | varchar(20) |  | 现金流量项目 (cashflow) |
| 4 | additionaladjitem | 附表调整项 | additionaladjitem | varchar(20) |  | 现金流量项目 (cashflow) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |