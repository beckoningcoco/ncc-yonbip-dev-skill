# |<<

**抵押信息 (gpmc_GuaGuaInf / nc.vo.gpmc.gpm.contract.GuaGuarantyInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2528.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_guaguarantyinfo_b | 主键 | pk_guaguarantyinfo_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillno | 单据编码 | vbillno | varchar(50) |  | 字符串 (String) |
| 6 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 7 | summary | 摘要 | summary | varchar(200) |  | 备注 (Memo) |
| 8 | pk_srcbilltypeid | 来源单据类型主键 | pk_srcbilltypeid | varchar(50) |  | 字符串 (String) |
| 9 | srcbillno | 来源单据号 | srcbillno | varchar(50) |  | 字符串 (String) |
| 10 | pk_srcbill | 来源单据主键 | pk_srcbill | varchar(50) |  | 字符串 (String) |
| 11 | sourcesystypecode | 来源系统 | sourcesystypecode | varchar(50) |  | 字符串 (String) |
| 12 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | pk_srcbillrowid | 来源单据行主键 | pk_srcbillrowid | varchar(50) |  | 字符串 (String) |
| 16 | pk_fsrcbill | 源头单据主键 | pk_fsrcbill | varchar(50) |  | 字符串 (String) |
| 17 | pk_fsrcbilltypeid | 源头单据类型主键 | pk_fsrcbilltypeid | varchar(50) |  | 字符串 (String) |
| 18 | fsrcbilltypecode | 源头单据类型编码 | fsrcbilltypecode | varchar(50) |  | 字符串 (String) |
| 19 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 20 | guapropertyid | 质（抵）押物 | guapropertyid | varchar(20) |  | 字符串 (String) |
| 21 | pledgeno | 物权编号 | pledgeno | varchar(20) |  | 担保物权 (GuaPropertyVO) |
| 22 | pledgename | 物权名称 | pledgename | varchar(200) |  | 字符串 (String) |
| 23 | owner | 所有权属性 | owner | int |  | 所有者属性 (OwnerEnum) |  | 1=本单位; |