# |<<

**承销商版本 (bond_underwriter_v / nc.vo.bond.bondmanage.contract.BondUnderwriterVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1262.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 版本PK | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_bondunderwriter_b | 主键 | pk_bondunderwriter_b | varchar(50) | √ | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | remark | 详细说明 | remark | varchar(200) |  | 备注 (Memo) |
| 7 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | underwriterid | 承销商 | underwriterid | varchar(50) |  | 字符串 (String) |
| 11 | ismain | 承销商类别1主0联席 | ismain | varchar(50) |  | 字符串 (String) |
| 12 | ratio | 实际承销比例 | ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | aggredratio | 约定承销比例 | aggredratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | aggredissuancemny | 约定承销金额 | aggredissuancemny | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | olcagrissuancemny | 约定承销本币金额 | olcagrissuancemny | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | glcagrissuancemny | 约定承销集团本币金额 | glcagrissuancemny | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | gllcagrissuancemny | 约定承销全局本币金额 | gllcagrissuancemny | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | issuancemny | 实际承销金额 | issuancemny | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | olcissuancemny | 实际承销本币金额 | olcissuancemny | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | glcissuancemny | 实际承销集团本币金额 | glcissuancemny | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | gllcissuancemny | 实际承销全局本币金额 | gllcissuancemny | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |