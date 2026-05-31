# |<<

**医技资源与设备关系 (bd_uh_msp_fa / nc.vo.nhbd.res.MedSrvPFaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1059.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mspfa | 主键 | pk_mspfa | char(20) | √ | 主键 (UFID) |
| 2 | pk_msp | 医技资源设备主键 | pk_msp | char(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | code_fa | 设备编码 | code_fa | varchar(50) |  | 字符串 (String) |
| 7 | pk_farole | 设备角色主键 | pk_farole | varchar(20) |  | 设备角色(自定义档案) (Defdoc-010601) |
| 8 | dt_farole | 设备角色编码 | dt_farole | varchar(50) |  | 字符串 (String) |
| 9 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 10 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |