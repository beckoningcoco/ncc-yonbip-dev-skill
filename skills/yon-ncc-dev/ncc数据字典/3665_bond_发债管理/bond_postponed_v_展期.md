# |<<

**展期 (bond_postponed_v / nc.vo.bond.bondmanage.register.BondPostponedVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1249.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 版本PK | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_bondpostponed_b | 主键 | pk_bondpostponed_b | varchar(50) | √ | 字符串 (String) |
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
| 13 | postponedstartdate | 展期开始日期 | postponedstartdate | char(19) |  | 日期时间 (UFDateTime) |
| 14 | postponedenddate | 展期结束日期 | postponedenddate | char(19) |  | 日期时间 (UFDateTime) |
| 15 | postponedinterestrate | 展期利率 | postponedinterestrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | interestrate | 利率 | interestrate | varchar(20) |  | 利率编码 (fi_ratecode) |
| 17 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef21 | 自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef22 | 自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef23 | 自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef24 | 自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef25 | 自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef26 | 自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef27 | 自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef28 | 自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef29 | 自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef30 | 自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |