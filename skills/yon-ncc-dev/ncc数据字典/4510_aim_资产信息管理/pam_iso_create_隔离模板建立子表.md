# |<<

**隔离模板建立子表 (pam_iso_create / nc.vo.aim.isolatetemp.IsoCreateBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4273.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_iso_create | 隔离模板建立子表主键 | pk_iso_create | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 维修组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | pk_org_v | 维修组织 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 5 | sequence_num | 序号 | sequence_num | varchar(50) |  | 字符串 (String) |
| 6 | pk_equip | 操作设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 7 | pk_location | 操作位置 | pk_location | varchar(20) |  | 位置 (location) |
| 8 | operate_obj | 操作对象 | operate_obj | varchar(600) |  | 字符串 (String) |
| 9 | require_status | 要求状态 | require_status | int |  | 要求状态 (enum) |  | 0=开; |