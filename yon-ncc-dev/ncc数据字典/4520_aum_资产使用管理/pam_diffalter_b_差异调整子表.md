# |<<

**差异调整子表 (pam_diffalter_b / nc.vo.aum.diffalter.DiffAlterBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4245.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_diffalter_b | 差异调整子表 | pk_diffalter_b | varchar(50) | √ | 字符串 (String) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_equip | 设备 | pk_equip | varchar(20) | √ | 设备卡片 (EquipHeadVO) |
| 4 | pk_mandept_before | 盘点前管理部门最新版本 | pk_mandept_before | varchar(20) |  | 组织_部门 (dept) |
| 5 | pk_mandept_before_v | 盘点前管理部门 | pk_mandept_before_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 6 | pk_mandept_after | 盘点后管理部门最新版本 | pk_mandept_after | varchar(20) |  | 组织_部门 (dept) |
| 7 | pk_mandept_after_v | 盘点后管理部门 | pk_mandept_after_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 8 | pk_usedunit_before | 盘点前使用权最新版本 | pk_usedunit_before | varchar(20) |  | 组织 (org) |
| 9 | pk_usedunit_before_v | 盘点前使用权 | pk_usedunit_before_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 10 | pk_usedunit_after | 盘点后使用权最新版本 | pk_usedunit_after | varchar(20) |  | 组织 (org) |
| 11 | pk_usedunit_after_v | 盘点后使用权 | pk_usedunit_after_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 12 | pk_usedept_before | 盘点前使用部门最新版本 | pk_usedept_before | varchar(20) |  | 组织_部门 (dept) |
| 13 | pk_usedept_before_v | 盘点前使用部门 | pk_usedept_before_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 14 | pk_usedept_after | 盘点后使用部门最新版本 | pk_usedept_after | varchar(20) |  | 组织_部门 (dept) |
| 15 | pk_usedept_after_v | 盘点后使用部门 | pk_usedept_after_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 16 | pk_assetuser_before | 盘点前责任人 | pk_assetuser_before | varchar(20) |  | 人员基本信息 (psndoc) |
| 17 | pk_assetuser_after | 盘点后责任人 | pk_assetuser_after | varchar(20) |  | 人员基本信息 (psndoc) |
| 18 | pk_position_before | 盘点前位置 | pk_position_before | varchar(20) |  | 位置 (location) |
| 19 | pk_position_after | 盘点后位置 | pk_position_after | varchar(20) |  | 位置 (location) |
| 20 | pk_usingstatus_before | 盘点前设备状态 | pk_usingstatus_before | varchar(20) |  | 设备状态 (StatusVO) |
| 21 | pk_usingstatus_after | 盘点后设备状态 | pk_usingstatus_after | varchar(20) |  | 设备状态 (StatusVO) |
| 22 | diffalert_reason | 变动原因 | diffalert_reason | varchar(20) |  | 原因 (reason) |
| 23 | dealresult | 处理结果 | dealresult | varchar(200) |  | 字符串 (String) |
| 24 | checkusername | 盘点人 | checkusername | varchar(20) |  | 字符串 (String) |
| 25 | check_date | 盘点日期 | check_date | char(19) |  | 日期 (UFDate) |
| 26 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 27 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 28 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 29 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 30 | status_date_before | 状态变化前日期 | status_date_before | char(19) |  | 日期 (UFDate) |
| 31 | status_date_after | 状态变化后日期 | status_date_after | char(19) |  | 日期 (UFDate) |
| 32 | alter_flag | 成功变动标记 | alter_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 33 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |