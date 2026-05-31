# |<<

**承销商 (bond_registerunderwriter_v / nc.vo.bond.bondmanage.register.BondRegisterUnderwriterVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1254.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 版本PK | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_bondunderwriter_b | 主键 | pk_bondunderwriter_b | varchar(50) | √ | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | vbillno | 单据编码 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 8 | summary | 摘要 | summary | varchar(200) |  | 备注 (Memo) |
| 9 | remark | 详细说明 | remark | varchar(200) |  | 备注 (Memo) |
| 10 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | pk_srcbillrowid | 来源单据行主键 | pk_srcbillrowid | varchar(50) |  | 字符串 (String) |
| 14 | pk_fsrcbill | 源头单据主键 | pk_fsrcbill | varchar(50) |  | 字符串 (String) |
| 15 | pk_fsrcbilltypeid | 源头单据类型主键 | pk_fsrcbilltypeid | varchar(50) |  | 字符串 (String) |
| 16 | fsrcbilltypecode | 源头单据类型编码 | fsrcbilltypecode | varchar(50) |  | 字符串 (String) |
| 17 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 18 | mainunderwriter | 主承销商 | mainunderwriter | varchar(20) |  | 银行档案 (bankdoc) |
| 19 | joinunderwriter | 联席承销商 | joinunderwriter | varchar(20) |  | 银行档案 (bankdoc) |
| 20 | ismain | 承销商类别1主2联席 | ismain | varchar(50) |  | 承销商类别 (UnderwriterEnum) |  | 1=主承销商; |