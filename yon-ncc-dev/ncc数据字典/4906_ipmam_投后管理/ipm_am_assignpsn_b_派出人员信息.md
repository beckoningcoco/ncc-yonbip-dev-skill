# |<<

**派出人员信息 (ipm_am_assignpsn_b / nc.vo.ipmam.assignpsn.AssignPsnBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3152.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assignpsn_b | 派出人员登记子表主键 | pk_assignpsn_b | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 4 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_行政组织版本信息 (adminorg_v) |
| 5 | pk_dept | 所属部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 所属部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | assignpsn_type | 派出人员类型 | assignpsn_type | varchar(50) |  | 派出人员类型 (AssignPsnEnum) |  | 1=董事; |