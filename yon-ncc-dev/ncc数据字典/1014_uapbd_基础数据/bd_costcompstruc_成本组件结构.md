# |<<

**成本组件结构 (bd_costcompstruc / nc.vo.bd.costcompstruc.entity.CostCompStrucHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/408.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costcompstruc | 成本组件结构 | pk_costcompstruc | char(20) | √ | 主键 (UFID) |
| 2 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | compstruccode | 成本组件结构编码 | compstruccode | varchar(50) |  | 字符串 (String) |
| 5 | compstrucname | 成本组件结构名称 | compstrucname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 7 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 9 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |