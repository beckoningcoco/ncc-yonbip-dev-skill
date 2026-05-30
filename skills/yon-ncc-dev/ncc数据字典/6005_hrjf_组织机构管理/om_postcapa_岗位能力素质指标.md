# |<<

**岗位能力素质指标 (om_postcapa / nc.vo.om.post.PostCapaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3956.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post_sub | 主键 | pk_post_sub | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_post | 岗位主键 | pk_post | char(20) |  | 主键 (UFID) |
| 5 | pk_capa | 指标名称 | pk_capa | varchar(20) |  | 能力素质指标 (cpindi) |
| 6 | pk_capa_grade | 要求等级 | pk_capa_grade | varchar(20) |  | 能力素质指标等级 (cpindigrade) |
| 7 | isneed | 是否必须 | isneed | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | weight | 权重 | weight | decimal(16, 2) |  | 数值 (UFDouble) |
| 9 | indicode | 指标编码 | indicode | varchar(50) |  | 字符串 (String) |
| 10 | pk_indi_type | 指标类型 | pk_indi_type | varchar(20) |  | 能力素质指标类型 (cpinditype) |
| 11 | scorestandard | 指标定义/要素 | scorestandard | varchar(1000) |  | 字符串 (String) |