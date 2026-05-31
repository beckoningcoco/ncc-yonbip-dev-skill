# |<<

**劳动争议 (hrcm_workdispute / nc.vo.hrcm.disputed.WorkdisputeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2712.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workdispute | 劳动争议主键 | pk_workdispute | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | HR组织主键 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_psnjob | 争议人员 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 4 | vcode | 劳动争议编号 | vcode | varchar(28) | √ | 字符串 (String) |
| 5 | doccurdate | 争议发生日期 | doccurdate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 6 | vreason | 争议缘由 | vreason | varchar(1024) |  | 备注 (Memo) |
| 7 | vrequest | 员工要求 | vrequest | varchar(1024) |  | 备注 (Memo) |
| 8 | composestart | 调解开始时间 | composestart | char(10) |  | 模糊日期 (UFLiteralDate) |
| 9 | composeend | 调解结束时间 | composeend | char(10) |  | 模糊日期 (UFLiteralDate) |
| 10 | iscomposesolve | 调解是否解决 | iscomposesolve | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | vsolvememo | 调解结果摘要 | vsolvememo | varchar(1024) |  | 备注 (Memo) |
| 12 | begindate | 仲裁开始日期 | begindate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 13 | enddate | 仲裁结束日期 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 14 | isintercesolve | 仲裁是否解决 | isintercesolve | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | vintermemo | 仲裁结果摘要 | vintermemo | varchar(1024) |  | 备注 (Memo) |
| 16 | lawstartdate | 诉讼开始日期 | lawstartdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 17 | lawenddate | 诉讼结束日期 | lawenddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 18 | isclawsolve | 诉讼是否解决 | isclawsolve | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | vlawmemo | 诉讼结果摘要 | vlawmemo | varchar(1024) |  | 备注 (Memo) |
| 20 | vaboutmemo | 相关方案记录 | vaboutmemo | varchar(1024) |  | 备注 (Memo) |
| 21 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 22 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 23 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 24 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 25 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |