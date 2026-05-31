# |<<

**物权引用明细 (gpmc_prorelationdetail / nc.vo.gpmc.gpm.propertyrelation.ProRelationDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2536.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_propertyrelation | 执行明细主键 | pk_propertyrelation | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 单据编号 | vbillno | varchar(40) |  | 字符串 (String) |
| 3 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 4 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | pk_srcbill | 来源单据主键 | pk_srcbill | varchar(20) |  | 字符串 (String) |
| 6 | pk_srcbill_b | 来源单据表体主键 | pk_srcbill_b | varchar(20) |  | 字符串 (String) |
| 7 | vbillstatus | 审批状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |