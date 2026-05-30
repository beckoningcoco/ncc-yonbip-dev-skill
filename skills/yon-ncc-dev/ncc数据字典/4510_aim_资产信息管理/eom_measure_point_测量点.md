# |<<

**测量点 (eom_measure_point / nc.vo.am.measurepoint.MeaspointHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1845.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_measure_point | 测量点标识 | pk_measure_point | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 6 | point_code | 编码 | point_code | varchar(40) |  | 字符串 (String) |
| 7 | point_name | 名称 | point_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 9 | pk_location | 位置 | pk_location | varchar(20) |  | 位置 (location) |
| 10 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |