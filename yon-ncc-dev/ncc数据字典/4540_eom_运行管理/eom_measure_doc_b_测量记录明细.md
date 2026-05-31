# |<<

**测量记录明细 (eom_measure_doc_b / nc.vo.eom.measuredoc.MeasuredocBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1844.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_measure_doc_b | 测量记录明细标识 | pk_measure_doc_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_measure_point | 测量点 | pk_measure_point | varchar(20) |  | 测量点 (measpointHeadVO) |
| 6 | pk_measure_point_b | 测量点表体 | pk_measure_point_b | varchar(20) |  | 测量点明细 (measpointBodyVO) |
| 7 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 8 | pk_location | 位置 | pk_location | varchar(20) |  | 位置 (location) |
| 9 | pk_meas_items | 测量项目 | pk_meas_items | varchar(20) |  | 测量项目 (measureitems) |
| 10 | item_describe | 测量项目说明 | item_describe | varchar(80) |  | 字符串 (String) |
| 11 | pk_measuredoc | 测量单位 | pk_measuredoc | varchar(20) |  | 计量单位 (measdoc) |
| 12 | measure_result | 测量结果 | measure_result | varchar(28) |  | 字符串 (String) |
| 13 | pk_surveyor | 测量人 | pk_surveyor | varchar(20) |  | 人员基本信息 (psndoc) |
| 14 | measure_time | 测量时间 | measure_time | char(19) |  | 日期时间 (UFDateTime) |
| 15 | pk_maintainorg | 维修组织最新版本 | pk_maintainorg | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 16 | pk_maintainorg_v | 维修组织 | pk_maintainorg_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 17 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 18 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 19 | work_upper | 操作上限 | work_upper | decimal(20, 8) |  | 数值 (UFDouble) |
| 20 | alert_lower | 预警下限 | alert_lower | decimal(20, 8) |  | 数值 (UFDouble) |
| 21 | work_lower | 操作下限 | work_lower | decimal(20, 8) |  | 数值 (UFDouble) |
| 22 | alert_upper | 预警上限 | alert_upper | decimal(20, 8) |  | 数值 (UFDouble) |
| 23 | wo_flag | 已生成工单 | wo_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 25 | last_meas_time | 上次测量时间 | last_meas_time | char(19) |  | 日期时间 (UFDateTime) |
| 26 | last_meas_result | 上次测量结果 | last_meas_result | varchar(28) |  | 字符串 (String) |
| 27 | result_type | 测量结果类型 | result_type | int |  | 测量结果类型 (MeasRsltType) |  | 0=测量类型; |