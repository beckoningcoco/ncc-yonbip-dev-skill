# |<<

**特征 (bd_feature / nc.vo.bd.feature.feature.entity.FeatureHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/838.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cfeatureid | 特征 | cfeatureid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | vfeaturecode | 特征编码 | vfeaturecode | varchar(20) |  | 字符串 (String) |
| 5 | vfeaturename | 特征名称 | vfeaturename | varchar(50) |  | 多语文本 (MultiLangText) |
| 6 | fdatatype | 数据类型 | fdatatype | int |  | 数据类型 (datatype) |  | 1=枚举; |