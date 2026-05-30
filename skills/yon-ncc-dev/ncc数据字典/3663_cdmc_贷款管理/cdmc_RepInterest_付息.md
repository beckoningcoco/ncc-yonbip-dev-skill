# |<<

**付息 (cdmc_RepInterest / nc.vo.cdmc.cdm.repayintst.RepayIntstVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1399.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayintst | 主键 | pk_repayintst | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillno | 单据编码 | vbillno | varchar(50) |  | 字符串 (String) |
| 6 | pk_debitunit | 借款单位 | pk_debitunit | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 9 | busistatus | 单据状态 | busistatus | int |  | 外贷付息单据状态 (BillStatusEnum) |  | -1=待提交; |