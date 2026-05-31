# |<<

**能力素质指标类别 (hr_cindex_type / nc.vo.hr.competencyindex.CompetencyindexTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2657.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cindex_type | 能力素质指标级别主键 | pk_cindex_type | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(20) | √ | 主键 (UFID) |
| 3 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | memo | 描述 | memo | varchar(1000) |  | 字符串 (String) |
| 5 | pk_fathertype | 上级类别 | pk_fathertype | varchar(20) |  | 能力素质指标类别 (CompetencyindexType) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |