# |<<

**议题上报 (scapto_topicreport / nc.vo.scapto.topicmanage.topicreport.TopicReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5198.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_topicreport | 议题上报主键 | pk_topicreport | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 决策企业 | pk_org | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 4 | pk_org_v | 决策企业版本 | pk_org_v | varchar(20) |  | 组织_业务单元_行政组织版本信息 (adminorg_v) |
| 5 | pk_dept | 经办部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 经办部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 经办人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | vbillcode | 单据编号 | vbillcode | varchar(50) | √ | 字符串 (String) |
| 9 | vbillname | 单据名称 | vbillname | varchar(1024) |  | 多语文本 (MultiLangText) |
| 10 | pk_meetreport | 会议上报 | pk_meetreport | varchar(20) |  | 会议上报 (MeetingReportVO) |
| 11 | pk_meettopic | 议题信息 | pk_meettopic | varchar(20) |  | 议题信息 (MeetReportTopicVO) |
| 12 | vtopiccode | 议题编号 | vtopiccode | varchar(64) |  | 字符串 (String) |
| 13 | vtopicname | 议题名称 | vtopicname | varchar(1024) |  | 字符串 (String) |
| 14 | pk_tasksource | 任务来源 | pk_tasksource | varchar(20) |  | 任务来源设置 (TaskSourceVO) |
| 15 | vtasksource | 任务来源名称 | vtasksource | varchar(1024) |  | 字符串 (String) |
| 16 | pk_specialtask | 专项任务 | pk_specialtask | varchar(20) |  | 专项任务设置 (SpecialTaskVO) |
| 17 | vspecialtaskname | 专项名称 | vspecialtaskname | varchar(1024) |  | 字符串 (String) |
| 18 | pk_matterlistreport | 事项清单上报 | pk_matterlistreport | varchar(20) |  | 事项清单上报 (MatterlistReportVO) |
| 19 | pk_matterrecord | 事项编码 | pk_matterrecord | varchar(20) |  | 事项记录 (MatterRecordVO) |
| 20 | pk_enterprise | 关联决策企业 | pk_enterprise | varchar(20) |  | 企业信息管理 (EnterpriseVO) |
| 21 | pk_meettopic_ref | 关联议题 | pk_meettopic_ref | varchar(20) |  | 议题上报 (TopicReportVO) |
| 22 | pk_meetreport_ref | 关联会议 | pk_meetreport_ref | varchar(20) |  | 会议上报 (MeetingReportVO) |
| 23 | vtopicpassstate | 是否通过 | vtopicpassstate | varchar(50) |  | 议题通过状态 (TopicPassStateEnum) |  | 1=通过; |