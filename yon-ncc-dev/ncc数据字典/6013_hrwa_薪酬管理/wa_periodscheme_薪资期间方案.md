# |<<

**薪资期间方案 (wa_periodscheme / nc.vo.wa.period.PeriodSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6344.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_periodscheme | 薪资期间方案主键 | pk_periodscheme | char(20) | √ | 主键 (UFID) |
| 2 | code | 方案编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 方案名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | vmemo | 方案描述 | vmemo | varchar(1024) |  | 字符串 (String) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |