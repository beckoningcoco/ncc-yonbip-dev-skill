# |<<

**合同执行情况 (lcm_contract_exec / nc.vo.lcm.docucontract.DocuContractExecVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3559.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract_exec | 主键 | pk_contract_exec | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 单据编号 | vbillno | varchar(40) |  | 字符串 (String) |
| 3 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 4 | summary | 摘要 | summary | varchar(50) |  | 执行情况类型 (ContractExecTypeEnum) |  | FBJ=放本金; |