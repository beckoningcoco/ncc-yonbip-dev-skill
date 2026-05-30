# |<<

**集团担保明细版本 (gpmc_Guadetinfo_v / nc.vo.gpmc.gpm.contract.GuadetailVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2527.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 版本Pk | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_guadetailinfo_b | 主键 | pk_guadetailinfo_b | varchar(20) | √ | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
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
| 20 | organname | 单位名称 | organname | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 21 | guaamount | 担保总金额 | guaamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | gualcamount | 担保本币总金额 | gualcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | groamount | 担保集团本币总金额 | groamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | gloamount | 担保全局本币总金额 | gloamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | usedamount | 担保已用金额 | usedamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | orgusedamount | 担保已用金额组织本币 | orgusedamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | grousedamount | 已用担保金额集团本币 | grousedamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | glousedamount | 已用担保金额全局本币 | glousedamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | avaamount | 可用担保金额 | avaamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | orgavaamount | 可用担保金额组织本币 | orgavaamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | groavaamount | 可用担保总额集团本币 | groavaamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | gloavaamount | 可用担保总额全局本币 | gloavaamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |