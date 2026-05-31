# |<<

**设备状态 (pam_status / nc.vo.am.status.StatusVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4328.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_status | 状态主键 | pk_status | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | status_code | 状态编码 | status_code | varchar(40) |  | 字符串 (String) |
| 5 | status_name | 状态名称 | status_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 6 | status_type | 状态分类 | status_type | int |  | 设备状态类型 (EquipStatusConst) |  | 0=在用; |