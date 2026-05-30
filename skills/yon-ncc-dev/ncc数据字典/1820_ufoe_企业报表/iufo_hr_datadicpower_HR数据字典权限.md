# |<<

**HR数据字典权限 (iufo_hr_datadicpower / nc.vo.iufo.hr.hrdatadic.HRDataDicPowerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3456.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datadicpower | HR数据字典权限主键 | pk_datadicpower | char(20) | √ | 主键 (UFID) |
| 2 | pk_meta_id | 表元数据主键 | pk_meta_id | varchar(50) |  | 字符串 (String) |
| 3 | pk_user | 用户 | pk_user | varchar(20) |  | 用户 (user) |
| 4 | pk_role | 角色 | pk_role | varchar(20) |  | 角色 (Role) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |