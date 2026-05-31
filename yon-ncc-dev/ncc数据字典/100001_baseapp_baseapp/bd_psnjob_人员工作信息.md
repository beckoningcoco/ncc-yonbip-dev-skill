# |<<

**人员工作信息 (bd_psnjob / nc.vo.bd.psn.PsnjobVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/946.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psnjob | 人员工作信息主键 | pk_psnjob | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 任职业务单元 | pk_org | char(20) | √ | 组织 (org) |
| 4 | psncode | 员工编号 | psncode | varchar(40) | √ | 字符串 (String) |
| 5 | pk_psncl | 人员类别 | pk_psncl | varchar(20) | √ | 人员类别 (psncl) |
| 6 | pk_dept | 所在部门 | pk_dept | varchar(20) | √ | 组织_部门 (dept) |
| 7 | ismainjob | 主职 | ismainjob | char(1) | √ | 布尔类型 (UFBoolean) |
| 8 | indutydate | 任职开始日期 | indutydate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 9 | enddutydate | 任职结束日期 | enddutydate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 10 | pk_job | 职务 | pk_job | varchar(20) |  | 人力资源管理_职务 (job) |
| 11 | jobname | 职务称谓 | jobname | varchar(50) |  | 字符串 (String) |
| 12 | pk_post | 岗位 | pk_post | varchar(20) |  | 人力资源管理_岗位 (post) |
| 13 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |