# |<<

**委托借款放款展期版本 (cdmc_consignfinextension_v / nc.vo.cdmc.ccm.consigndebitfinancepay.version.ConsignDebitFinExtensionVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1343.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version_b | 主键 | pk_version_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_consignextension_b | 子表pk | pk_consignextension_b | char(20) |  | 主键 (UFID) |
| 3 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 4 | pk_rate | 展期利率 | pk_rate | varchar(20) |  | 利率编码 (fi_ratecode) |
| 5 | floatratio | 展期浮动比例 | floatratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | floatpoint | 展期浮动点数 | floatpoint | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | advcfloatratio | 展期提前浮动比例 | advcfloatratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | advcfloatpoint | 展期提前浮动点数 | advcfloatpoint | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | extensionmny | 展期金额 | extensionmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | olcextensionmny | 展期本币金额 | olcextensionmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | glcextensionmny | 展期集团本币金额 | glcextensionmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | gllcextensionmny | 展期全局本币金额 | gllcextensionmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | extbegindate | 展期开始日期 | extbegindate | char(19) |  | 日期时间 (UFDateTime) |
| 14 | extensionenddate | 展期结束日期 | extensionenddate | char(19) |  | 日期时间 (UFDateTime) |
| 15 | busitype | 业务类型 | busitype | varchar(50) |  | 业务类型 (BusiTypeEnum) |  | DEBIT=委借; |