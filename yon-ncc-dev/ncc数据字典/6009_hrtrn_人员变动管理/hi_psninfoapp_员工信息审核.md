# |<<

**员工信息审核 (hi_psninfoapp / nccloud.dto.hryf.psninfo.PsnInfoApproveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2595.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psninfoapprove | 主键 | pk_psninfoapprove | varchar(50) | √ | 字符串 (String) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 4 | pk_applicant | 申请人 | pk_applicant | varchar(20) |  | 用户 (user) |
| 5 | applydate | 申请日期 | applydate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 6 | oldvalue | 旧值 | oldvalue | image |  | BLOB (BLOB) |
| 7 | newvalue | 新值 | newvalue | image |  | BLOB (BLOB) |
| 8 | pk_psndoc | 变更职员主键 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 9 | pk_psnjob | 变更职员工作记录主键 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 10 | submitdate | 提交日期 | submitdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 11 | checkstatus | 审核状态 | checkstatus | int |  | 整数 (Integer) |
| 12 | readstatus | 预览状态 | readstatus | int |  | 整数 (Integer) |
| 13 | errmsg | 错误信息 | errmsg | varchar(50) |  | 字符串 (String) |
| 14 | pk_infoset | 修改的信息集主键 | pk_infoset | varchar(20) |  | 信息集 (InfoSet) |
| 15 | pk_checkuser | 审核人 | pk_checkuser | varchar(20) |  | 用户 (user) |
| 16 | checknote | 审核意见 | checknote | varchar(50) |  | 字符串 (String) |
| 17 | checkdate | 审核日期 | checkdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 21 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |