# |<<

**发债契约版本 (bond_contract_v / nc.vo.bond.bondmanage.contract.BondContractVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1241.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 版本PK | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_bondcontract | 主键 | pk_bondcontract | varchar(50) | √ | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | isinitial | 期初 | isinitial | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | vbillno | 单据编码 | vbillno | varchar(50) |  | 字符串 (String) |
| 8 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(50) |  | 字符串 (String) |
| 9 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 10 | busistatus | 单据状态 | busistatus | int |  | 单据状态 (BillStatusEnum) |  | 0=申请待提交; |