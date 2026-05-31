# |<<

**故障工作台子表 (eom_failure_workbench_b / nc.vo.eom.failureworkbench.FailureWorkbenchBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1837.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_failure_b | 故障记录子表主键 | pk_failure_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 7 | pk_location | 位置 | pk_location | varchar(20) |  | 位置 (location) |
| 8 | pk_ownerorg | 设备货主管理组织 | pk_ownerorg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 9 | pk_mandept | 设备管理部门 | pk_mandept | varchar(20) |  | 组织_部门 (dept) |
| 10 | pk_manager | 设备管理人 | pk_manager | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | pk_usedunit | 设备使用权 | pk_usedunit | varchar(20) |  | 组织 (org) |
| 12 | pk_usedorg | 设备使用管理组织 | pk_usedorg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 13 | pk_usedept | 设备使用部门 | pk_usedept | varchar(20) |  | 组织_部门 (dept) |
| 14 | pk_user | 设备责任人 | pk_user | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | trouble_location | 故障部位 | trouble_location | varchar(100) |  | 字符串 (String) |
| 16 | failure_time | 故障发生时间 | failure_time | char(19) |  | 日期时间 (UFDateTime) |
| 17 | restore_time | 故障结束时间 | restore_time | char(19) |  | 日期时间 (UFDateTime) |
| 18 | pk_failure_detect | 故障发现途经 | pk_failure_detect | varchar(20) |  | 故障发现途径 (failuredetect) |
| 19 | validity | 故障有效性 | validity | int |  | 故障有效性 (FailureValidity) |  | 1=有效; |