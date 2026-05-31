# |<<

**网银服务器配置主表 (ebank_srvconf / nc.vo.obm.serverconfig.ServerConfigHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1782.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvconf | 网银服务器配置主表主键 | pk_srvconf | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 5 | ip | ip地址 | ip | varchar(50) |  | 字符串 (String) |
| 6 | overtime | 超时 | overtime | int |  | 整数 (Integer) |
| 7 | port | 端口 | port | varchar(50) |  | 字符串 (String) |
| 8 | servelt | servelt服务 | servelt | varchar(50) |  | 字符串 (String) |
| 9 | srvid | 服务器编码 | srvid | varchar(50) |  | 字符串 (String) |
| 10 | usestate | 启用状态 | usestate | varchar(50) |  | 启用状态 (usestate) |  | 0=未启用; |