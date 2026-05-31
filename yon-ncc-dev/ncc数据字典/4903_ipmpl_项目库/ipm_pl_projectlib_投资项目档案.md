# |<<

**投资项目档案 (ipm_pl_projectlib / nc.vo.ipmpl.projectlib.ProjectLibVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3205.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projectlib | 投资项目档案主键 | pk_projectlib | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_dept | 立项部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 立项部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 立项人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | vbillcode | 项目编码 | vbillcode | varchar(50) |  | 字符串 (String) |
| 9 | vbillname | 项目名称 | vbillname | varchar(200) |  | 多语文本 (MultiLangText) |
| 10 | pk_investtype | 投资类型 | pk_investtype | varchar(20) |  | 投资类型 (InvestTypeVO) |
| 11 | vinvesttype | 投资属性 | vinvesttype | varchar(50) |  | 投资属性 (InvesttypeEnum) |  | 1=固定资产投资; |