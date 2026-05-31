# |<<

**库存交易类型 (ic_transtype / nc.vo.ic.transtype.TransTypeExtendVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3001.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transtype | 库存交易类型主键 | pk_transtype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | transtypecode | 库存交易类型编码 | transtypecode | varchar(20) |  | 字符串 (String) |
| 4 | baffectcost | 影响成本 | baffectcost | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | baffectonhand | 影响现存量 | baffectonhand | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | cavtype | 核销方式 | cavtype | int |  | 核销方式 (CavType) |  | 1=按订单发料核销; |