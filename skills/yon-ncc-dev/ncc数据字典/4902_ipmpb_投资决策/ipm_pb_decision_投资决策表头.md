# |<<

**投资决策表头 (ipm_pb_decision / nc.vo.ipmpb.decision.InvestDecisionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3189.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_decision | 投资决策表头 | pk_decision | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_dept | 经办部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 经办部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 经办人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 9 | vbillname | 单据名称 | vbillname | varchar(400) |  | 字符串 (String) |
| 10 | pk_projectlib | 项目编码 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 11 | pk_investtype | 投资类型 | pk_investtype | varchar(20) |  | 投资类型 (InvestTypeVO) |
| 12 | vinvesttype | 投资属性 | vinvesttype | varchar(50) |  | 投资属性 (InvesttypeEnum) |  | 1=固定资产投资; |