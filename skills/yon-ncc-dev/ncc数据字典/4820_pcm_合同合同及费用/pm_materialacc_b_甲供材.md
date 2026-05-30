# |<<

**甲供材 (pm_materialacc_b / nc.vo.pcm.materialacc.MaterialaccBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4480.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialacc_b | 材料结算单表体主键 | pk_materialacc_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | stockorg | 库存组织 | stockorg | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 6 | stockorg_v | 库存组织最新版本 | stockorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 7 | pk_wbs | 项目任务 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 8 | pk_cbsnode | CBS | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 9 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 10 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 11 | pk_material_v | 物料版本 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 12 | pk_measdoc | 单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 13 | curr_draw_num | 本期领用量 | curr_draw_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | curr_cance_num | 本期退库量 | curr_cance_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | curr_actual_num | 本期实际用量 | curr_actual_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | curr_net_num | 本期净领料量 | curr_net_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | prior_actual_num | 上期累计实际用量 | prior_actual_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | tot_draw_num | 累计领用量 | tot_draw_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | tot_cance_num | 累计退库量 | tot_cance_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | tot_actual_num | 累计实际用量 | tot_actual_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | tot_net_num | 累计净领料量 | tot_net_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | diversity_num | 差异量 | diversity_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | price | 无税单价 | price | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | taxprice | 含税单价 | taxprice | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | priceratio | 价格系数 | priceratio | decimal(28, 2) |  | 数值 (UFDouble) | 1 |
| 26 | money_mny | 无税差异金额 | money_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | pk_taxcode | 税码 | pk_taxcode | varchar(20) |  | 增值税税码税率 (taxcode) |
| 28 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | tax | 税额 | tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | money_taxmny | 含税差异金额 | money_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | nosubtaxrate | 不可抵扣率 | nosubtaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | nosubtaxmny | 不可抵扣额 | nosubtaxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | calcostmny | 计成本金额 | calcostmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 34 | invoice_mny | 已票金额 | invoice_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 35 | actual_deduct_money | 核销金额 | actual_deduct_money | decimal(28, 8) |  | 金额 (UFMoney) |
| 36 | verified_flag | 核销完成 | verified_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 37 | estimate_mny | 无税暂估额 | estimate_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 38 | estimate_tax | 暂估税额 | estimate_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 39 | estimate_taxmny | 含税暂估额 | estimate_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 40 | writeoff_mny | 红冲无税额 | writeoff_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 41 | writeoff_tax | 红冲税额 | writeoff_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 42 | writeoff_taxmny | 红冲含税额 | writeoff_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 43 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 44 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |