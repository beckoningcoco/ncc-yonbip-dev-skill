# |<<

**部门主管 (org_orgmanager / nc.vo.om.hrdept.DeptManager)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4108.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orgmanager | 组织主管主键 | pk_orgmanager | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_dept | 部门主键 | pk_dept | char(20) |  | HR部门 (hrdept) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_psndoc | 人员编码 | pk_psndoc | varchar(20) | √ | 人员基本信息 (bd_psndoc) |
| 5 | cuserid | 用户编码 | cuserid | varchar(20) |  | 用户 (user) |
| 6 | principalflag | 负责人 | principalflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | viewprincipal | 查看负责人 | viewprincipal | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | viewotherdirector | 查看其他主管 | viewotherdirector | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | pk_psnjob | 工作记录主键 | pk_psnjob | char(20) |  | 主键 (UFID) |
| 10 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |