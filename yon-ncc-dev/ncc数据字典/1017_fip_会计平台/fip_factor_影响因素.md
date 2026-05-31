# |<<

**影响因素 (fip_factor / nc.vo.fip.impacfactor.ImpacFactorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2239.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_factor | 对象标识 | pk_factor | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_systypecode | 系统类型 | pk_systypecode | varchar(50) | √ | 字符串 (String) |
| 5 | indexid | 序号 | indexid | int |  | 整数 (Integer) |
| 6 | displaycode | 编码 | displaycode | varchar(50) |  | 字符串 (String) |
| 7 | displayname | 影响因素名称 | displayname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 8 | entityid | 对应基础档案类型 | entityid | varchar(36) | √ | 实体 (entity) |
| 9 | displaytype | 类型样式 | displaytype | int |  | 类型样式 (DisplayType) |  | 0=名称; |