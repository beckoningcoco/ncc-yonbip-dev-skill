# |<<

**排会计划 (scapto_meetplan / nc.vo.scapto.premeetingmanage.topicapply.MeetPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5165.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetplan | 排会计划主键 | pk_meetplan | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_decidesubjecttype | 上会类型 | pk_decidesubjecttype | varchar(20) |  | 决策主体类型设置 (DecideSubjectTypeVO) |
| 4 | vschedulingstatus | 排会状态 | vschedulingstatus | varchar(50) |  | 排会状态 (SchedulingStatusEnum) |  | 1=未排会; |