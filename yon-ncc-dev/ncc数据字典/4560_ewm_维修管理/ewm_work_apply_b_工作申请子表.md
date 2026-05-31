# |<<

**工作申请子表 (ewm_work_apply_b / nc.vo.ewm.workapply.WorkApplyBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1976.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_work_apply_b | 工作申请子表主键 | pk_work_apply_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 7 | pk_ownerorg | 设备管理组织 | pk_ownerorg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 8 | pk_mandept | 设备管理部门 | pk_mandept | varchar(20) |  | 组织_部门 (dept) |
| 9 | pk_manager | 设备管理人 | pk_manager | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | pk_usedunit | 设备使用权 | pk_usedunit | varchar(20) |  | 组织 (org) |
| 11 | pk_usedorg | 设备使用管理组织 | pk_usedorg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 12 | pk_usedept | 设备使用部门 | pk_usedept | varchar(20) |  | 组织_部门 (dept) |
| 13 | pk_user | 设备责任人 | pk_user | varchar(20) |  | 人员基本信息 (psndoc) |
| 14 | pk_location | 位置 | pk_location | varchar(20) |  | 位置 (location) |
| 15 | abnormity_time | 异常时间 | abnormity_time | char(19) |  | 日期时间 (UFDateTime) |
| 16 | pk_failure_type | 故障类别 | pk_failure_type | varchar(20) |  | 故障树 (failuretree) |
| 17 | pk_failure_symptom | 故障现象 | pk_failure_symptom | varchar(20) |  | 故障现象 (failuresymptom) |
| 18 | failure_detail | 故障详细说明 | failure_detail | varchar(80) |  | 字符串 (String) |
| 19 | apply_business | 申请事项 | apply_business | varchar(80) |  | 字符串 (String) |
| 20 | consign_flag | 委外 | consign_flag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 21 | consign_reason | 委外原因 | consign_reason | varchar(200) |  | 字符串 (String) |
| 22 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 23 | pk_maintainorg | 维修组织最新版本 | pk_maintainorg | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 24 | pk_maintainorg_v | 维修组织 | pk_maintainorg_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 25 | close_flag | 关闭 | close_flag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 26 | pk_closer | 关闭人 | pk_closer | varchar(20) |  | 用户 (user) |
| 27 | close_date | 关闭时间 | close_date | char(19) |  | 日期时间 (UFDateTime) |
| 28 | make_wo_flag | 已生成工单 | make_wo_flag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 29 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 30 | treat_type | 处理方式 | treat_type | int |  | 处理方式 (TreatTypeEnum) |  | 0=派发工单维修; |