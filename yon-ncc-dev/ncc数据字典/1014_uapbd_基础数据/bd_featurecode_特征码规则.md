# |<<

**特征码规则 (bd_featurecode / nc.vo.bd.feature.featurecode.entity.SkuHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/840.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cskuid | 特征码规则 | cskuid | char(20) | √ | 主键 (UFID) |
| 2 | cskucode | 规则编码 | cskucode | varchar(20) |  | 字符串 (String) |
| 3 | cskuname | 规则名称 | cskuname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | cfclassid | 特征类 | cfclassid | varchar(20) |  | 特征类 (bd_fclass) |
| 5 | bedit | 编码是否可编辑 | bedit | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | nskusize | 编码长度 | nskusize | int |  | 整数 (Integer) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |