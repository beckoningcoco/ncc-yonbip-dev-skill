# |<<

**模板分组信息 (iufo_dxrela_sort / nc.vo.hbbb.dxrelation.DXRelaSortVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3426.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dxrela_sort | 模板分组信息主键 | pk_dxrela_sort | char(20) | √ | 主键 (UFID) |
| 2 | name | 模板分组名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | parent_id | 上级分组 | parent_id | varchar(20) |  | 模板分组信息 (模板分组信息) |
| 4 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | sealflag | 封存标记 | sealflag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | usedflag | 启用标记 | usedflag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | account | 说明 | account | varchar(1024) |  | 备注 (Memo) |
| 10 | dataorigin | 数据来源 | dataorigin | varchar(50) |  | 字符串 (String) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |