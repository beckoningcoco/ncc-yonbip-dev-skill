# |<<

**维度结构 (tb_dimhier / nc.vo.mdm.dim.DimHierarchy)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5713.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | objcode | 编码 | objcode | varchar(50) |  | 字符串 (String) |
| 3 | objname | 名称 | objname | varchar(100) |  | 多语文本 (MultiLangText) |
| 4 | pk_dimdef | 维度定义 | pk_dimdef | char(20) |  | 主键 (UFID) |
| 5 | tableex | 表 | tableex | varchar(90) |  | 字符串 (String) |
| 6 | whereex | 条件 | whereex | varchar(255) |  | 字符串 (String) |
| 7 | joinex | 关联条件 | joinex | varchar(255) |  | 字符串 (String) |
| 8 | strlevelcodes | 层次列表 | strlevelcodes | varchar(90) |  | 字符串 (String) |
| 9 | hasall | all成员 | hasall | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | alllevelname | all层名称 | alllevelname | varchar(100) |  | 字符串 (String) |
| 11 | allmembername | all成员名称 | allmembername | varchar(100) |  | 字符串 (String) |
| 12 | orderbyex | 扩展排序 | orderbyex | varchar(60) |  | 字符串 (String) |
| 13 | stromitlevels | 忽略层 | stromitlevels | varchar(90) |  | 字符串 (String) |
| 14 | sqlpart | SQL部分 | sqlpart | varchar(255) |  | 字符串 (String) |
| 15 | description | 描述 | description | varchar(255) |  | 字符串 (String) |
| 16 | modifiedby | 最后修改人 | modifiedby | varchar(20) |  | 字符串 (String) |
| 17 | createdtime | 创建时间 | createdtime | char(20) |  | 主键 (UFID) |
| 18 | modifiedtime | 最后修改日期 | modifiedtime | char(20) |  | 主键 (UFID) |
| 19 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |