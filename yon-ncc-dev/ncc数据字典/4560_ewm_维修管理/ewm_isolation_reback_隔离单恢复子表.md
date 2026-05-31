# |<<

**隔离单恢复子表 (ewm_isolation_reback / nc.vo.ewm.isolation.IsolationRebackBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1928.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_iso_reback | 隔离单恢复子表主键 | pk_iso_reback | char(20) | √ | 主键 (UFID) |
| 2 | sequence_num | 序号 | sequence_num | varchar(50) |  | 字符串 (String) |
| 3 | pk_equip | 操作设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 4 | pk_ownerorg | 设备管理组织 | pk_ownerorg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 5 | pk_mandept | 设备管理部门 | pk_mandept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_manager | 设备管理人 | pk_manager | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | pk_usedunit | 设备使用权 | pk_usedunit | varchar(20) |  | 组织 (org) |
| 8 | pk_usedorg | 设备使用管理组织 | pk_usedorg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 9 | pk_usedept | 设备使用部门 | pk_usedept | varchar(20) |  | 组织_部门 (dept) |
| 10 | pk_user | 设备责任人 | pk_user | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | pk_location | 操作位置 | pk_location | varchar(20) |  | 位置 (location) |
| 12 | operate_obj | 操作对象 | operate_obj | varchar(600) |  | 字符串 (String) |
| 13 | require_status | 要求状态 | require_status | int |  | 要求状态 (enum) |  | 0=开; |