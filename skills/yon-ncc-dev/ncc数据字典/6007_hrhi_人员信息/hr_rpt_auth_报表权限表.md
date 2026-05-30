# |<<

**报表权限表 (hr_rpt_auth / nc.vo.hi.repdef.RepAuthVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2694.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rpt_auth | 主键 | pk_rpt_auth | char(20) | √ | 主键 (UFID) |
| 2 | auth | 权限 | auth | int |  | 整数 (Integer) |
| 3 | pk_rpt_def | 报表定义主键 | pk_rpt_def | char(20) |  | 主键 (UFID) |
| 4 | refpk | 组织或角色主键 | refpk | char(20) |  | 主键 (UFID) |
| 5 | pk_org | 所属业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | authtype | 权限类型 | authtype | int |  | 权限类型 (auth_type) |  | 1=用户; |