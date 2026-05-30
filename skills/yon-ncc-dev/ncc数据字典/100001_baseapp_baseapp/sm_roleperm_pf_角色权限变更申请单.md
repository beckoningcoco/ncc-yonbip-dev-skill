# |<<

**角色权限变更申请单 (sm_roleperm_pf / nc.vo.uap.rbac.pf.RolePermissionPFVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5342.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_roleperm_pf | 变更单主键 | pk_roleperm_pf | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 单据号 | vbillno | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_role | 角色 | pk_role | varchar(20) | √ | 角色 (Role) |
| 5 | voperatorid | 申请人 | voperatorid | varchar(20) |  | 用户 (user) |
| 6 | dmakedate | 申请时间 | dmakedate | char(19) |  | 日期时间 (UFDateTime) |
| 7 | vapproveid | 最后审批人 | vapproveid | varchar(20) |  | 用户 (user) |
| 8 | dapprovedate | 最后审批时间 | dapprovedate | char(19) |  | 日期时间 (UFDateTime) |
| 9 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 10 | vapprovenote | 审批批语 | vapprovenote | varchar(200) |  | 备注 (Memo) |
| 11 | vbillstatus | 单据状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) | -1 | 0=审批未通过; |