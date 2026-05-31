# |<<

**还本回单 (icdmc_repayprcplreceipt / nc.vo.icdmc.icdmc.repayprcplreceipt.RepayPrcplReceiptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3058.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayprcplr_h | 主键 | pk_repayprcplr_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_org_r | 资金组织 | pk_org_r | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 6 | pk_org_r_v | 资金组织版本 | pk_org_r_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 7 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 9 | busistatus | 单据状态 | busistatus | int |  | 外贷还本单据状态 (RePayBillStatusEnum) |  | -1=自由态; |