# |<<

**承销商 (bond_underwriter / nc.vo.bond.bondmanage.contract.BondUnderwriterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1261.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bondunderwriter_b | 主键 | pk_bondunderwriter_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | remark | 详细说明 | remark | varchar(200) |  | 备注 (Memo) |
| 6 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | underwriterid | 承销商 | underwriterid | varchar(20) |  | 非银行金融机构 (NonbankFinInstitution) |
| 10 | ismain | 承销商类别1主2联席 | ismain | varchar(50) |  | 承销商类别 (UnderwriterEnum) |  | 1=主承销商; |