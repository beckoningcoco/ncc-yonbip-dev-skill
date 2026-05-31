# |<<

**折算规则分类 (ufoc_convertrulesort / nc.vo.ufoc.convertrule_sort.ConvertRuleSortVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5869.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cvtrulesort | 主键 | pk_cvtrulesort | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 3 | parent_id | 上级分组 | parent_id | varchar(20) |  | 折算规则分类 (ConvertRuleSortVO) |
| 4 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | note | 说明 | note | varchar(1024) |  | 备注 (Memo) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |