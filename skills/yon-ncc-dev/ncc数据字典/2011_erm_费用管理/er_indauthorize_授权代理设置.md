# |<<

**授权代理设置 (er_indauthorize / nc.vo.er.indauthorize.IndAuthorizeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1900.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_authorize | 授权代理人主键 | pk_authorize | char(20) | √ | 主键 (UFID) |
| 2 | pk_roler | 授权角色 | pk_roler | varchar(20) |  | 角色 (Role) |
| 3 | pk_user | 业务员 | pk_user | varchar(20) |  | 人员基本信息 (psndoc) |
| 4 | keyword | 关键字 | keyword | char(20) |  | 主键 (UFID) |
| 5 | type | 授权类型 | type | int |  | 整数 (Integer) |
| 6 | pk_operator | 授权的操作员 | pk_operator | varchar(20) |  | 用户 (user) |
| 7 | startdate | 开始日期 | startdate | char(19) |  | 日期 (UFDate) |
| 8 | enddate | 结束日期 | enddate | char(19) |  | 日期 (UFDate) |
| 9 | billtype | 交易类型 | billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 11 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 12 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |