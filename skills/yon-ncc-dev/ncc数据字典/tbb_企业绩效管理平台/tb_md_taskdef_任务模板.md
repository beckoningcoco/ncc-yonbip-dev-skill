# |<<

**任务模板 (tb_md_taskdef / nc.vo.tb.task.MdTaskDef)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5731.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | objname | 名称 | objname | varchar(100) |  | 字符串 (String) |
| 3 | pk_uplevel | 目录 | pk_uplevel | varchar(20) |  | 任务模板 (tbb_taskdef) |
| 4 | tasktype | 任务类型 | tasktype | varchar(1) |  | 字符串 (String) |
| 5 | pk_workbook | 套表 | pk_workbook | varchar(20) |  | 字符串 (String) |
| 6 | pk_orgstruct | 组织体系 | pk_orgstruct | varchar(20) |  | 字符串 (String) |
| 7 | description | 备注 | description | text(0) |  | BLOB (BLOB) |
| 8 | pk_transtype | 交易类型 | pk_transtype | varchar(20) |  | 字符串 (String) |
| 9 | pk_org | 创建组织 | pk_org | varchar(20) |  | 组织 (org) |
| 10 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | busisystem | 创建系统 | busisystem | varchar(20) |  | 字符串 (String) |
| 12 | avabusisystem | 可用系统 | avabusisystem | varchar(20) |  | 字符串 (String) |
| 13 | ischeckaccount | 帐表一致性检查 | ischeckaccount | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | pk_accounttype | 账簿类型 | pk_accounttype | varchar(20) |  | 字符串 (String) |
| 15 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 16 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 17 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 18 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |