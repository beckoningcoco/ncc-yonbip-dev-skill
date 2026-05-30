# |<<

**暂估明细 (arap_estitally / nc.vo.arap.tally.EstiTallyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/182.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_estitally | 主键 | pk_estitally | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | char(20) |  | 主键 (UFID) |
| 5 | accyear | 会计年度 | accyear | varchar(4) |  | 字符串 (String) |
| 6 | accperiod | 会计期间 | accperiod | varchar(2) |  | 字符串 (String) |
| 7 | tallydate | 记账日期 | tallydate | char(19) |  | 日期 (UFDate) |
| 8 | brief | 摘要 | brief | varchar(300) |  | 字符串 (String) |
| 9 | pk_currtype | 币种 | pk_currtype | char(20) |  | 主键 (UFID) |
| 10 | customer | 客户 | customer | char(20) |  | 主键 (UFID) |
| 11 | supplier | 供应商 | supplier | char(20) |  | 主键 (UFID) |
| 12 | pk_billtype | 单据类型 | pk_billtype | char(20) |  | 主键 (UFID) |
| 13 | billclass | 单据大类 | billclass | varchar(10) |  | 字符串 (String) |
| 14 | pk_tradetype | 交易类型 | pk_tradetype | char(20) |  | 主键 (UFID) |
| 15 | pk_item | 单据行主键 | pk_item | char(20) |  | 主键 (UFID) |
| 16 | pk_coritem | 对应辅表主键 | pk_coritem | char(20) |  | 主键 (UFID) |
| 17 | busidate | 起效日期 | busidate | char(19) |  | 日期 (UFDate) |
| 18 | pk_bill | 单据表主键 | pk_bill | char(20) |  | 主键 (UFID) |
| 19 | billno | 单据编号 | billno | varchar(40) |  | 字符串 (String) |
| 20 | objtype | 往来对象 | objtype | int |  | 整数 (Integer) |
| 21 | pk_deptid | 部门 | pk_deptid | char(20) |  | 主键 (UFID) |
| 22 | pk_psndoc | 业务员 | pk_psndoc | char(20) |  | 主键 (UFID) |
| 23 | money_de | 借方原币金额 | money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | local_money_de | 组织借方本币金额 | local_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | grouplocal_money_de | 集团借方本币金额 | grouplocal_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | globallocal_money_de | 全局借方本币金额 | globallocal_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | quantity_de | 借方数量 | quantity_de | decimal(20, 8) |  | 数值 (UFDouble) |
| 28 | quantity_cr | 贷方数量 | quantity_cr | decimal(20, 8) |  | 数值 (UFDouble) |
| 29 | local_money_cr | 组织贷方本币金额 | local_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | grouplocal_money_cr | 集团贷方本币金额 | grouplocal_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | globallocal_money_cr | 全局贷方本币金额 | globallocal_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | money_cr | 贷方原币金额 | money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | tax_de | 借方原币税金 | tax_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | local_tax_de | 组织借方本币税金 | local_tax_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | grouplocal_tax_de | 集团借方本币税金 | grouplocal_tax_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | globallocal_tax_de | 全局借方本币税金 | globallocal_tax_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | notax_de | 借方原币无税金额 | notax_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | local_notax_de | 组织借方本币无税金额 | local_notax_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | grouplocal_notax_de | 集团借方本币无税金额 | grouplocal_notax_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | globallocal_notax_de | 全局借方本币无税金额 | globallocal_notax_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | tax_cr | 贷方原币税金 | tax_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | local_tax_cr | 组织贷方本币税金 | local_tax_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | grouplocal_tax_cr | 集团贷方本币税金 | grouplocal_tax_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | globallocal_tax_cr | 全局贷方本币税金 | globallocal_tax_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | notax_cr | 贷方原币无税金额 | notax_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | local_notax_cr | 组织贷方本币无税金额 | local_notax_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | grouplocal_notax_cr | 集团贷方本币无税金额 | grouplocal_notax_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | globallocal_notax_cr | 全局贷方本币无税金额 | globallocal_notax_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | invoiceno | 发票号 | invoiceno | char(20) |  | 主键 (UFID) |
| 50 | pk_corbill | 对应单据主键 | pk_corbill | char(20) |  | 主键 (UFID) |
| 51 | pk_busiitem | 单据处理主键 | pk_busiitem | char(20) |  | 主键 (UFID) |
| 52 | pk_busitype | 业务流程 | pk_busitype | char(20) |  | 主键 (UFID) |
| 53 | dealflag | 处理标记 | dealflag | int |  | 整数 (Integer) |
| 54 | billstatus | 单据状态 | billstatus | int |  | 整数 (Integer) |
| 55 | verifinishdate | 核销完成日期 | verifinishdate | char(19) |  | 日期 (UFDate) |
| 56 | prepay | 是否预收付款 | prepay | varchar(1) |  | 字符串 (String) |
| 57 | defdoc1 | 待定档案项1 | defdoc1 | varchar(101) |  | 自定义项 (Custom) |
| 58 | defdoc2 | 待定档案项2 | defdoc2 | varchar(101) |  | 自定义项 (Custom) |
| 59 | defdoc3 | 待定档案项3 | defdoc3 | varchar(101) |  | 自定义项 (Custom) |
| 60 | defdoc4 | 待定档案项4 | defdoc4 | varchar(101) |  | 自定义项 (Custom) |
| 61 | defdoc5 | 待定档案项5 | defdoc5 | varchar(101) |  | 自定义项 (Custom) |
| 62 | defdoc6 | 待定档案项6 | defdoc6 | varchar(101) |  | 自定义项 (Custom) |
| 63 | defdoc7 | 待定档案项7 | defdoc7 | varchar(101) |  | 自定义项 (Custom) |
| 64 | defdoc8 | 待定档案项8 | defdoc8 | varchar(101) |  | 自定义项 (Custom) |
| 65 | defdoc9 | 待定档案项9 | defdoc9 | varchar(101) |  | 自定义项 (Custom) |
| 66 | defdoc10 | 待定档案项10 | defdoc10 | varchar(101) |  | 自定义项 (Custom) |