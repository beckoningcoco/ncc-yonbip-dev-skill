# |<<

**组织委托关系 (hr_relation_org / nc.vo.hr.managescope.HrRelationOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2692.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation_org | 组织委托关系主键 | pk_relation_org | char(20) | √ | 主键 (UFID) |
| 2 | pk_hrorg | 人力资源组织 | pk_hrorg | varchar(20) |  | 人力资源组织 (hrhrorg) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(20) |  | 组织 (org) |
| 5 | business_type | 业务类型 | business_type | varchar(20) |  | 字符串 (String) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |