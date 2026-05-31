# |<<

**点检标准 (emm_pcstd / nc.vo.emm.pcstd.PCStdHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1809.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pcstd | 点检标准 | pk_pcstd | char(20) | √ | 主键 (UFID) |
| 2 | bill_code | 编码 | bill_code | varchar(40) |  | 字符串 (String) |
| 3 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 4 | pcobject | 点检对象 | pcobject | varchar(100) |  | 多语文本 (MultiLangText) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 业务单元最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_org_v | 业务单元 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 8 | pk_editor | 编制人 | pk_editor | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | pk_edit_dept | 编制部门 | pk_edit_dept | varchar(20) |  | 组织_部门 (dept) |
| 10 | pk_edit_dept_v | 编制部门版本 | pk_edit_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 11 | edit_time | 编制日期 | edit_time | char(19) |  | 日期 (UFDate) |
| 12 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 13 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |