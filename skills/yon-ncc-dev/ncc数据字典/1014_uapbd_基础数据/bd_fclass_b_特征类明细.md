# |<<

**特征类明细 (bd_fclass_b / nc.vo.bd.feature.fclass.entity.FclassBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/837.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cfeatureclsbid | 特征类明细 | cfeatureclsbid | char(20) | √ | 主键 (UFID) |
| 2 | vrowno | 行号 | vrowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | cchildfclsid | 特征类 | cchildfclsid | varchar(20) |  | 特征类 (bd_fclass) |
| 5 | cfeatureid | 特征 | cfeatureid | varchar(20) |  | 特征 (bd_feature) |
| 6 | brequired | 必输 | brequired | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | fenable | 启用状态 | fenable | int |  | 启用状态 (enablestatus) | 0 | 0=已启用; |