# |<<

**引用担保合约关系明细 (gpmc_actrelationdetail / nc.vo.gpmc.gpm.actrealation.ActrelationDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2517.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_actrealation | 执行明细主键 | pk_actrealation | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 3 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 4 | pk_billtypename | 单据类型名称 | pk_billtypename | varchar(50) |  | 字符串 (String) |
| 5 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | pk_srcbill | 来源单据主键 | pk_srcbill | varchar(20) |  | 字符串 (String) |
| 7 | srcmodule | 来源模块 | srcmodule | varchar(50) |  | 字符串 (String) |
| 8 | pk_srcbill_b | 来源单据表体主键 | pk_srcbill_b | varchar(20) |  | 字符串 (String) |
| 9 | vbillstatus | 审批状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |