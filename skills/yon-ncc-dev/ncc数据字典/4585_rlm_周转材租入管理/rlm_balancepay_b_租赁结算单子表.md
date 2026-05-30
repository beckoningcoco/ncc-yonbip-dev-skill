# |<<

**租赁结算单子表 (rlm_balancepay_b / nc.vo.rlm.balancepay.BalancePayBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4922.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balancepay_b | 租赁结算单子表主键 | pk_balancepay_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 承租组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 承租组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_contract_v | 合同编码 | pk_contract_v | varchar(20) | √ | 周转材租入合同 (ContractHeadVO) |
| 7 | pk_contract_base | 租入合同原版主键 | pk_contract_base | varchar(20) |  | 周转材租入合同 (ContractHeadVO) |
| 8 | pk_currency_origin | 原币 | pk_currency_origin | varchar(20) |  | 币种 (currtype) |
| 9 | origin_rate | 汇率 | origin_rate | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 10 | last_date | 上次结算日 | last_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 11 | gathmoney | 本期付款(原币) | gathmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | gathmoney_org | 本期付款(本币) | gathmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 13 | gathmoney_group | 本期付款(集团) | gathmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 14 | gathmoney_global | 本期付款(全局) | gathmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 15 | rentmoney | 租金(原币) | rentmoney | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 16 | rentmoney_org | 租金(本币) | rentmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 17 | rentmoney_group | 租金(集团) | rentmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 18 | rentmoney_global | 租金(全局) | rentmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 19 | transportmoney | 运输费(原币) | transportmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | transportmoney_org | 运输费(本币) | transportmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | transportmoney_group | 运输费(集团) | transportmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | transportmoney_global | 运输费(全局) | transportmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | loadmoney | 装卸费(原币) | loadmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | loadmoney_org | 装卸费(本币) | loadmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | loadmoney_group | 装卸费(集团) | loadmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | loadmoney_global | 装卸费(全局) | loadmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | damagemoney | 损坏赔偿金额(原币) | damagemoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | damagemoney_org | 损坏赔偿金额(本币) | damagemoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | damagemoney_group | 损坏赔偿金额(集团) | damagemoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | damagemoney_global | 损坏赔偿金额(全局) | damagemoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | discardmoney | 报废赔偿金额(原币) | discardmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | discardmoney_org | 报废赔偿金额(本币) | discardmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | discardmoney_group | 报废赔偿金额(集团) | discardmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 34 | discardmoney_global | 报废赔偿金额(全局) | discardmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 35 | lostpaymoney | 遗失赔偿金额(原币) | lostpaymoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 36 | lostpaymoney_org | 遗失赔偿金额(本币) | lostpaymoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 37 | lostpaymoney_group | 遗失赔偿金额(集团) | lostpaymoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 38 | lostpaymoney_global | 遗失赔偿金额(全局) | lostpaymoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 39 | adjustmoney | 调整金额(原币) | adjustmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 40 | adjustmoney_org | 调整金额(本币) | adjustmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 41 | adjustmoney_group | 调整金额(集团) | adjustmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 42 | adjustmoney_global | 调整金额(全局) | adjustmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 43 | compmoney | 赔偿金额(原币) | compmoney | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 44 | compmoney_org | 赔偿金额(本币) | compmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 45 | compmoney_group | 赔偿金额(集团) | compmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 46 | compmoney_global | 赔偿金额(全局) | compmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 47 | maintainmoney | 维修金额(原币) | maintainmoney | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 48 | maintainmoney_org | 维修金额(本币) | maintainmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 49 | maintainmoney_group | 维修金额(集团) | maintainmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 50 | maintainmoney_global | 维修金额(全局) | maintainmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 51 | stopmoney | 停租租金(原币) | stopmoney | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 52 | stopmoney_org | 停租租金(本币) | stopmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 53 | stopmoney_group | 停租租金(集团) | stopmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 54 | stopmoney_global | 停租租金(全局) | stopmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 55 | returnmoney | 归还费用(原币) | returnmoney | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 56 | returnmoney_org | 归还费用(本币) | returnmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 57 | returnmoney_group | 归还费用(集团) | returnmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 58 | returnmoney_global | 归还费用(全局) | returnmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 59 | othermoney | 其他应付(原币) | othermoney | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 60 | othermoney_org | 其他应付(本币) | othermoney_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 61 | othermoney_group | 其他应付(集团) | othermoney_group | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 62 | othermoney_global | 其他应付(全局) | othermoney_global | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 63 | aggmoney | 应付合计(原币) | aggmoney | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 64 | aggmoney_org | 应付合计(本币) | aggmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 65 | aggmoney_group | 应付合计(集团) | aggmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 66 | aggmoney_global | 应付合计(全局) | aggmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 67 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 68 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 69 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 70 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 71 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 72 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 73 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 74 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 75 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 76 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 77 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 78 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 79 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 80 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 81 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 82 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 83 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 84 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 85 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 86 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 87 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |