# |<<

**立项申请 (ipmfund_topicapply / nc.vo.ipmfund.topicapply.TopicapplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3343.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_topicapply | 立项申请主键 | pk_topicapply | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_dept | 申请部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 申请部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 申请人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | vbillcode | 立项编码 | vbillcode | varchar(50) |  | 字符串 (String) |
| 9 | vbillname | 立项名称 | vbillname | varchar(800) |  | 字符串 (String) |
| 10 | investtooutband | 对外投资标的 | investtooutband | varchar(50) |  | 标的公司 (OutBandEnum) |  | 1=是; |