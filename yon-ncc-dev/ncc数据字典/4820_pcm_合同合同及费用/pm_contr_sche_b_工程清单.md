# |<<

**工程清单 (pm_contr_sche_b / nc.vo.pcm.contractschedule.ContractScheduleBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4439.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contr_sche_b | 分包合同进度款子表主键 | pk_contr_sche_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 3 | pk_org_v | 项目组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_contr_works | 合同行编码 | pk_contr_works | varchar(20) |  | 合同基本 (works) |
| 6 | pk_material | 编码 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_material_v | 物料 | pk_material_v | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | pk_cbsnode | CBS | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 9 | pk_measdoc | 单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 10 | price | 无税结算价 | price | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | submit_price | 无税报送价 | submit_price | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | submit_ratio | 报送价格系数 | submit_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | service_prc_ratio | 结算价格系数 | service_prc_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | submit_num | 报送数量 | submit_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | finish_num | 结算数量 | finish_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | orig_sche_mny | 结算金额（原币） | orig_sche_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 17 | sche_mny | 无税进度款 | sche_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 18 | sche_mny_group | 无税进度款（集团币） | sche_mny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 19 | sche_mny_global | 无税进度款（全局币） | sche_mny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 20 | orig_submit_mny | 报送金额（原币） | orig_submit_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | submit_mny | 无税报送额 | submit_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | submit_mny_group | 无税报送额（集团币） | submit_mny_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | submit_mny_global | 无税报送额（全局币） | submit_mny_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | orig_shou_pay | 本期应付（原币） | orig_shou_pay | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 25 | shou_pay_mny | 无税本期应付 | shou_pay_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 26 | shou_pay_mny_group | 无税本期应付（集团币） | shou_pay_mny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 27 | shou_pay_mny_global | 无税本期应付（全局币） | shou_pay_mny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 28 | oprnum | 操作次数 | oprnum | int |  | 整数 (Integer) | 0 |
| 29 | verify_mny | 核销金额 | verify_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | verify_group | 核销金额（集团币） | verify_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | verify_global | 核销金额（全局币） | verify_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | memo | 备注 | memo | varchar(300) |  | 字符串 (String) |
| 33 | orig_tot_sched_mny | 累计进度款(原币) | orig_tot_sched_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 34 | ntot_sched_mny | 累计进度款 | ntot_sched_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 35 | sched_mny_group | 累计进度款（集团币种） | sched_mny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 36 | sched_mny_global | 累计进度款（全局币种） | sched_mny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 37 | orig_tot_sld_mny | 累计应付（原币） | orig_tot_sld_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 38 | tot_sld_mny | 无税累计应付 | tot_sld_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 39 | tot_sld_mny_group | 无税累计应付（集团币种） | tot_sld_mny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 40 | tot_sld_mny_global | 无税累计应付（全局币种） | tot_sld_mny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 41 | tot_sld_taxmny | 含税累计应付 | tot_sld_taxmny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 42 | tot_sld_taxmny_group | 含税累计应付（集团币种） | tot_sld_taxmny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 43 | tot_sld_taxmny_global | 含税累计应付（全局币种） | tot_sld_taxmny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 44 | submit_taxprice | 含税报送价 | submit_taxprice | decimal(28, 8) |  | 金额 (UFMoney) |
| 45 | submit_taxmny | 含税报送额 | submit_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 46 | submit_taxmny_group | 含税报送额（集团币） | submit_taxmny_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 47 | submit_taxmny_global | 含税报送额（全局币） | submit_taxmny_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 48 | submit_tax | 报送税额 | submit_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 49 | sche_taxmny | 含税进度款 | sche_taxmny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 50 | sche_taxmny_group | 含税进度款（集团币） | sche_taxmny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 51 | sche_taxmny_global | 含税进度款（全局币） | sche_taxmny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 52 | sche_tax | 税额 | sche_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 53 | taxprice | 含税结算价 | taxprice | decimal(28, 8) |  | 金额 (UFMoney) |
| 54 | shou_pay_taxmny | 含税本期应付 | shou_pay_taxmny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 55 | shou_pay_taxmny_group | 含税本期应付（集团币） | shou_pay_taxmny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 56 | shou_pay_taxmny_global | 含税本期应付（全局币） | shou_pay_taxmny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 57 | pay_tax | 应付税额 | pay_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 58 | pk_taxcode | 税码 | pk_taxcode | varchar(20) |  | 增值税税码税率 (taxcode) |
| 59 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 60 | nosubtaxrate | 不可抵扣率 | nosubtaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 61 | nosubtaxmny | 不可抵扣额 | nosubtaxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 62 | calcostmny | 计成本金额 | calcostmny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 63 | tot_cost_mny | 累计成本金额 | tot_cost_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 64 | taxtype | 扣税类别 | taxtype | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |