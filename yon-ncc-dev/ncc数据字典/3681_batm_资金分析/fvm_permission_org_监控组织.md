# |<<

**监控组织 (fvm_permission_org / nc.vo.batm.permissionconfig.PermissionOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2333.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_permission_org | 监控组织主键 | pk_permission_org | char(20) | √ | 主键 (UFID) |
| 2 | pk_permission_role | 监控角色主键 | pk_permission_role | char(20) |  | 主键 (UFID) |
| 3 | pk_role | 角色主键 | pk_role | varchar(20) |  | 角色 (Role) |
| 4 | pk_fundmanasystem | 资金管理体系主键 | pk_fundmanasystem | varchar(20) |  | 组织结构_资金管理体系 (fundmanasystem) |
| 5 | pk_fmsmember | 资金管理体系成员主键 | pk_fmsmember | varchar(20) |  | 组织结构_资金管理体系成员 (fundmanasystemmember) |
| 6 | pk_org | 对应组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 8 | pk_fathermember | 上级成员 | pk_fathermember | varchar(20) |  | 组织结构_资金管理体系成员 (fundmanasystemmember) |
| 9 | permissiontype | 授权类型 | permissiontype | int |  | 授权类型 (enum) |  | 1=全局; |