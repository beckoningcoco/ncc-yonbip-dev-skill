# |<<

**分摊参数子表 (cost_parabill_b / nc.vo.hrpco.parabill.CostParabillBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1621.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_parabill_b | 子表主键 | pk_parabill_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_sppara | 分摊参数 | pk_sppara | varchar(20) |  | 分摊参数-成本组织 (CostSpparaOrgVO) |
| 3 | daccoutperiod | 会计期间 | daccoutperiod | varchar(20) |  | 会计期间档案 (accperiod) |
| 4 | sourcesys | 来源系统 | sourcesys | int |  | 来源系统 (SourceSysEnum) |  | 1=手工录入; |