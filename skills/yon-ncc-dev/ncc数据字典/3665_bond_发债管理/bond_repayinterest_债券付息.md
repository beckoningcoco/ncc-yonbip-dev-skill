# |<<

**债券付息 (bond_repayinterest / nc.vo.bond.bondmanage.repayintst.BondRepayIntstVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1256.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bondrepayintst | 主键 | pk_bondrepayintst | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vbillno | 付息编码 | vbillno | varchar(50) |  | 字符串 (String) |
| 6 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(50) |  | 字符串 (String) |
| 7 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 8 | busistatus | 单据状态 | busistatus | int |  | 债券付息单据状态 (RepayIntstBillStatusEnum) |  | 0=待提交; |