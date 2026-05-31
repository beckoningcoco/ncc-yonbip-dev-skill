# |<<

**债券利息调整 (bond_bondinterestadjust / nc.vo.bond.bondmanage.interestadjust.BondInterestadjustVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1237.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bondinterestadjust | 主键 | pk_bondinterestadjust | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | paymount | 系统应付利息 | paymount | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | glcmount | 集团系统应付利息 | glcmount | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | gllcmount | 全局系统应付利息 | gllcmount | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | olcmount | 组织系统应付利息 | olcmount | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | isinitial | 期初 | isinitial | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | vbillno | 单据编码 | vbillno | varchar(50) |  | 字符串 (String) |
| 11 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(50) |  | 字符串 (String) |
| 12 | justmountmny | 调整本币金额 | justmountmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 14 | busistatus | 单据状态 | busistatus | int |  | 债券利息调整单据类型 (InterestadjustBillStatusEnum) |  | 1=待提交; |