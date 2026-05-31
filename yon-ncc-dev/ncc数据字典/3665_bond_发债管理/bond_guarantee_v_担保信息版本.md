# |<<

**担保信息版本 (bond_guarantee_v / nc.vo.bond.bondmanage.contract.BondGuaranteeVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1245.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 版本PK | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_bondguarantee_b | 主键 | pk_bondguarantee_b | varchar(50) | √ | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | pk_currtype | 担保币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 7 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | originalid | 变更版本后保存原始id | originalid | varchar(200) |  | 字符串 (String) |
| 11 | version | 版本号 | version | int |  | 整数 (Integer) |
| 12 | versiondate | 当前版本诞生日期 | versiondate | char(19) |  | 日期 (UFDate) |
| 13 | occupymny | 占用担保金额 | occupymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | localoccupymny | 占用担保本币金额 | localoccupymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | glcoccupymny | 占用担保集团本币金额 | glcoccupymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | gllcoccupymny | 占用担保全局本币金额 | gllcoccupymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | guaranteetype | 担保类型 | guaranteetype | varchar(50) |  | 担保方式 (GuaranteeTypeEnum) |  | 0=信用; |