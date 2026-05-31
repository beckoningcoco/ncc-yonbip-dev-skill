# |<<

**管理费用计提标准 (ipmfund_prov_stand / nc.vo.ipmfund.entrustproto.ProvStandVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3338.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prov_stand | 管理费用计提标准主键 | pk_prov_stand | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | accrual_period | 计提期间 | accrual_period | varchar(50) |  | 计提期间 (AccrualPeriodEnum) |  | 1=投资期; |