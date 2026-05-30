# |<<

**组织实施上报 (scapto_implementreport / nc.vo.scapto.implementmanage.implementreport.ImplementReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5136.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_implementreport | 组织实施上报主键 | pk_implementreport | char(20) | √ | 主键 (UFID) |
| 2 | pk_topicreport | 议题上报主键 | pk_topicreport | varchar(20) |  | 议题上报 (TopicReportVO) |
| 3 | pk_implementstatus | 实施状态 | pk_implementstatus | varchar(20) |  | 实施状态设置 (ImplementStatusVO) |
| 4 | expect | 预期成效 | expect | varchar(1024) |  | 备注 (Memo) |
| 5 | implementstate | 实施情况 | implementstate | varchar(1024) |  | 备注 (Memo) |
| 6 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 7 | pk_org | 决策企业 | pk_org | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 8 | pk_org_v | 决策企业版本 | pk_org_v | varchar(20) |  | 组织_业务单元_行政组织版本信息 (adminorg_v) |
| 9 | pk_dept | 经办部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 10 | pk_dept_v | 经办部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 11 | pk_psndoc | 经办人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | vbillcode | 单据编号 | vbillcode | varchar(50) | √ | 字符串 (String) |
| 13 | vbillname | 单据名称 | vbillname | varchar(1024) |  | 字符串 (String) |
| 14 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |