# |<<

**用户权限申请单 (sm_userperm_pf / nc.vo.uap.rbac.pf.UserPermissionPFVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5367.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_urperm_pf | 主键 | pk_urperm_pf | varchar(50) | √ | 字符串 (String) |
| 2 | vbillno | 单据号 | vbillno | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 用户所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | voperatorid | 申请人 | voperatorid | varchar(20) |  | 用户 (user) |
| 5 | vapproveid | 最后审批人 | vapproveid | varchar(20) |  | 用户 (user) |
| 6 | dmakedate | 申请时间 | dmakedate | char(19) |  | 日期时间 (UFDateTime) |
| 7 | vbillstatus | 单据状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |