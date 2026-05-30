# |<<

**设备关键程度 (pam_priority / nc.vo.am.priority.PriorityVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4289.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_priority | 设备关键程度主键 | pk_priority | char(20) | √ | 主键 (UFID) |
| 2 | priority_code | 关键程度编码 | priority_code | varchar(40) |  | 字符串 (String) |
| 3 | priority_name | 关键程度名称 | priority_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 4 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 5 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 6 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pre_flag | 预置标识 | pre_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |