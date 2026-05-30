# |<<

**履历记录 (hi_psndoc_work / nc.vo.hi.psndoc.WorkVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2593.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | begindate | 开始日期 | begindate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 3 | enddate | 结束日期 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 4 | workcorp | 工作单位 | workcorp | varchar(200) | √ | 字符串 (String) |
| 5 | workdept | 部门 | workdept | varchar(200) |  | 字符串 (String) |
| 6 | workjob | 职务 | workjob | varchar(200) |  | 字符串 (String) |
| 7 | workpost | 岗位 | workpost | varchar(200) |  | 字符串 (String) |
| 8 | workduty | 主要职责 | workduty | varchar(256) |  | 字符串 (String) |
| 9 | certifier | 证明人 | certifier | varchar(50) |  | 字符串 (String) |
| 10 | memo | 备注 | memo | varchar(1024) |  | 字符串 (String) |
| 11 | workachive | 主要业绩 | workachive | varchar(256) |  | 字符串 (String) |
| 12 | certiphone | 证明人电话 | certiphone | varchar(20) |  | 字符串 (String) |
| 13 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 14 | lastflag | 最近记录标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | work_addr | 工作地址 | work_addr | varchar(1024) |  | 字符串 (String) |
| 16 | dimission_reason | 离职原因 | dimission_reason | varchar(1024) |  | 字符串 (String) |
| 17 | bg_check | 背景调查 | bg_check | varchar(1024) |  | 字符串 (String) |
| 18 | linkphone | 联系电话 | linkphone | varchar(30) |  | 字符串 (String) |
| 19 | pk_psndoc | 人员主键 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 20 | pk_psnorg | 组织关系主键 | pk_psnorg | varchar(20) |  | 组织关系 (hi_psnorg) |
| 21 | pk_psnjob | 任职主键 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 22 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 23 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 24 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 25 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 26 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 27 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |