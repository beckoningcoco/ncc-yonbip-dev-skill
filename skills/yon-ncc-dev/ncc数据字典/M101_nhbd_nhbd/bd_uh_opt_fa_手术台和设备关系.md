# |<<

**手术台和设备关系 (bd_uh_opt_fa / nc.vo.nhbd.res.opttbl.OptTblAndFa)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1061.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_optfa | 主键 | pk_optfa | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code_fa | 编码 | code_fa | varchar(30) |  | 字符串 (String) |
| 5 | pk_farole | 设备角色主键 | pk_farole | varchar(20) |  | 设备角色(自定义档案) (Defdoc-010601) |
| 6 | dt_farole | 设备角色编码 | dt_farole | varchar(50) |  | 字符串 (String) |
| 7 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 8 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |