# |<<

**收付款协议 (arap_tally_agr / nc.vo.arap.tally.TallyAgrVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/197.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tally_agr | 主键 | pk_tally_agr | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 主键 (UFID) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 主键 (UFID) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 主键 (UFID) |
| 5 | tallydate | 登帐日期 | tallydate | char(19) |  | 日期 (UFDate) |
| 6 | expiredate | 协议到期日 | expiredate | char(19) |  | 日期 (UFDate) |
| 7 | inner_effect_date | 内控到期日期 | inner_effect_date | varchar(19) |  | 日期 (UFDate) |
| 8 | pk_bill | 单据 | pk_bill | char(20) |  | 主键 (UFID) |
| 9 | pk_item | 单据行 | pk_item | char(20) |  | 主键 (UFID) |
| 10 | pk_termitem | 单据协议行 | pk_termitem | char(20) |  | 主键 (UFID) |
| 11 | pk_dealnum | 业务处理批次号 | pk_dealnum | varchar(50) |  | 字符串 (String) |
| 12 | pk_busidata | 业务处理明细标识 | pk_busidata | varchar(20) |  | 主键 (UFID) |
| 13 | quantity_de | 借方数量 | quantity_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | money_de | 借方原币金额 | money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | local_money_de | 借方本币金额 | local_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | grouplocal_money_de | 集团借方本币金额 | grouplocal_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | globallocal_money_de | 全局借方本币金额 | globallocal_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | quantity_cr | 贷方数量 | quantity_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | money_cr | 贷方原币金额 | money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | local_money_cr | 贷方本币金额 | local_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | grouplocal_money_cr | 集团贷方本币金额 | grouplocal_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | globallocal_money_cr | 全局贷方本币金额 | globallocal_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | deal_quantity | 处理数量 | deal_quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | deal_money | 处理原币 | deal_money | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | deal_local_money | 处理本币 | deal_local_money | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | deal_grouplocal_money | 处理集团本币 | deal_grouplocal_money | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | deal_globallocal_money | 处理全局本币 | deal_globallocal_money | decimal(28, 8) |  | 数值 (UFDouble) |