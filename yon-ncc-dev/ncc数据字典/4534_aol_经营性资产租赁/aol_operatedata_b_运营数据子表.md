# |<<

**运营数据子表 (aol_operatedata_b / nc.vo.aol.lease.operatedata.OperateDataBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/123.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_operatedata_b | 运营数据子表主键 | pk_operatedata_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 6 | pk_equip | 资产 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 7 | pk_lease_target | 租赁对象 | pk_lease_target | varchar(20) |  | 租赁对象 (LeaseTargetVO) |
| 8 | start_date | 起始日期 | start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 9 | end_date | 截止日期 | end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 10 | operate_jobmngfil | 运营项目 | operate_jobmngfil | varchar(20) |  | 运营项目 (OperateJobmngfilVO) |
| 11 | operate_data | 运营数据 | operate_data | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 12 | operate_data_org | 运营数据（本币） | operate_data_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | operate_data_group | 运营数据（集团本币） | operate_data_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | operate_data_global | 运营数据（全局本币） | operate_data_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | operate_cost_date | 发生日期 | operate_cost_date | char(19) |  | 日期 (UFDate) |
| 16 | settle_flag | 已确认 | settle_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 18 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 19 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 20 | src_pk_bill_b | 来源单据表体主键 | src_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 21 | src_bill_code | 来源单据单据号 | src_bill_code | varchar(40) |  | 字符串 (String) |
| 22 | src_bill_type | 来源单据类型 | src_bill_type | varchar(20) |  | 字符串 (String) |
| 23 | src_transi_type | 来源交易类型 | src_transi_type | varchar(30) |  | 字符串 (String) |
| 24 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |