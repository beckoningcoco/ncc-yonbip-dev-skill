# |<<

**网银服务器配置子表 (ebank_srvconf_b / nc.vo.obm.serverconfig.ServerConfigItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1783.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvconf_b | 网银服务器配置子表主键 | pk_srvconf_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 所属版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 5 | bankname | 银行名称 | bankname | varchar(100) |  | 字符串 (String) |
| 6 | banktype | 银行编码 | banktype | varchar(50) |  | 字符串 (String) |
| 7 | netbankinftpcode | 银行接口类型 | netbankinftpcode | varchar(50) | √ | 网银接口类别 (netbankinftpcode) |  | 00015=工商银行; |