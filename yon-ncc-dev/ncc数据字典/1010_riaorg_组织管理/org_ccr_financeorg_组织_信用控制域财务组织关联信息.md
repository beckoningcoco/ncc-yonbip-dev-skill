# |<<

**组织_信用控制域财务组织关联信息 (org_ccr_financeorg / nc.vo.corg.CreditCtlRegionFinanceOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4023.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rel | 关联主键 | pk_rel | char(20) | √ | 主键 (UFID) |
| 2 | pk_financeorg | 财务组织 | pk_financeorg | char(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 3 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |