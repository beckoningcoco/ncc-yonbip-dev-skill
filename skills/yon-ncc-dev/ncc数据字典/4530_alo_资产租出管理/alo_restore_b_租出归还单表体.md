# |<<

**租出归还单表体 (alo_restore_b / nc.vo.alo.lease.restore.LeaseRestoreBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/101.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lease_restore_b | 租出归还单表体主键 | pk_lease_restore_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | start_date | 租出日期 | start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 7 | return_date | 归还日期 | return_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 8 | end_date | 止租日期 | end_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 9 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 10 | pk_usedunit_before | 归还前使用权最新版本 | pk_usedunit_before | varchar(20) |  | 组织 (org) |
| 11 | pk_usedunit_before_v | 归还前使用权 | pk_usedunit_before_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 12 | pk_usedunit_after | 使用权最新版本 | pk_usedunit_after | varchar(20) |  | 组织 (org) |
| 13 | pk_usedunit_after_v | 使用权 | pk_usedunit_after_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 14 | pk_usedept_before | 归还前使用部门最新版本 | pk_usedept_before | varchar(20) |  | 组织_部门 (dept) |
| 15 | pk_usedept_before_v | 归还前使用部门 | pk_usedept_before_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 16 | pk_usedept_after | 使用部门最新版本 | pk_usedept_after | varchar(20) |  | 组织_部门 (dept) |
| 17 | pk_usedept_after_v | 使用部门 | pk_usedept_after_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 18 | pk_user_before | 归还前使用人 | pk_user_before | varchar(20) |  | 人员基本信息 (psndoc) |
| 19 | pk_user_after | 使用人 | pk_user_after | varchar(20) |  | 人员基本信息 (psndoc) |
| 20 | pk_location_before | 归还前位置 | pk_location_before | varchar(20) |  | 位置 (location) |
| 21 | pk_location_after | 位置 | pk_location_after | varchar(20) |  | 位置 (location) |
| 22 | pk_icorg_in | 库存组织最新版本 | pk_icorg_in | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 23 | pk_icorg_in_v | 库存组织 | pk_icorg_in_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 24 | pk_warehouse_in | 归还仓库 | pk_warehouse_in | varchar(20) |  | 仓库 (stordoc) |
| 25 | stock_in_flag | 入库标志 | stock_in_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | pk_used_status_before | 归还前状态 | pk_used_status_before | varchar(20) |  | 设备状态 (StatusVO) |
| 27 | pk_used_status_after | 归还后状态 | pk_used_status_after | varchar(20) |  | 设备状态 (StatusVO) |
| 28 | status_date_before | 归还前状态日期 | status_date_before | char(19) |  | 日期 (UFDate) |
| 29 | status_date_after | 归还后状态日期 | status_date_after | char(19) |  | 日期 (UFDate) |
| 30 | pk_jobmngfil_before | 归还前项目 | pk_jobmngfil_before | varchar(20) |  | 项目 (project) |
| 31 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 32 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 33 | src_pk_bill_b | 来源单据子表主键 | src_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 34 | src_bill_type | 来源单据类型 | src_bill_type | varchar(20) |  | 字符串 (String) |
| 35 | src_bill_code | 来源单据单据号 | src_bill_code | varchar(40) |  | 字符串 (String) |
| 36 | src_transi_type | 来源交易类型 | src_transi_type | varchar(30) |  | 字符串 (String) |
| 37 | coop_pk_bill_b | 协同来源单据子表主键 | coop_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 38 | coop_bill_type | 协同来源单据类型 | coop_bill_type | varchar(20) |  | 字符串 (String) |
| 39 | coop_transi_type | 协同来源交易类型 | coop_transi_type | varchar(30) |  | 字符串 (String) |
| 40 | coop_bill_code | 协同来源单据单据号 | coop_bill_code | varchar(40) |  | 字符串 (String) |
| 41 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |