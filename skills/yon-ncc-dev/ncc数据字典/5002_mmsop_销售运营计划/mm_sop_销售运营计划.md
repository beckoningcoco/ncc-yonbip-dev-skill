# |<<

**销售运营计划 (mm_sop / nc.vo.mmsop.sop.entity.SOPVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3784.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sop | SOPID | pk_sop | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vcode | 计划编码 | vcode | varchar(50) |  | 字符串 (String) |
| 6 | vname | 计划名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | fstatusflag | 单据状态 | fstatusflag | int |  | 整数 (Integer) |
| 8 | dbegindate | 计划开始日期 | dbegindate | char(19) |  | 日期(开始) (UFDateBegin) |
| 9 | ibeginyear | 计划开始年度 | ibeginyear | int |  | 整数 (Integer) |
| 10 | ibeginperiod | 计划开始期间 | ibeginperiod | int |  | 整数 (Integer) |
| 11 | denddate | 计划截止日期 | denddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 12 | iendyear | 计划结束年度 | iendyear | int |  | 整数 (Integer) |
| 13 | iendperiod | 计划结束期间 | iendperiod | int |  | 整数 (Integer) |
| 14 | approver | 审核人 | approver | varchar(20) |  | 用户 (user) |
| 15 | taudittime | 审核时间 | taudittime | varchar(19) |  | 日期时间 (UFDateTime) |
| 16 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 17 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 19 | modifiedtime | 最后修改时间 | modifiedtime | varchar(19) |  | 日期时间 (UFDateTime) |