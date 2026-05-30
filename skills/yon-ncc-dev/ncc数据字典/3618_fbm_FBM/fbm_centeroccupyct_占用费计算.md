# |<<

**占用费计算 (fbm_centeroccupyct / nc.vo.pfbm.centeroccupyct.CenteroccupyctVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2119.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_centeroccupyct | 占用费计算主键 | pk_centeroccupyct | char(20) | √ | 主键 (UFID) |
| 2 | charge | 是否计费 | charge | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | registerstatus | 票据状态 | registerstatus | varchar(50) |  | 票据状态 (RegisterStatusEnum) |  | error=状态错误; |