# |<<

**能力素质指标等级 (hr_cindex_grade / nc.vo.hr.competencyindex.CompetencyindexGradeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2656.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cindex_grade | 能力素质指标等级主键 | pk_cindex_grade | char(20) | √ | 主键 (UFID) |
| 2 | code | 级别编号 | code | int | √ | 整数 (Integer) |
| 3 | name | 级别名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | memo | 级别说明 | memo | varchar(1000) |  | 字符串 (String) |
| 5 | pk_cindex | 能力素质指标 | pk_cindex | varchar(20) |  | 能力素质指标 (Competencyindex) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |