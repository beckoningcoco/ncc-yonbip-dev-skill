# |<<

**运行记录子表 (eom_operation_b / nc.vo.eom.operation.OperationBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1848.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_operation_b | 运行记录子表主键 | pk_operation_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 7 | pk_location | 位置 | pk_location | varchar(20) |  | 位置 (location) |
| 8 | start_time | 开始时间 | start_time | char(19) |  | 日期时间 (UFDateTime) |
| 9 | complete_time | 结束时间 | complete_time | char(19) |  | 日期时间 (UFDateTime) |
| 10 | system_hours | 制度运行时长 | system_hours | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | actual_hours | 实际运行时长 | actual_hours | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | total_hours | 累计运行时长 | total_hours | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | halt_time | 停机时间 | halt_time | char(19) |  | 日期时间 (UFDateTime) |
| 14 | halt_hours | 停机时长 | halt_hours | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 15 | plan_halt_hours | 计划停机时长 | plan_halt_hours | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 16 | unplan_halt_hours | 非计划停机时长 | unplan_halt_hours | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 17 | pk_halt_reason | 非计划停机原因 | pk_halt_reason | varchar(20) |  | 非计划停机原因 (haltreason) |
| 18 | gen_failure_flag | 是否故障停机 | gen_failure_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | operate_desc | 运行状况 | operate_desc | varchar(256) |  | 字符串 (String) |
| 20 | pk_inspector | 检查人 | pk_inspector | varchar(20) |  | 人员基本信息 (psndoc) |
| 21 | inspect_time | 检查时间 | inspect_time | char(19) |  | 日期时间 (UFDateTime) |
| 22 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 23 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 24 | failure_flag | 已生成故障记录 | failure_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | pk_ownerorg | 设备货主管理组织 | pk_ownerorg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 26 | pk_mandept | 设备管理部门 | pk_mandept | varchar(20) |  | 组织_部门 (dept) |
| 27 | pk_manager | 设备管理人 | pk_manager | varchar(20) |  | 人员基本信息 (psndoc) |
| 28 | pk_usedunit | 设备使用权 | pk_usedunit | varchar(20) |  | 组织 (org) |
| 29 | pk_usedorg | 设备使用管理组织 | pk_usedorg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 30 | pk_usedept | 设备使用部门 | pk_usedept | varchar(20) |  | 组织_部门 (dept) |
| 31 | pk_user | 设备责任人 | pk_user | varchar(20) |  | 人员基本信息 (psndoc) |
| 32 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def21 | 自定义项21 | def21 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def22 | 自定义项22 | def22 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def23 | 自定义项23 | def23 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def24 | 自定义项24 | def24 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def25 | 自定义项25 | def25 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def26 | 自定义项26 | def26 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def27 | 自定义项27 | def27 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def28 | 自定义项28 | def28 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def29 | 自定义项29 | def29 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def30 | 自定义项30 | def30 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def31 | 自定义项31 | def31 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def32 | 自定义项32 | def32 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def33 | 自定义项33 | def33 | varchar(101) |  | 自定义项 (Custom) |
| 65 | def34 | 自定义项34 | def34 | varchar(101) |  | 自定义项 (Custom) |
| 66 | def35 | 自定义项35 | def35 | varchar(101) |  | 自定义项 (Custom) |
| 67 | def36 | 自定义项36 | def36 | varchar(101) |  | 自定义项 (Custom) |
| 68 | def37 | 自定义项37 | def37 | varchar(101) |  | 自定义项 (Custom) |
| 69 | def38 | 自定义项38 | def38 | varchar(101) |  | 自定义项 (Custom) |
| 70 | def39 | 自定义项39 | def39 | varchar(101) |  | 自定义项 (Custom) |
| 71 | def40 | 自定义项40 | def40 | varchar(101) |  | 自定义项 (Custom) |
| 72 | def41 | 自定义项41 | def41 | varchar(101) |  | 自定义项 (Custom) |
| 73 | def42 | 自定义项42 | def42 | varchar(101) |  | 自定义项 (Custom) |
| 74 | def43 | 自定义项43 | def43 | varchar(101) |  | 自定义项 (Custom) |
| 75 | def44 | 自定义项44 | def44 | varchar(101) |  | 自定义项 (Custom) |
| 76 | def45 | 自定义项45 | def45 | varchar(101) |  | 自定义项 (Custom) |
| 77 | def46 | 自定义项46 | def46 | varchar(101) |  | 自定义项 (Custom) |
| 78 | def47 | 自定义项47 | def47 | varchar(101) |  | 自定义项 (Custom) |
| 79 | def48 | 自定义项48 | def48 | varchar(101) |  | 自定义项 (Custom) |
| 80 | def49 | 自定义项49 | def49 | varchar(101) |  | 自定义项 (Custom) |
| 81 | def50 | 自定义项50 | def50 | varchar(101) |  | 自定义项 (Custom) |