# |<<

**用户权限申请-组织申请 (sm_uppf_orgsub / nc.vo.uap.rbac.pf.UserOrgPermissionSubPFVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5353.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_uppf_orgsub | 主键 | pk_uppf_orgsub | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | enabledate | 生效日期 | enabledate | char(19) |  | 日期 (UFDate) |
| 4 | disabledate | 失效日期 | disabledate | char(19) |  | 日期 (UFDate) |