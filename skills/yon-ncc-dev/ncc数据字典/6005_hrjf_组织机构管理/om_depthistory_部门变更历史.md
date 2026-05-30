# |<<

**部门变更历史 (om_depthistory / nc.vo.om.hrdept.DeptHistoryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3928.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depthistory | 变更记录主键 | pk_depthistory | char(20) | √ | 主键 (UFID) |
| 2 | pk_dept | 部门主键 | pk_dept | varchar(20) |  | HR部门 (hrdept) |
| 3 | name | 部门名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | code | 部门编码 | code | varchar(40) |  | 字符串 (String) |
| 5 | deptlevel | 部门级别 | deptlevel | varchar(20) |  | 部门级别(自定义档案) (Defdoc-ORG002_0xx) |
| 6 | principal | 部门负责人 | principal | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | approvenum | 批准文号 | approvenum | varchar(50) |  | 字符串 (String) |
| 9 | approvedept | 批准单位 | approvedept | varchar(256) |  | 字符串 (String) |
| 10 | effectdate | 生效日期 | effectdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 11 | changetype | 变更类别 | changetype | varchar(50) |  | 部门变更类别 (DeptChangeType) |  | 1=设立; |