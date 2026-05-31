# |<<

**委托借款放款执行情况版本 (cdmc_consignfinexecute_v / nc.vo.cdmc.ccm.consigndebitfinancepay.version.ConsignDebitFinExecuteVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1339.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version_b | 主键 | pk_version_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_consignexecute_b | 字表pk | pk_consignexecute_b | char(20) |  | 主键 (UFID) |
| 3 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 4 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | summary | 执行情况类型 | summary | varchar(50) |  | 执行情况类型 (ExecuteTypeEnum) |  | HB=还本; |