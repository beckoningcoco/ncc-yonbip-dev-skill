# |<<

**作业分割规则设置 (cca_jobsegmentrule / nc.vo.cca.jobsegmentationrules.JobSegmentRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1288.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jobsegmentation | 作业分割规则设置主键 | pk_jobsegmentation | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_org_v | 业务单元多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 4 | setofbookcode | 核算账簿 | setofbookcode | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 5 | rulecode | 规则编码 | rulecode | varchar(50) |  | 字符串 (String) |
| 6 | rulename | 规则名称 | rulename | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | vstartdate | 生效期间 | vstartdate | varchar(20) |  | 会计月份 (accperiodmonth) |
| 8 | venddate | 失效期间 | venddate | varchar(20) |  | 会计月份 (accperiodmonth) |
| 9 | remark | 备注 | remark | varchar(200) |  | 备注 (Memo) |
| 10 | segmentmethod | 分割方法 | segmentmethod | varchar(50) |  | 分割方法 (BreakMethod) |  | 1=权重; |