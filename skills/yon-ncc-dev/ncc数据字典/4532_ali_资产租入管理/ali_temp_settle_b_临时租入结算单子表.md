# |<<

**临时租入结算单子表 (ali_temp_settle_b / nc.vo.ali.settle.TempSettleBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/70.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settle_b | 临时租入结算单子表主键 | pk_settle_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | src_pk_bill | 来源单据主表主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 6 | src_pk_bill_b | 来源单据子表主键 | src_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 7 | src_bill_type | 来源单据类型 | src_bill_type | varchar(4) |  | 字符串 (String) |
| 8 | src_bill_code | 来源单据号 | src_bill_code | varchar(40) |  | 字符串 (String) |
| 9 | src_trans_type | 来源交易类型 | src_trans_type | varchar(30) |  | 字符串 (String) |
| 10 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 11 | equip_code | 设备编码 | equip_code | varchar(40) |  | 字符串 (String) |
| 12 | equip_name | 设备名称 | equip_name | varchar(400) |  | 字符串 (String) |
| 13 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 14 | model | 型号 | model | varchar(400) |  | 字符串 (String) |
| 15 | amount | 数量 | amount | int |  | 整数 (Integer) |
| 16 | curr_origin_price | 单价 | curr_origin_price | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 17 | curr_money | 结算金额 | curr_money | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 18 | curr_money_org | 本币结算金额 | curr_money_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 19 | curr_money_group | 金额（集团） | curr_money_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | curr_money_global | 金额（全局） | curr_money_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | lease_sta_date | 租赁开始日期 | lease_sta_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 22 | lease_end_date | 租赁结束日期 | lease_end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 23 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 24 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 25 | gather_money | 付款金额 | gather_money | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | gather_money_org | 付款金额（本币） | gather_money_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | gather_money_group | 付款金额（集团） | gather_money_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | gather_money_global | 付款金额（全局） | gather_money_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | pk_freecustom | 散户 | pk_freecustom | varchar(20) |  | 散户 (freecustom) |
| 30 | payable_flag | 应付标志 | payable_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 31 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |