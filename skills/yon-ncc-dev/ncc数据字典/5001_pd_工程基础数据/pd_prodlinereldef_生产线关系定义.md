# |<<

**生产线关系定义 (pd_prodlinereldef / nc.vo.pd.prodlinereldef.entity.ProdLineRelDefHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4372.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prodlinereldef | 生产线关系定义 | pk_prodlinereldef | char(20) | √ | 主键 (UFID) |
| 2 | teamcode | 组号 | teamcode | varchar(50) |  | 字符串 (String) |
| 3 | teamname | 组名 | teamname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 7 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 9 | modifiedtime | 最后修改时间 | modifiedtime | varchar(19) |  | 日期时间 (UFDateTime) |