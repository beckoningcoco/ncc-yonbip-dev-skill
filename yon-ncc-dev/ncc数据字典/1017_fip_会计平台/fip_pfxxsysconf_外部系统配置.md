# |<<

**外部系统配置 (fip_pfxxsysconf / nc.vo.fip.pfxxsysconf.PfxxSysConfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2245.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pfxxsysconf | 主键 | pk_pfxxsysconf | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(100) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(100) |  | 字符串 (String) |
| 4 | des_sysname | 目标系统名称 | des_sysname | varchar(50) |  | 字符串 (String) |
| 5 | des_url | 目标系统地址 | des_url | varchar(300) |  | 字符串 (String) |
| 6 | remark | 备注 | remark | varchar(300) |  | 备注 (Memo) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |