# |<<

**结算清单明细 (pm_contr_bal_b / nc.vo.pcm.contractbalance.ContractBalanceWorksVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4433.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contr_bal_b | 结算清单明细主键 | pk_contr_bal_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(50) |  | 字符串 (String) |
| 6 | src_bill_code | 来源单据编码 | src_bill_code | varchar(50) |  | 字符串 (String) |
| 7 | src_billtype | 来源单据类型 | src_billtype | varchar(50) |  | 字符串 (String) |
| 8 | pk_contr_works | 合同基本 | pk_contr_works | varchar(20) |  | 合同基本 (works) |
| 9 | pk_contr_alter_b | 补充协议基本 | pk_contr_alter_b | varchar(20) |  | 补充协议明细 (contralterbodyvo) |
| 10 | src_rowno | 来源行号 | src_rowno | varchar(50) |  | 字符串 (String) |
| 11 | pk_material | 物料编码最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 12 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | pk_measdoc | 单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 14 | pk_cbsnode | CBS | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 15 | pk_taxcode | 税码 | pk_taxcode | varchar(20) |  | 增值税税码税率 (taxcode) |
| 16 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | price | 无税结算价 | price | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | taxprice | 含税结算价 | taxprice | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | tot_comp_num | 累计完成量 | tot_comp_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | bala_num | 结算数量 | bala_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | bala_mny | 无税结算额 | bala_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 22 | bala_tax | 结算税额 | bala_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | bala_taxmny | 含税结算额 | bala_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | ntot_sche_mny | 累计进度款 | ntot_sche_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | dif_mny | 无税差异额 | dif_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 26 | dif_taxmny | 含税差异额 | dif_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | nosubtaxrate | 不可抵扣率 | nosubtaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | nosubtaxmny | 不可抵扣额 | nosubtaxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | calcostmny | 计成本金额 | calcostmny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 30 | curr_expe_mny | 预付款冲销 | curr_expe_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | qual_taxmny | 质保金 | qual_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | invoice_mny | 已票金额 | invoice_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | verified_flag | 核销完成 | verified_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 34 | estimate_taxmny | 含税暂估额 | estimate_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 35 | writeoff_taxmny | 红冲含税额 | writeoff_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 36 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 37 | bdef1 | 自定义项1 | bdef1 | varchar(101) |  | 自定义项 (Custom) |
| 38 | bdef2 | 自定义项2 | bdef2 | varchar(101) |  | 自定义项 (Custom) |
| 39 | bdef3 | 自定义项3 | bdef3 | varchar(101) |  | 自定义项 (Custom) |
| 40 | bdef4 | 自定义项4 | bdef4 | varchar(101) |  | 自定义项 (Custom) |
| 41 | bdef5 | 自定义项5 | bdef5 | varchar(101) |  | 自定义项 (Custom) |
| 42 | bdef6 | 自定义项6 | bdef6 | varchar(101) |  | 自定义项 (Custom) |
| 43 | bdef7 | 自定义项7 | bdef7 | varchar(101) |  | 自定义项 (Custom) |
| 44 | bdef8 | 自定义项8 | bdef8 | varchar(101) |  | 自定义项 (Custom) |
| 45 | bdef9 | 自定义项9 | bdef9 | varchar(101) |  | 自定义项 (Custom) |
| 46 | bdef10 | 自定义项10 | bdef10 | varchar(101) |  | 自定义项 (Custom) |
| 47 | bdef11 | 自定义项11 | bdef11 | varchar(101) |  | 自定义项 (Custom) |
| 48 | bdef12 | 自定义项12 | bdef12 | varchar(101) |  | 自定义项 (Custom) |
| 49 | bdef13 | 自定义项13 | bdef13 | varchar(101) |  | 自定义项 (Custom) |
| 50 | bdef14 | 自定义项14 | bdef14 | varchar(101) |  | 自定义项 (Custom) |
| 51 | bdef15 | 自定义项15 | bdef15 | varchar(101) |  | 自定义项 (Custom) |
| 52 | bdef16 | 自定义项16 | bdef16 | varchar(101) |  | 自定义项 (Custom) |
| 53 | bdef17 | 自定义项17 | bdef17 | varchar(101) |  | 自定义项 (Custom) |
| 54 | bdef18 | 自定义项18 | bdef18 | varchar(101) |  | 自定义项 (Custom) |
| 55 | bdef19 | 自定义项19 | bdef19 | varchar(101) |  | 自定义项 (Custom) |
| 56 | bdef20 | 自定义项20 | bdef20 | varchar(101) |  | 自定义项 (Custom) |