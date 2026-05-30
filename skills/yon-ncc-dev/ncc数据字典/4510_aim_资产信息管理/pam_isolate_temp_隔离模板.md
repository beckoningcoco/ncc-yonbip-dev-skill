# |<<

**隔离模板 (pam_isolate_temp / nc.vo.aim.isolatetemp.IsoTempHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4275.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_isolate_temp | 隔离模板主键 | pk_isolate_temp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 维修组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | pk_org_v | 维修组织 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 5 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 6 | bill_code | 隔离模板编号 | bill_code | varchar(40) |  | 字符串 (String) |
| 7 | templet_name | 隔离模板名称 | templet_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | pk_equip | 隔离设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 9 | pk_location | 隔离位置 | pk_location | varchar(20) |  | 位置 (location) |
| 10 | isolate_obj | 隔离对象 | isolate_obj | varchar(600) |  | 字符串 (String) |
| 11 | isolate_require | 隔离要求 | isolate_require | varchar(200) |  | 字符串 (String) |
| 12 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |