# |<<

**位置 (pam_location / nc.vo.am.location.LocationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4277.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_location | 主键 | pk_location | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 3 | pk_org_v | 资产组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | location_code | 位置编码 | location_code | varchar(40) |  | 字符串 (String) |
| 6 | location_name | 位置名称 | location_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 7 | fk_parent | 父位置 | fk_parent | varchar(20) |  | 位置 (location) |
| 8 | location_type | 位置类型 | location_type | int |  | 位置类型 (LocationTypeConst) |  | 1=运行位置; |