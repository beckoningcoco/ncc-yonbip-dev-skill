# |<<

**维修计划明细 (emm_repair_plan_b / nc.vo.emm.repairplan.RepairPlanBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1821.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repair_plan_b | 维修计划明细 | pk_repair_plan_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_repair_plan_lst | 最新维修计划表头主键 | pk_repair_plan_lst | varchar(20) |  | 字符串 (String) |
| 3 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 4 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 5 | pk_location | 位置 | pk_location | varchar(20) |  | 位置 (location) |
| 6 | plan_type | 计划类型 | plan_type | varchar(256) |  | 字符串 (String) |
| 7 | overhaul_part | 检修部位 | overhaul_part | varchar(80) |  | 字符串 (String) |
| 8 | repair_content | 修理内容 | repair_content | varchar(400) |  | 字符串 (String) |
| 9 | workload | 主要工作量 | workload | varchar(200) |  | 字符串 (String) |
| 10 | start_date | 计划开始日期 | start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 11 | finish_date | 计划结束日期 | finish_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 12 | start_date_orig | 原始计划开始日期 | start_date_orig | char(19) |  | 日期(开始) (UFDateBegin) |
| 13 | remind_date | 提醒日期 | remind_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 14 | plan_cost_mny_org | 计划费用 | plan_cost_mny_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | plan_cost_mny_group | 集团本位币计划费用 | plan_cost_mny_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | plan_cost_mny_global | 全局本位币计划费用 | plan_cost_mny_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | actual_mny_org | 实际费用 | actual_mny_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | actual_mny_group | 集团本位币实际费用 | actual_mny_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | actual_mny_global | 全局本位币实际费用 | actual_mny_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | consign_flag | 委外 | consign_flag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 21 | consign_reason | 委外原因 | consign_reason | varchar(200) |  | 字符串 (String) |
| 22 | pk_provider | 供应商 | pk_provider | varchar(20) |  | 供应商基本信息 (supplier) |
| 23 | pk_mtcon | 维修合同 | pk_mtcon | varchar(20) |  | 维修合同 (mtcon) |
| 24 | principal_dept | 负责部门最新版本 | principal_dept | varchar(20) |  | 组织_部门 (dept) |
| 25 | principal_dept_v | 负责部门 | principal_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 26 | pk_principal | 负责人 | pk_principal | varchar(20) |  | 人员基本信息 (psndoc) |
| 27 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 28 | close_flag | 关闭 | close_flag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 29 | pk_closer | 关闭人 | pk_closer | varchar(20) |  | 用户 (user) |
| 30 | close_date | 关闭时间 | close_date | char(19) |  | 日期时间 (UFDateTime) |
| 31 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 32 | pk_inspection_road | 检修路线 | pk_inspection_road | varchar(20) |  | 检修路线 (InspectionRoadHeadVO) |
| 33 | wo_flag | 是否生成工单 | wo_flag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 34 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 35 | pk_org | 维修组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 36 | pk_org_v | 维修组织 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 37 | src_pk_transitype | 来源交易类型 | src_pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 38 | src_transi_type | 来源交易类型编码 | src_transi_type | varchar(50) |  | 字符串 (String) |
| 39 | src_bill_type | 来源单据类型 | src_bill_type | varchar(30) |  | 字符串 (String) |
| 40 | src_bill_code | 来源单据编码 | src_bill_code | varchar(40) |  | 字符串 (String) |
| 41 | src_rowno | 来源行号 | src_rowno | varchar(30) |  | 字符串 (String) |
| 42 | src_pk_bill | 来源表头主键 | src_pk_bill | varchar(50) |  | 字符串 (String) |
| 43 | src_pk_bill_b | 来源表体主键 | src_pk_bill_b | varchar(50) |  | 字符串 (String) |
| 44 | pk_repair_plan | 维修计划 | pk_repair_plan | varchar(20) |  | 维修计划 (RepairPlanVO) |
| 45 | repair_obj_name | 维修对象 | repair_obj_name | varchar(600) |  | 多语文本 (MultiLangText) |
| 46 | pk_std_job | 标准工作包 | pk_std_job | varchar(20) |  | 标准工作包 (StdJobVO) |
| 47 | head_pk_bill | 源头表头主键 | head_pk_bill | varchar(50) |  | 字符串 (String) |
| 48 | head_pk_bill_b | 源头表体主键 | head_pk_bill_b | varchar(50) |  | 字符串 (String) |
| 49 | head_transi_type | 源头交易类型编码 | head_transi_type | varchar(50) |  | 字符串 (String) |
| 50 | head_bill_code | 源头单据类型编码 | head_bill_code | varchar(50) |  | 字符串 (String) |
| 51 | pk_failure_type | 故障类别 | pk_failure_type | varchar(20) |  | 故障树 (failuretree) |
| 52 | pk_failure_symptom | 故障现象 | pk_failure_symptom | varchar(20) |  | 故障现象 (failuresymptom) |
| 53 | failure_expound | 故障详细说明 | failure_expound | varchar(50) |  | 字符串 (String) |
| 54 | coordinate | 位置点坐标 | coordinate | varchar(100) |  | 字符串 (String) |
| 55 | coordinate_desc | 位置点坐标名称 | coordinate_desc | varchar(200) |  | 字符串 (String) |
| 56 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 65 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 66 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 67 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 68 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 69 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 70 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 71 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 72 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 73 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 74 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 75 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |