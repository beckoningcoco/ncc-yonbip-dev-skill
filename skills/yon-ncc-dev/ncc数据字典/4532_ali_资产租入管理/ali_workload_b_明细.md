# |<<

**明细 (ali_workload_b / nc.vo.ali.lease.workload.LeaseInWorkloadBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/78.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workload_b | 租出工作量记录行主键 | pk_workload_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | src_pk_bill | 来源单据主表主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 7 | src_pk_bill_b | 来源单据子表主键 | src_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 8 | src_bill_code | 来源单据号 | src_bill_code | varchar(40) |  | 字符串 (String) |
| 9 | src_bill_type | 来源单据单据类型 | src_bill_type | varchar(20) |  | 字符串 (String) |
| 10 | src_transi_type | 来源单据交易类型 | src_transi_type | varchar(30) |  | 字符串 (String) |
| 11 | coop_pk_bill_b | 协同来源单据子表主键 | coop_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 12 | coop_bill_type | 协同来源单据类型 | coop_bill_type | varchar(20) |  | 字符串 (String) |
| 13 | coop_transi_type | 协同来源交易类型 | coop_transi_type | varchar(30) |  | 字符串 (String) |
| 14 | coop_bill_code | 协同来源单据单据号 | coop_bill_code | varchar(40) |  | 字符串 (String) |
| 15 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 16 | equip_code | 设备编码 | equip_code | varchar(40) |  | 字符串 (String) |
| 17 | equip_name | 设备名称 | equip_name | varchar(600) |  | 多语文本 (MultiLangText) |
| 18 | pk_category | 设备类别 | pk_category | varchar(20) |  | 设备类别 (CategoryVO) |
| 19 | equip_spec | 规格 | equip_spec | varchar(400) |  | 字符串 (String) |
| 20 | equip_model | 型号 | equip_model | varchar(400) |  | 字符串 (String) |
| 21 | workdate | 工作日期 | workdate | char(19) |  | 日期 (UFDate) |
| 22 | workload | 工作量 | workload | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | workload_unit | 工作量单位 | workload_unit | varchar(50) |  | 多语文本 (MultiLangText) |
| 24 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 25 | bill_code | 租入单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 26 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 27 | pk_lease_in | 租入单主键 | pk_lease_in | varchar(20) |  | 字符串 (String) |
| 28 | calculate_flag | 计算标识 | calculate_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 29 | calculate_date | 计算日期 | calculate_date | char(19) |  | 日期 (UFDate) |
| 30 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |